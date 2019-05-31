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
    <link rel="stylesheet" href="/Test/css/TEST.css">
    <style>
    html,body,h1,h2,h3,h4,h5 {font-family:"Lato", sans-serif}
    .w3-tag, .fa {cursor:pointer}
    .w3-tag {height:15px;width:15px;padding:0;margin-top:6px}
    </style>
<style>
body,h1 {font-family: "Raleway", sans-serif}
body, html {height: 100%}
.bgimg {
  position: relative;
    min-height: 100%;
    background: url(./image/Diamond1.jpg) no-repeat;
    -webkit-background-size: 100%;
    background-size: 100%;
    background-position: center;
    background-size: cover;

}
.inner{
    height:700px;
    background: rgba(0,0,0,.2);
}

</style>
<body>

<div class="bgimg">
<header class="inner w3-display-container w3-content" style="max-width:1500px;">
  
  <div class="w3-padding w3-col l6 m8">
    <div class="w3-black"><div style="left: 10%; position: absolute; top: 100px">
      <h2>Sheffield CloudBase</h2>
      <p>Platform-as-a-Service</p></div>
    </div>
    
    <div style="right: 13%; position: absolute; color:white; top: 240px;font-size:30px;padding:0.5em;">
    <div >Welcome to Team12</div><br/>
    First, please read the <a href = "/Test/userGuide.jsp">user guide</a>
    
  </div>
  <div style="right: 17%; position: absolute; color:white; top: 450px;font-size:30px;padding:0.5em;">
    
      <div class="">Then, Please <a href = "/Test/showApp"> Enter platform</a></div>
   </div>
</header>
  </div>




</body>

</html>
