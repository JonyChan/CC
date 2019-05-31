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
    html,body,h1,h2,h3,h4 {font-family:"Lato", sans-serif}
    .mySlides {display:none}
    .w3-tag, .fa {cursor:pointer}
    .w3-tag {height:15px;width:15px;padding:0;margin-top:6px}
    .container{margin:2em;}
    </style>
<body style="text-decoration:none">
  <!-- Links (sit on top) -->
<div class="w3-top">
  <div class="w3-row w3-large w3-light-grey">
    <div class="w3-col s3">
      <a href="/Test/showApp" class="w3-button w3-block">Home</a>
    </div>
    <div class="w3-col s3 ">
      <a href="login.jsp" class="w3-button w3-block">Account</a>     
    </div>
    <div class="w3-col s3">
      <a href="login.jsp" class="w3-button w3-block">Wallet</a>
    </div>
    <div class="w3-col s3">
      <a href="login.jsp" class="w3-button w3-block">Upload</a>
    </div>
  </div>
</div>

</head>

<!-- Content -->
<div class="w3-content" style="max-width:1100px;margin-top:80px;margin-bottom:80px">

  <div class="w3-panel">
    <h1><b>Sheffield CloudBase</b></h1>
    <p>Platform-as-a-Service</p>
  </div>
  
 
  <!-- Slideshow -->
<!--   <img src="./image/Diamond.jpg" width="1100" height="300"/>
 -->
<img src="./image/Diamond.jpg" width="100%" height="auto"/>

<section>
<div>

    <h1 align="center">Register Page</h1>

    <div class="catalog container">
          <form action="/Test/regist">
          <table>
            <p align="left">User Name:</p>
            <p align="left"><input type="text" name = "abc" size="50"  placeholder = "when you login, you will use username" required/></p>
           
            <p align="left">Password: </p>
            <p align="left"><input type="password" name="xyz"size="50"  placeholder = "when you login, you will use password" required/></p>


            <p align="left">Email:</p>
            <p align="left"><input type="text" size="50"/></p>
            


            <p colspan="2"><input class="w3-button w3-dark-grey" type="submit" value="Regist"/></p>
            </table>
		</form>
    </div>
    </div>
</section>




<br/>


<footer class="w3-container w3-padding-32 w3-light-grey w3-center">
  <h4><a href = "./aboutUs.jsp">About us</a></h4>
  <h6>Team member: JinKun Li, Xu Chen, ShengQi Li, ShiQi Yan</h6>
  
  
  
  <a href="#" class="w3-button w3-black w3-margin"><i class="fa fa-arrow-up w3-margin-right"></i>To the top</a>
  
  <p>Powered by <a target="_blank" class="w3-hover-text-green">Team 12</a></p>
</footer>


</body>

</html>