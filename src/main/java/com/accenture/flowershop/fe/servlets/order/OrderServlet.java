package com.accenture.flowershop.fe.servlets.order;

import com.accenture.flowershop.be.business.order.OrderBusinessService;
import com.accenture.flowershop.be.business.user.UserBusinessService;
import com.accenture.flowershop.be.entity.order.Order;
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
import java.math.BigDecimal;
import java.util.List;

@WebServlet(urlPatterns = "/order")

public class OrderServlet extends HttpServlet {
    @Autowired
    OrderBusinessService obs;
    @Autowired
    UserBusinessService ubs;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
        HttpSession session = req.getSession(false);
        User u = (User) session.getAttribute("u");
            u.getUsername();
            List<Order> orderslist = obs.getOrdersByUser(u);
            session.setAttribute("order", orderslist);

            req.getRequestDispatcher("/order.jsp").forward(req, resp);
        } catch (NullPointerException e) {
            resp.sendRedirect("login");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
        HttpSession session = req.getSession(false);
        User u = (User) session.getAttribute("u");
            u.getUsername();
            BigDecimal total = (BigDecimal) session.getAttribute("total");
            obs.newOrder(u, total);
            u = ubs.updateBalance(u.getUsername(), total);
            session.setAttribute("u", u);
            session.setAttribute("bal", u.getBalance());

            List<Order> ordersList = obs.getOrdersByUser(u);
            session.setAttribute("order", ordersList);

            session.setAttribute("total", BigDecimal.ZERO);
            session.setAttribute("disct", 0);
            session.removeAttribute("c");

            req.getRequestDispatcher("/order.jsp").forward(req, resp);
        } catch (NullPointerException e) {
            resp.sendRedirect("login");
        }
    }
}


