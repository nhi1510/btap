<%@page import="bo.Myphambo"%>
<%@page import="bean.Myphambean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.giohangbean"%>
<%@page import="bo.giohangbo"%>
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
             ???????????? ????????????????????????????????
            </span>
          </a>

          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class=""> </span>
          </button>

          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav">
              <li class="nav-item active">
                <a class="nav-link" href="index">Trang ch??? <span class="sr-only">(current)</span></a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="htcuahang"> C???a h??ng </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="giohangController"> Gi??? h??ng </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="datmuaController">L???ch s???</a>
              </li>
                <li class="nav-item">
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

<%


Myphambo sbo=new Myphambo();
	response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
   
    ArrayList<Myphambean> dsproduct=(ArrayList<Myphambean>)request.getAttribute("dsproduct");
	%>

<div class="container" style="margin-top: 20px; margin-bottom: 20px;">
	<div class="row">
		<table class="table table-bordered">
		<label> GI??? H??NG C???A B???N </label> 
			<tr>
				<th>M??</th>
				<th>Img</th>
				<th>Ti??u ?????</th>
				<th>Gi??</th>
				<th>S??? L?????ng</th>
				<th>T???ng Gi??</th>
				<th>T??y ch???nh</th>
			</tr>
			<% if(session.getAttribute("gh")!=null)
						{ 
							giohangbo gh1=(giohangbo)session.getAttribute("gh");
							for(giohangbean g:gh1.ds ){%> 
		       <%--  <form action="giohangcontroller?id_product=<%=g.getMamp()%>&title=<%=g.getTitle()%>" method="post" > --%>
		       <form action="sua" method="get">  
           <tr>
		      	<td><%=g.getMamp()%></td>
			<td><img src="<%=g.getImg()%>" style="height: 80px"/></td>
			<td><%=g.getTen()%></td>
			
			<td><%=g.getGia()%> VND</td>
			 
			<td style="display: flex">
			
				<input type="number" min="1"  name="txtsoluong" value="<%=g.getSoluong()%>"  style="width:50px;">
			</td>
			<td><%=g.getGia()*g.getSoluong()%>VND </td>
			
			<td>
			 
			 	
			 	<button type="submit" name ="btnsua"value="<%=g.getMamp()%>">C???p nh???t </button>
				<button type="submit" name="btnxoa" value="<%=g.getMamp()%>">X??a</button>
			 	<input type="hidden" name="title" value="<%=g.getMamp()%>">	
			     <%--    <button name="btnsua" value="<%=g.getId_product()%>"  class="btn btn-danger" >C???p nh???t</button> 	
			       <button type="submit" name="btnxoa" value="<%=g.getId_product()%>"  class="btn btn-danger" >Xo??</button> --%>

			</td>
		</tr>
		</form>

		<%} %>

		
		</table>
	 <label> T???ng Ti???n: <%=gh1.TongTien()%> VN??</label> <hr style="margin-top:-2px"><br>
	       <a href="htcuahang"><button class="btn">Ti???p t???c mua h??ng</button></a>
	   	<a href="datmuaController"><button class="btn btn-primary">Ti???p t???c thanh to??n</button></a>
			
	</div>
			<%} %>
					
	
</div>
</body>
</html>