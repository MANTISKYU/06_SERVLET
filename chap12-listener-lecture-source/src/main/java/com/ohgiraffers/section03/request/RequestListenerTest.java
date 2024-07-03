package com.ohgiraffers.section03.request;

import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class RequestListenerTest implements ServletRequestListener, ServletRequestAttributeListener {

    public RequestListenerTest() {
        System.out.println("request listener 인스턴스 생성");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        // request 소멸될 때 호출
        System.out.println("request destroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        // request 생성될 때 호출
        System.out.println("request init");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        // request에 attribute가 추가 될 대 호출
        System.out.println("request attribute added");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        // request에 attribute가 삭제 될 대 호출
        System.out.println("request removed");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        // request에 attribute가 수정 될 대 호출
        System.out.println("request attribute replaced");
    }
}
