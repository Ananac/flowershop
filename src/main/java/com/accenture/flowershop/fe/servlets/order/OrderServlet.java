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
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.List;

@WebServlet(urlPatterns = "/order")

public class OrderServlet extends HttpServlet {
    @Autowired
    OrderBusinessService obs;
    UserBusinessService ubs;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        User u = (User) session.getAttribute("u");

        List<Order> orderslist = obs.getOrdersByUser(u);
        session.setAttribute("order", orderslist);

        req.getRequestDispatcher("/order.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        User u = (User) session.getAttribute("u");
        BigDecimal total = (BigDecimal) session.getAttribute("total");
        obs.newOrder(u, total);
     //   ubs.updateBalance(u.getUsername(), total);

        List<Order> orderslist = obs.getOrdersByUser(u);

        session.setAttribute("order", orderslist);

        session.setAttribute("total", 0);
        session.setAttribute("disct", 0);
        session.removeAttribute("c");

        req.getRequestDispatcher("/order.jsp").forward(req, resp);

    }
}


