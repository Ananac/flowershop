package com.accenture.flowershop.fe.servlets.user;

import com.accenture.flowershop.be.business.flower.FlowerBusinessService;
import com.accenture.flowershop.be.business.user.UserBusinessService;
import com.accenture.flowershop.be.entity.order.OrderItem;
import com.accenture.flowershop.be.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/profile")
public class ProfileServlet extends HttpServlet {
    @Autowired
    UserBusinessService ubs;
    @Autowired
    FlowerBusinessService fbs;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());

    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        User u = (User) session.getAttribute("u");
        try {
            u.getUsername();
            session.setAttribute("bal", u.getBalance());
            req.getRequestDispatcher("/profile.jsp").forward(req, resp);
        } catch (NullPointerException e) {
            resp.sendRedirect("login");
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        User u = (User) session.getAttribute("u");
        try {
            u.getUsername();
            session.setAttribute("bal", u.getBalance());
            session.setAttribute("total", 0);
            session.setAttribute("disct", 0);

            List<OrderItem> cart = (List<OrderItem>) session.getAttribute("cart");
            session.setAttribute("c", cart);

            for (OrderItem item : cart) {
                try {
                    fbs.updateFlowersQuantity(item.getFlower().getId(), item.getAmount());
                } catch (NumberFormatException e) {
                    continue;
                }
            }

            req.getRequestDispatcher("/profile.jsp").forward(req, resp);
        } catch (NullPointerException e) {
            resp.sendRedirect("login");
        }
    }
}