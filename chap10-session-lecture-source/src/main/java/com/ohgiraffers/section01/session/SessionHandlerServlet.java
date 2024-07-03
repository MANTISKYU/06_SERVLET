package com.ohgiraffers.section01.session;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/session")
public class SessionHandlerServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        System.out.println("session firstName : "+firstName);
        System.out.println("session lastName : "+lastName);

//        response.sendRedirect("redirect");

        HttpSession session = request.getSession();

        session.setMaxInactiveInterval(60*10);
        System.out.println("변경후 session 유지 시간 : " + session.getMaxInactiveInterval());

        System.out.println("session id : " + session.getId());

        session.setAttribute("firstName", firstName);
        session.setAttribute("lastName", lastName);

        response.sendRedirect("redirect");

    }
}
