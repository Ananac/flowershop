package com.accenture.flowershop.fe.servlets.order;

import com.accenture.flowershop.be.business.order.OrderBusinessService;
import com.accenture.flowershop.be.entity.flower.Flower;
import com.accenture.flowershop.be.entity.order.Order;
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

@WebServlet(urlPatterns = "/orders")
public class AdminServlet extends HttpServlet {
    @Autowired
    OrderBusinessService obs;

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
            if (u.isAdmin()) {

                List<Order> orderslist = obs.getAllOrders();
                session.setAttribute("order", orderslist);

                req.getRequestDispatcher("/orders.jsp").forward(req, resp);
            } else {
                resp.sendRedirect("index.jsp");
            }
        } catch (NullPointerException e) {
            resp.sendRedirect("index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        User u = (User) session.getAttribute("u");
        try {
            if (u.isAdmin()) {
                List<Order> orders = obs.getAllOrders();

                for (Order order : orders) {
                    String isPushed = req.getParameter("close" + order.getId());
                    if (isPushed != null) {
                        obs.completeOrder(order.getId());
                        resp.sendRedirect("orders");
                    }
                }
            } else {
                resp.sendRedirect("index.jsp");
            }
        } catch (NullPointerException e) {
            resp.sendRedirect("index.jsp");
        }
    }
}


