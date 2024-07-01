<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%--
HTML
- 웹페이지와 웹 어플리케이션을 만들기 위한 표준 마크업 언어
- 웹페이지의 구조를 정의한다.
- 텍스트, 이미지, 링크, 폼, 테이블 등 다양한 요소를 웹페이지에 추가한다
-<head> 헤더영역, 타이틀, 메타데이터, 외부리소스 링크 등이 들어간다.
-<body> 바디영역 (본문)
--%>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1> 라이프 사이클 테스트 </h1>
<%--br 태그 : 줄바꿈--%>
<br/>
<%--a 태그 : 다른 페이지로 이동할 수 있게 링크를 걸어주는 기능(href 속성을 이용해 )--%>
<a href="xml-lifecycle">라이프 사이클 테스트(xml)</a>


<a href="annotation-lifecycle">라이프 사이클 테스트(annotation)</a>
</body>
</html>