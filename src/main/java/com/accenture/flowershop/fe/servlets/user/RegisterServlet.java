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
import java.io.PrintWriter;

import static java.lang.Integer.parseInt;


@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    @Autowired
    UserBusinessService ubs;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        String username = request.getParameter("inputUsername");
        String password = request.getParameter("inputPassword");
        String fullName = request.getParameter("inputFullName");
        String city = request.getParameter("inputCity");

        String zip = request.getParameter("inputZipcode");
        int zipcode = parseInt(zip);

        String address = request.getParameter("inputAddress");

        try {
            ubs.register(username, password, fullName, city, zipcode, address).equals(null);
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Successfully registered');");
            out.println("location='login';");
            out.println("</script>");

        } catch (NullPointerException e) {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Username already exists');");
            out.println("location='register';");
            out.println("</script>");

        }
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("register.jsp").forward(req, resp);

    }
}

