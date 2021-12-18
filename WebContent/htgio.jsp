

<%@page import="bean.khachhangbean"%>
<%@page import="bean.giohangbean"%>
<%@page import="bean.Myphambean"%>
<%@page import="java.util.ArrayList"%>
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

request.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");
ArrayList<Myphambean> dssach=(ArrayList<Myphambean>)request.getAttribute("dssach");


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
                <a class="nav-link" href="datmuaController">Lịch sử</a>
              </li>
                <li class="nav-item">
            </ul>
            <div class="user_option-box">
              <a href="DangNhap.jsp">
                <i class="fa fa-user" aria-hidden="true"></i>
           
              </a>
                <%
		khachhangbean kh=(khachhangbean)session.getAttribute("kh");
      	if(kh!=null){%>
      	<a href="#">Xin chào: <%=kh.getHoten() %></a>
      <%} else{%>
      		   <a href="#" data-toggle="modal" data-target="#myModal">
	           	<span class="glyphicon glyphicon-log-in"></span> Đăng nhập</a></li>
	           	<%if(session.getAttribute("tb")!=null){
	           		out.print("<script> alert('"+session.getAttribute("tb")+"');</script>");
	           	}	}%>

       
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
    <!-- end header section -->
    <table width="1200" align="center">
     <tr>
		
		 <td width="700" valign="top">
             <table class="table table-hover">              
			<%
			ArrayList<giohangbean> dsgh=(ArrayList<giohangbean>)request.getAttribute("dsgh");
			if(dsgh!=null)
			 for(giohangbean g: dsgh){%>
				<form method="post" action="sua?ms=<%=g.getMamp()%>&slmua=<%=g.getSoluong()%>"> 
					
					<tr>
				       <td><%=g.getMamp() %> </td>
				       <td><%=g.getTen() %> </td>
				   
				       <td><%=g.getGia() %> </td>
				       <td><%=g.getSoluong() %> </td>
					   <td><input name="txtsl" type="number">
				          	<button name="butsua" type="submit" class="btn-link" value="sua">
				                  Sửa
				            </button></td>
				       <td><%=g.getThanhtien() %> </td>
				       <td>
				           <button name="butxoa" type="submit" class="btn-link" value="xoa">
				                  Xóa
				           </button>
				       </td>
				     </tr>
				      
				 </form>
				       <%} %>
				

   				</table>
   				
				     
             	Tong tien: <%=request.getAttribute("tt") %>
             	<a href="datmuaController" onclick="return confirm('mua hàng thành công!')" class="btn btn-danger"><button class="btn btn-success">Xác nhận đặt mua</button></a>
         </td>
         <td width="250" valign="top">
             <form class="form-horizontal" action="index" >
			 <form class="navbar-form navbar-left" action="/action_page.php">
			 <div class="input-group">
			 <input type="text" name="key" value="<%=request.getParameter("key")==null?"":request.getParameter("key")%>" class="form-control" placeholder="Nhập từ khóa">
			    <div class="input-group-btn">
			      <button class="btn btn-default" type="submit">
			        <i class="glyphicon glyphicon-search"></i>
			      </button>
			    </div>
			  </div>
			</form>
			</form>
			
         </td>
     </tr>
  </table>

</body>
</html>