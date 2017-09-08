package com.accenture.flowershop.fe.servlets.user;

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
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/profile")
public class ProfileServlet extends HttpServlet {
    @Autowired
    UserBusinessService ubs;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.getRequestDispatcher("/profile.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        session.setAttribute("total", 0);
        session.setAttribute("disct", 0);
//        String username = session.getAttribute("un").toString();//
//        User u = ubs.getInfo(username);
//        req.setAttribute("un", u.getUsername());
//        req.setAttribute("bal", u.getBalance());
//        req.setAttribute("disc", u.getDiscount());

        List<OrderItem> cart = (List<OrderItem>) session.getAttribute("cart");
        session.setAttribute("c", cart);
        req.getRequestDispatcher("/profile.jsp").forward(req, resp);


    }

}