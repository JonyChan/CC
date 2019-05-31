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
      <a 
      href="login.jsp" class="w3-button w3-block">Wallet</a>
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

    <h1 align="center">Login Page</h1>

        <div>
<body>
    
    <form action="/Test/login" method="post" align = "center">
    <table align = "center">
    <tr>
    <td>User Name:</td>
    </tr>
     <tr>
     <td><input type="text" name = "abc" ></td>
    </tr>
     <tr>
    <td>Password:</td>
     </tr>
    <tr>
     <td><input type="password" name = "xyz"  ></td>
    </tr>
    
    <tr>
     <td><input class="w3-button w3-dark-grey" type="submit" value = "login"></td>
    </tr>
    <tr>
    <td><a href="/Test/regist.jsp">New user, regist now</a></td>
    </tr>
    
    </table>
    </form>
 
        </div>
    </section>




    <br/>
</section>

<footer class="w3-container w3-padding-32 w3-light-grey w3-center">
  <h4><a href = "./aboutUs.jsp">About us</a></h4>
  <h6>Team member: JinKun Li, Xu Chen, ShengQi Li, ShiQi Yan</h6>
  
  
  
  <a href="#" class="w3-button w3-black w3-margin"><i class="fa fa-arrow-up w3-margin-right"></i>To the top</a>
  
  <p>Powered by <a target="_blank" class="w3-hover-text-green">Team 12</a></p>
</footer>


</body>

</html>
  

