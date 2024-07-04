package com.ohgiraffers.section01;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/member")
public class MemberServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("요청 오는지 확인");
        String name = request.getParameter("name");
        System.out.println(name);

        String fullName = "이" + name;
        request.setAttribute("fullName", fullName);

        Member member = new Member(20, "홍길동");
        request.setAttribute("member", member);

        HttpSession session = request.getSession();
        session.setAttribute("fullName", "홍홍길길동동꾸러기닌자닌닌");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/testForward.jsp");
        dispatcher.forward(request,response);

    }
}
