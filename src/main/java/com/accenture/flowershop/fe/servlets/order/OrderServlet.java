package com.accenture.flowershop.fe.servlets.order;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/order")

public class OrderServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.getRequestDispatcher("/order.jsp").forward(req, resp);
        } catch (NullPointerException e) {
            return;
        }
    }
}


//    HttpSession session = req.getSession(false);
//
//    List<OrderItem> cart = (List<OrderItem>) session.getAttribute("cart");
//        if (cart == null) {
//                cart = new ArrayList<OrderItem>);
//        }
//
//        Integer amount;
//        List<Flower> flowers = service.getAllFlowers();
//
//        for (Flower flower : flowers) {
//        long id = flower.getId();
//        try {
//        amount = Integer.parseInt(req.getParameter(String.valueOf(flower.getId())));
//        } catch (NumberFormatException ex) {
//        continue;
//        }
//
//        if (!(amount > 0 && service.haveAmount(id, amount))) {
//        continue;
//        }
//
//        OrderItem item = new OrderItem(flower, amount);
//        int index = cart.indexOf(item);
//        if (index == -1) {
//        cart.add(item);
//        } else {
//        amount += cart.get(index).getAmount();
//        if (service.haveAmount(id, amount)) {
//        cart.get(index).setAmount(amount);
//        }
//        }
//        }
//
//        session.setAttribute("cart", cart);
//        BigDecimal total = BigDecimal.ZERO;
//        for (OrderItem item : cart) {
//        total.add(item.getSubTotal());
//        }
//        session.setAttribute("total", total);
//
//        resp.sendRedirect("/profile/cart");