package com.ohgiraffers.section02.sessionlistener;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/session")
public class SessionListenerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        System.out.println("발급받은 session id : " + session.getId());

        // session 만료하게 되면 sessionDestroyed()가 동작한다.
//        session.setMaxInactiveInterval(5); --> 5초 후 꺼짐
//        session.invalidate(); --> 바로 꺼짐

        session.setAttribute("username", "honggildong");
        session.setAttribute("age", "20");

        session.setAttribute("user", new UserDTO("honggildong", 20));

        // session attribute에 동일한 키로 덮어 쓰는 경우 attributeReplaced 메소드가 실행
        session.setAttribute("username", "hong");

        // session attribute를 제거할 때 attributeRemoved() 가 동작한다.
        session.removeAttribute("username");

    }


}
