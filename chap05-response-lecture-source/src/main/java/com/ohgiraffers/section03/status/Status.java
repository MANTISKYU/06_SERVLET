package com.ohgiraffers.section03.status;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/status")
public class Status extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.sendError(404, "없는 페이지입니다. 경로를 확인해주세요");

        response.sendError(500, "으하하 메렁메렁");

    }


}
