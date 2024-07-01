package com.ohgiraffers.chap02;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/request-service")
public class ServiceMethodTestServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
        HttpServletRequest httpRequest = (HttpServletRequest) requset;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // httpRequest의 getMethod() : 어떠한 http method 요청인지 문자열로 반환해준다.
        String httpMethod = httpRequest.getMethod();

        System.out.println("httpMethod : " + httpMethod);

        if("GET".equals(httpMethod)) {

            doGet(httpRequest, httpResponse );

        } else if(("post").equals(httpMethod)) {

            doPost(httpRequest, httpResponse);

        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET요청을 처리할 메소드 호출");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("POST요청을 처리할 메소드 호출");
    }
}
