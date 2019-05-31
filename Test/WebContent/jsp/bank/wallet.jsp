<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Sheffield :: CloudBase</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
    html,body,h1,h2,h3,h4 {font-family:"Lato", sans-serif}
    .mySlides {display:none}
    .w3-tag, .fa {cursor:pointer}
    .w3-tag {height:15px;width:15px;padding:0;margin-top:6px}
    td{padding:5px 10px;}
    </style>
    
<body style="text-decoration:none">
  <!-- Links (sit on top) -->
<div class="w3-top">
  <div class="w3-row w3-large w3-light-grey">
    <div class="w3-col s3">
      <a href="/Test/showApp" class="w3-button w3-block">Home</a>
    </div>
    <div class="w3-col s3 ">
      <a href = "/Test/jsp/LoginSuc.jsp" class="w3-button w3-block"><%= session.getAttribute("abc") %></a>     
    </div>
    <div class="w3-col s3">
      <a href="/Test/jsp/showMo" class="w3-button w3-block">Wallet</a>
    </div>
    <div class="w3-col s3">
      <a href = "/Test/jsp/private/upload.jsp" class="w3-button w3-block">Upload</a>
    </div>
  </div>
</div>
</head>

<div class="w3-content" style="max-width:1100px;margin-top:80px;margin-bottom:80px">

  <div class="w3-panel">
    <h1><b>Sheffield CloudBase</b></h1>
    <p>Platform-as-a-Service</p>
  </div>
  
  
  <!-- Slideshow -->
<!--   <img src="/Test/image/Diamond.jpg" width="1100" height="300"/>
 -->    
 <img src="/Test/image/Diamond.jpg" width="100%" height="auto"/>


<!-- Header -->
	<div class="w3-panel">
      <h2 align = "center">Peanut Topup</h2>
      <h5 align = "center">Hello! <%= session.getAttribute("abc") %></h2>
      <h5 align = "center">Your Balance:
     <%--  <% if(session.getAttribute("bc")==null){ %>
 	0
 	<%}else {%>
 	<%= session.getAttribute("bc") %>
 	<%} %>  --%>
 	<%= session.getAttribute("mo") %>
      </h2>
      
    </div>
 <div class="catalog"> 
       <form action="/Test/BankMain" method="post">
       <table align = "center">
       <tr>
            <td> Account Name</td>
            <td><input type="text" placeholder="Enter account name" name="name" required></td>
        </tr> 
       
        <tr>
            <td> CDK number</td>
           <td> <input type="text" placeholder=" Enter CDK numbers"  name="cdk" required ></td>
         </tr>   
        <td align = "center"><button class="w3-button w3-dark-grey" type="submit" >Submit</button></td>
        </table>
      </form>
      
      
      <div style="width:100%;margin:auto;">
     	<p style="text-align:center;">If you want to buy CDK cards, please contact me---jli169@sheffield.ac.uk</p>
     	<p style="text-align:center;">One CDK number could top up 100 peanuts.</p>
   	  </div>
      
    </div>
  </div>

<footer class="w3-container w3-padding-32 w3-light-grey w3-center">
  <h4><a href = "./aboutUs.jsp">About us</h4>
  <h6>Team member: JinKun Li, Xu Chen, ShengQi Li, ShiQi Yan</h6>
  
  
  
  <a href="#" class="w3-button w3-black w3-margin"><i class="fa fa-arrow-up w3-margin-right"></i>To the top</a>
  
  <p>Powered by <a target="_blank" class="w3-hover-text-green">Team 12</a></p>
</footer>
</body>

</html>
</body>
</html>