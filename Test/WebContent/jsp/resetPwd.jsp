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
    </style>
    </head>
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
<body>

<!-- Header -->
<div class="w3-content" style="max-width:1100px;margin-top:80px;margin-bottom:80px">

  <div class="w3-panel">
    <h1><b>Sheffield CloudBase</b></h1>
    <p>Platform-as-a-Service</p>
  </div>
  
  
  <!-- Slideshow -->
<!--   <img src="/Test/image/Diamond.jpg" width="1100" height="300"/>
 -->    
 <img src="/Test/image/Diamond.jpg" width="100%" height="auto"/>

<!--   <div class="w3-display-middle w3-padding w3-col 16 m8">
    <div class="w3-container w3-black">
      <h2><i></i>Reset Password</h2>
    </div>
    
    
    <div class="w3-container w3-white w3-padding-16">
      <form action="/Test/ResetPwd" method="post">
        <div class="w3-row-padding" style="margin:0 -16px;">
          <div class="w3-half w3-margin-bottom">
            <label><i ></i> Account Name</label>
            <input class="w3-input w3-border" type="text" placeholder="Enter account name" name="username" required>
          </div>
          
        </div>
        <div class="w3-row-padding" style="margin:8px -16px;">
          <div class="w3-half w3-margin-bottom">
            <label><i class=></i> Original Password</label>
            <input class="w3-input w3-border"  type="password" placeholder=" Enter Original Password" size="300px" name="opwd" required >
            <div></br></div>
            
          </div>
        </div>
        
        
        <div class="w3-row-padding" style="margin:8px -16px;">
          <div class="w3-half w3-margin-bottom">
            <label><i ></i> New Password</label>
            <input class="w3-input w3-border"  type="password" placeholder=" Enter New Password" size="300px" name="npwd" required >
            <div></br></div>
            
          </div>
        </div>
        
        <button class="w3-button w3-dark-grey" type="submit">Submit</button>
      </form>
    </div>
  </div> -->
  
  
  <div class="w3-panel">
      <h2 align = "center">Reset Password</h2>
      </div>
      <div class="catalog" style="margin:1em 0;"> 
       <form action="/Test/ResetPwd" method="post">
       <table align = "center">
       <tr>
            <td> Account Name</td>
            <td><input type="text" type="text" placeholder="Enter account name" name="username" required></td>
        </tr> 
       
        <tr>
            <td> Original Password</td>
           <td> <input  type="password" placeholder="Enter Original Password"  name="opwd" required ></td>
         </tr>  
         
         <tr>
            <td> New Password</td>
           <td> <input  type="password" placeholder=" Enter New Password"  name="npwd" required ></td>
         </tr>   
        <td align = "center"><button class="w3-button w3-dark-grey" type="submit" >Submit</button></td>
        </table>
      </form>
      </div>
</header>


<footer class="w3-container w3-padding-32 w3-light-grey w3-center">
  <h4><a href = "./aboutUs.jsp">About us</a></h4>
  <h6>Team member: JinKun Li, Xu Chen, ShengQi Li, ShiQi Yan</h6>
  
  
  
  <a href="#" class="w3-button w3-black w3-margin"><i class="fa fa-arrow-up w3-margin-right"></i>To the top</a>
  
  <p>Powered by <a target="_blank" class="w3-hover-text-green">Team 12</a></p>
</footer>

</body>

</html>
</body>
</html>