package com.accenture.flowershop.fe.servlets.user;

import com.accenture.flowershop.be.business.user.UserBusinessService;
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

        PrintWriter out = response.getWriter();

        String username = request.getParameter("inputUsername");
        String password = request.getParameter("inputPassword");
        User u = ubs.login(username,password);

        if (u != null) {
            HttpSession session = request.getSession();
            session.setAttribute("u", u);
            session.setAttribute("un", username);
            session.setAttribute("disc", u.getDiscount());
            session.setAttribute("bal", u.getBalance());
            session.setAttribute("fullname", u.getFullName());
            session.setAttribute("city", u.getCity());
            session.setAttribute("zipcode", u.getZipcode());
            session.setAttribute("address", u.getAddress());
            if (!ubs.getInfo(username).isAdmin()) {
                response.sendRedirect("profile");
            } else {
                response.sendRedirect("orders");
            }
        } else {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Incorrect username or password');");
            out.println("location='login.jsp';");
            out.println("</script>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req, resp);

    }
}
