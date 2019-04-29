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

</head>

<!-- Content -->
<div class="w3-content" style="max-width:1100px;margin-top:80px;margin-bottom:80px">

  <div class="w3-panel">
    <h1><b>Sheffield CloudBase</b></h1>
    <p>Platform-as-a-Service</p>
  </div>
  
  
  <!-- Slideshow -->
  <img src="./image/Diamond.jpg" width="1100" height="500"/>
    
<!--
<section class="w3-container w3-padding">
    <div class="w3-row">
        <a class="w3-btn w3-round-large w3-blue" href="not-yet-linked">Button 1</a>
        <a class="w3-btn w3-round-large w3-indigo" href="not-yet-linked">Button 2</a>
        <a class="w3-btn w3-round-large w3-purple" href="not-yet-linked">Button 3</a>
        <a class="w3-btn w3-round-large w3-red" href="not-yet-linked">Button 4</a>
        <a class="w3-btn w3-round-large w3-yellow" href="not-yet-linked">Button 5</a>
        <a class="w3-btn w3-round-large w3-teal" href="not-yet-linked">Button 6</a>
    </div>
</section>
-->


    <h1>Our platform</h1>
    <section class="platformIntroduction">


        <table class="aaa">
            <tr>
                <th class="bbb">Name</th>
                <td class="ccc">Sheffield CloudBase</td>
            </tr>
            <tr>
                <th class="bbb">Aim objectives</th>
                <td class="ccc">Students in the University of Sheffield</td>
            </tr>
            <tr>
                <th class="bbb">Purpose</th>
                <td class="ccc">ddddd</td>
            </tr>
            <tr>
                <th class="bbb">Designer</th>
                <td class="ccc">Designer1, Designer2, Designer3, Designer4</td>
            </tr>
            <tr>
                <th class="bbb">Email: </th>
                <td class="ccc">GaoZhiLiang@youxiu.com</td>
            </tr>

        </table>


    </section>
<div class="black">
    </br></br></br></br>


</div>

<section class="Author">
    <div class='table'>
        <div class='tr'>
            <div class='td'><img src="./image/logo.png" alt="" /></div>
            <div class='td'>Name: </br>Subject: </br>Birth: </br></div>
            <div class='td'>Name: </br>Subject: </br>Birth: </br></div>
            <div class='td'>Name: </br>Subject: </br>Birth: </br></div>
        </div>

        <div class='tr'>
        <div class='td'><img src="./image/logo.png" alt="" /></div>
        <div class='td'>Name: </br>Subject: </br>Birth: </br></div>
        <div class='td'>Name: </br>Subject: </br>Birth: </br></div>
        <div class='td'>Name: </br>Subject: </br>Birth: </br></div>
    </div>
        <div class='tr'>
            <div class='td'><img src="./image/logo.png" alt="" /></div>
            <div class='td'>Name:</br>Subject: </br>Birth: </br></div>
            <div class='td'>Subject: </br>Birth: </br></div>
            <div class='td'>Subject: </br>Birth: </br></div>
            
            
        </div>
        <div class='tr'>
            <div class='td'><img src="./image/logo.png" alt="" /></div>
            <div class='td'>Name: </br>Subject: </br>Birth: </br></div>
            <div class='td'>Name: </br>Subject: </br>Birth: </br></div>
            <div class='td'>Name: </br>Subject: </br>Birth: </br></div>
        </div>
    </div>
</section>
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