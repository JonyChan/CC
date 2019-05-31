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
    td{padding:5px 10px; width:35%;}
    </style>
<body style="text-decoration:none">
  <!-- Links (sit on top) -->
<div class="w3-top">
  <div class="w3-row w3-large w3-light-grey">
    <div class="w3-col s3">
      <a href="/Test/showApp" class="w3-button w3-block">Home</a>
    </div>
    <div class="w3-col s3 ">
      <a href="/Test/jsp/LoginSuc.jsp" class="w3-button w3-block"><%=session.getAttribute("abc")%></a>     
    </div>
    <div class="w3-col s3">
      <a href="/Test/jsp/private/wallet.jsp" class="w3-button w3-block">Wallet</a>
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
<!--   <img src="/Test/image/Diamond.jpg" width="1100" height="300"/>
 -->    
 <img src="/Test/image/Diamond.jpg" width="100%" height="auto"/>
<section>
	
	<h1 align="center"> ${message }</h1>
    <br/>
    <h1 align="center">Upload specific information of app here!</h1>

    <div class="w3-row-padding">  
      <form action="/Test/insertApp" method="post" >
      <table align = "center" style="width:80%;">
    <!--  <tr>
      <td><h3>Please choose WAR file as app:</h3></td>
      </tr>
      <tr>
      <br/>
      <td><input type="file" name="warpath" accept = ".war" size="50" /></td>
</tr> -->
<br/>
<!-- <tr>
 	<td>Please choose picture as app icon:</td>
 	 <br/>
      <td>
      <input type="file" name="iconpath" size="50" /></td>

</tr> -->

<tr>
        <td>Application name:</td>
        
        <td><input style="width:100%;" type="text" name="appname" placeholder = "please input 'app1' if 'app1.war',this is the name of your war document" required/></td>
</tr>


<tr>        
         <td>Provider name:</td>
         
        <td><input style="width:100%;" type="text" name="provider" placeholder = "<%=session.getAttribute("abc") %>" required/></td>
</tr>

<tr>
        <td>Introduction of your application:</td>
        
        <td><textarea  style="width:100%;" name = "appdescri" placeholder = "introduction of your app, this will show in the platform"></textarea></td>
</tr>

<tr>
        <td>Service agreement:</td>
        
        <td><p style="width:100%;margin:auto;">1.Once uploading apps to the platform, the platform has the right to review and delete apps.</p>
        	<p style="width:100%;margin:auto;">2.Once Releasing apps, it is not allow app providers update and delete those apps privitely.</p>
        	<p style="width:100%;margin:auto;">3.Update yours apps, please contact platform administrator. Contact information is available in Abput Us.</p>
        	<p style="width:100%;margin:auto;">4.After you uploading your app, when other user enter your app, you could get 3 peanuts each time, the platform could get 2 peanuts each time.</p>
        	<p style="width:100%;margin:auto;">5.Earnings details can be viewed in the Wallet.</p>
        	<p style="width:100%;margin:auto;">6.Apps provider would not be charged, only when enter their own apps.</p>
        	<p style="width:100%;margin:auto;">6.Once you continue to the next step, you will be deemed to accept our agreement by default.</p>
        </td>
</tr>
<br/>

<tr>
        <td align = "center"><input class="w3-button w3-dark-grey" type="submit" value="create" /></td>
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