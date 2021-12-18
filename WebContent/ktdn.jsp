
<%@page import="bean.khachhangbean"%>
<%@page import="bo.khachhangbo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
     String un=request.getParameter("user");
     String pass=request.getParameter("pass");
     khachhangbo khbo=new khachhangbo();
     khachhangbean kh= khbo.ktdn(un, pass);
     if(kh!=null){
    	 session.setAttribute("kh", kh);
    	 response.sendRedirect("menu.jsp");
     }else{
    	 session.setAttribute("tb", "Dang nhap sai");
    	 response.sendRedirect("menu.jsp");
     }
  %>
</body>
</html>