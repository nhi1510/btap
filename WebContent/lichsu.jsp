<%@page import="bean.lichsubean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.khachhangbean"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <!-- Basic -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <!-- Mobile Metas -->
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <!-- Site Metas -->
  <meta name="keywords" content="" />
  <meta name="description" content="" />
  <meta name="author" content="" />
  <link rel="shortcut icon" href="images/favicon.png" type="image/x-icon">

  <title>Nhi Cosmetic</title>


  <!-- bootstrap core css -->
  <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
  <!--owl slider stylesheet -->
  <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css" />

  <!-- font awesome style -->
  <link href="css/font-awesome.min.css" rel="stylesheet" />

  <!-- Custom styles for this template -->
  <link href="css/style.css" rel="stylesheet" />
  <!-- responsive style -->
  <link href="css/responsive.css" rel="stylesheet" />

</head>

<body>
<%
response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
%>
  <div class="hero_area">
    <div class="hero_social">
      <a href="">
        <i class="fa fa-facebook" aria-hidden="true"></i>
      </a>
      <a href="">
        <i class="fa fa-twitter" aria-hidden="true"></i>
      </a>
      <a href="">
        <i class="fa fa-linkedin" aria-hidden="true"></i>
      </a>
      <a href="">
        <i class="fa fa-instagram" aria-hidden="true"></i>
      </a>
    </div>
    <!-- header section strats -->
    <header class="header_section">
      <div class="container-fluid">
        <nav class="navbar navbar-expand-lg custom_nav-container ">
          <a class="navbar-brand" href="menu.jsp">
            <span>
             𝑵𝒉𝒊 𝑪𝒐𝒔𝒎𝒆𝒕𝒊𝒄
            </span>
          </a>

          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class=""> </span>
          </button>

          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav">
              <li class="nav-item active">
                <a class="nav-link" href="index">Trang chủ <span class="sr-only">(current)</span></a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="htcuahang"> Cửa hàng </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="giohangController"> Giỏ hàng </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="lichsuController">Lịch sử</a>
              </li>
              
                <li class="nav-item">
        <%
      			khachhangbean kh= (khachhangbean)session.getAttribute("kh");
      	
           if(kh!=null){
     		 %>
     		     <div class="btn-group">
                    <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                   <a href="#" >Xin chào: <%=kh.getHoten() %> </a> 
                </button>
                 <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                 <a class="dropdown-item" href="dangxuatController">Đăng xuất</a>
                  </div>
                </div>
      <%  } 
              
            %>
            </li>
	
            </ul>
            <div class="user_option-box">
              <a href="DangNhap.jsp">
                <i class="fa fa-user" aria-hidden="true"></i>
           
              </a>
             
              <a href="Buy.jsp">
                <i class="fa fa-cart-plus" aria-hidden="true"></i>
              </a>
              <a href="">
                <i class="fa fa-search" aria-hidden="true"></i>
              </a>
            </div>
          </div>
        </nav>
      </div>
    </header>
<h2 style="text-align:center; color: blue;">LỊCH SỬ MUA HÀNG</h2><table align="center">
<%
 response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
	ArrayList<lichsubean> ds =(ArrayList<lichsubean>) request.getAttribute("dsls");
   
 %>

    <table width="80%" align="center">
       <tr > 
       <td valign="top" width="200">
       		<table class="table table-striped">
       			<tr>
       			<th >MAKH </th>
       			<th style="width: 30px"> HOTEN</th>
       			<th>Name </th>
       			
       			<th>Gia</th>
       			<th> SOLUONG</th>
       			<th> THANHTIEN</th>
       			<th> TRẠNG THÁI</th>
       			</tr>
       		 <%
                  int n=ds.size();
                  for(int i=0;i<n;i++) {
                    lichsubean ls=ds.get(i);
                  %>
       		<tr>
       			<td>
                             <%=i+1%></td> 
                            <td> <%=ls.getHoten()%> </td>
                            <td> <%=ls.getTenmypham()%> </td>
                          
                            <td> <%=ls.getGia()%> </td>
                             <td>  <%=ls.getSoLuong()%> </td>
                       <td>      <%=ls.getThanhTien()%> </td>
                       <%if (ls.getDamua()=="false"){%>
                            <td>Đã mua  </td>
                            <%}else {%>
                            <td> Chờ xác nhận</td>
     
        					<%} %> 
        					<%--  <%if (Long.parseLong(ls.getDamua())==0){%>
                            <td>Chờ xác nhận  </td>
                            <%}else {%>
                            <td> Đã mua</td>
     
        					<%} %>  --%>
       	</tr>
            <%}%> 
       		</table>
        </td>
        </tr>
        </table>   
           
</body>
</html>