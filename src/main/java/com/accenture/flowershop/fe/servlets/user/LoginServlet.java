package com.accenture.flowershop.fe.servlets.user;

import com.accenture.flowershop.be.business.user.UserBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Autowired
    UserBusinessService ubs;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("inputUsername");
        String password = request.getParameter("inputPassword");


        try {
            if (!username.equals("") || !password.equals("")) {
                if (!ubs.login(username, password).equals(null)) {
                    response.sendRedirect("successPage.html");
                }
            } else {
                response.sendRedirect("login");
            }

        } catch (NullPointerException e) {
            response.sendRedirect("login");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req, resp);

    }
}
