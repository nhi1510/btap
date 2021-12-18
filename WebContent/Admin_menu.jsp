
<%@page import="bean.khachhangbean"%>
<%@page import="bo.khachhangbo"%>

<%@page import="bean.Myphambean"%>
<%@page import="bo.Myphambo"%>

<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<%

request.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");

%>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
   
    <ul class="nav navbar-nav">
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="Admintrangchinh">Quản lý sách<span class="caret"></span></a>
      		<ul class="dropdown-menu">
      		<c:if test="${tbthem== '1' }"><script>alert('Thêm thành công!!!');</script></c:if>
      		<li><a href="Admin_trangchuController">Hiển thị sách</a></li>
          	<li><a href="Admin_htthemsachController">Thêm sách</a></li>
	        </ul>
      </li>
      
      <li><a href="Admin_loaiController">Quản lý loại</a></li>
      <li><a href="Admin_khachhangController">Quản lý khách hàng</a></li>
      <li><a href="Admin_donhangController">Quản lý đơn hàng</a></li>
    </ul>
   
  </div>
  
  
  <td width="250" valign="top">
			 <form class="navbar-form navbar-left" action="Admintrangchinh">
			 <div class="input-group">
			 <input type="text" name="key" value="<%=request.getParameter("key")==null?"":request.getParameter("key")%>" class="form-control" placeholder="Nhập từ khóa">
			    <div class="input-group-btn">
			      <button class="btn btn-default" type="submit">
			        <i class="glyphicon glyphicon-search"></i>
			      </button>
			    </div>
			  </div>
			</form>		
         </td>
     </tr>
</nav>