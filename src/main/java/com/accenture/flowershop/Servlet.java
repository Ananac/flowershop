package com.accenture.flowershop;

import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

public class Servlet extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException {
        String res = "";
        String sep = System.getProperty("line.separator");
        try {
            Class.forName("org.h2.Driver");
            Connection cn = DriverManager.getConnection("jdbc:h2:~/flowershop", "sa", "");

            Statement statement = cn.createStatement();
            ResultSet r = statement.executeQuery("SELECT * FROM FLOWERS");
            while (r.next()) {
                res += sep + r.getInt("id") + " " + r.getString("name") + " " + r.getString("description") + " " + r.getInt("quantity");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        httpServletResponse.getWriter().print("Flowers:" + res);
    }
}