<%@ page language="java" contentType="text/html; charset=UTF-8" import = "java.util.*"
    pageEncoding="UTF-8"%>
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
  .bgimg { 
  position: relative;
    min-height: 100%;
    background: url(./image/Diamond.jpg) no-repeat;
    -webkit-background-size: 100%;
    background-size: 100%;
    background-position: center;
    background-size: cover;

}


    </style>
<body style="text-decoration:none">
  <!-- Links (sit on top) -->
<%-- <div class="w3-top">
  <div class="w3-row w3-large w3-light-grey">
    <div class="w3-col s3">
      <a href="/Test/showApp" class="w3-button w3-block">Home</a>
    </div>
    <div class="w3-col s3 ">
     <a 
 	<% if(session.getAttribute("abc")==null){ %>
 	href="login.jsp"
 	<%}else {%>
 	href = "/Test/jsp/LoginSuc.jsp"
 	<%} %> 
 	class="w3-button w3-block"> 
 	
 	<% if(session.getAttribute("abc")==null){ %>
 	account
 	<%}else {%>
 	<%= session.getAttribute("abc") %>
 	<%} %> 
 	</a>         
    </div>
    <div class="w3-col s3">
      <a href="/Test/jsp/bank/wallet.jsp" class="w3-button w3-block">Wallet</a>
    </div>
    <div class="w3-col s3">
      <a href="/Test/jsp/private/upload.jsp" class="w3-button w3-block">Upload</a>
    </div>
  </div>
</div>
 --%>
</head>

<!-- Content -->
<div class="w3-content" style="max-width:100%;margin-top:80px;margin-bottom:80px">
 
    <h1><b>Sheffield CloudBase</b></h1>
    <p>Platform-as-a-Service</p>
    <img src="./image/Diamond1.jpg" width="100%" height="auto"/>
  </div>
  
  
  <!-- Slideshow -->
 


<div class="table_grad scroll_tablex">
<div class="w3-center w3-padding-64">
      <span class="w3-xlarge w3-bottombar w3-border-dark-grey w3-padding-16">Our Platform</span>
    </div>
  <table class="table_tab responsive"border="1"cellspacing="0"align="center" style="text-align:left; font-size:14px; font-weight:bold; width:80%; height:100px;text-align:center">
<tr>
<th>Name</th>
<td>Sheffield CloudBase</td>

</tr>
<tr>
<th>Aim objectives</th>
<td>Students in the University of Sheffield</td>

</tr>
<tr>
<th>Theme</th>
<td>Learn Support</td>

</tr>
<tr>
<th>Designer</th>
<td>Xu Chen, Jinkun Li, Shiqi Yan, Shengqi Li</td>

</tr>
<tr>
<th>Email: </th>
<td>sli40@sheffield.ac.uk</td>
  </tr>
  
  
  </table>
</div>



<div class="w3-row-padding" id="about">
    <div class="w3-center w3-padding-64">
      <span class="w3-xlarge w3-bottombar w3-border-dark-grey w3-padding-16">Developers!</span>
    </div>

    
    <div class="w3-quarter w3-margin-bottom">
      <div class="w3-card-4">
        <img src="./image/logo.png" alt="" style="width:50%; height:50%">
        <div class="w3-container">
          <h3>Name: <span>Shiqi Yan</span></h3>
          <p>Subject: <span>Information System</span></p>
          <p>Email: <span>syan8@sheffield.ac.uk</span></p>      
        </div>
      </div>
    </div>
    <div class="w3-quarter w3-margin-bottom">
      <div class="w3-card-4">
        <img src="./image/logo.png" alt="" style="width:50%">
        <div class="w3-container">
          <h3>Name: <span>Xu Chen</span></h3>
          <p>Subject: <span>Advanced Computer Science</span></p>
          <p>Email: <span>xchen116@sheffield.ac.uk</span></p>      
        </div>
      </div>
    </div>
    <div class="w3-quarter w3-margin-bottom">
      <div class="w3-card-4">
        <img src="./image/logo.png" alt="" style="width:50%">
        <div class="w3-container">
          <h3>Name: <span>Jinkun Li</span></h3>
          <p>Subject: <span>Advanced Computer Science</span></p>
          <p>Email: <span>jli169@sheffield.ac.uk</span></p>    
        </div>
      </div>
    </div>
    <div class="w3-quarter w3-margin-bottom">
      <div class="w3-card-4">
        <img src="./image/logo.png" alt="" style="width:50%">
        <div class="w3-container">
           <h3>Name: <span>Shengqi Li</span></h3>
          <p>Subject: <span>Information System</span></p>
          <p>Email: <span>sli40@sheffield.ac.uk</span></p>    
        </div>
      </div>
    </div>
    </div>

    
    
<div class="black">
    </br></br></br></br>


</div>


<div class="black">
    </br></br></br></br>


</div>
<footer class="w3-container w3-padding-32 w3-light-grey w3-center">
  <h4>About us</h4>
  <h6>Team member: JinKun Li, Xu Chen, ShengQi Li, ShiQi Yan</h6>
  
  
  
  <a href="#" class="w3-button w3-black w3-margin"><i class="fa fa-arrow-up w3-margin-right"></i>To the top</a>
  
  <p>Powered by <a target="_blank" class="w3-hover-text-green">Team 12</a></p>
</footer>


</body>

</html>
