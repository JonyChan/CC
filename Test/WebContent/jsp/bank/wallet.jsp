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
      <a href = "/Test/jsp/LoginSuc.jsp" class="w3-button w3-block"><%= session.getAttribute("abc") %></a>     
    </div>
    <div class="w3-col s3">
      <a href="wallet.jsp" class="w3-button w3-block">Wallet</a>
    </div>
    <div class="w3-col s3">
      <a href = "/Test/jsp/private/upload.jsp" class="w3-button w3-block">Upload</a>
    </div>
  </div>
</div>


<body class="w3-light-grey">


<!-- Header -->
<header class="w3-display-container w3-content" style="max-width:1500px;">
  <img class="w3-image" src="/Test/image/Diamond.jpg" alt="The Hotel" style="min-width:1000px" width="1500" height="400">
  <div class="w3-display-middle w3-padding w3-col 16 m8">
    <div class="w3-container w3-black">
      <h2><i ></i>Peanut Topup</h2>
      <h5><i ></i>Hello!<%= session.getAttribute("abc") %></h2>
      <h5><i ></i>Your Balance:<%= session.getAttribute("bc") %></h2>
      
    </div>
    <div class="w3-container w3-white w3-padding-16">
      <form action="/Test/BankMain" method="post">
        <div class="w3-row-padding" style="margin:0 -16px;">
          <div class="w3-half w3-margin-bottom">
            <label><i ></i> Account Name</label>
            <input class="w3-input w3-border" type="text" placeholder="Enter account name" name="name" required>
          </div>
          
        </div>
        <div class="w3-row-padding" style="margin:8px -16px;">
          <div class="w3-half w3-margin-bottom">
            <label><i ></i> CDK number</label>
            <input class="w3-input w3-border"  type="text" placeholder=" Enter CDK numbers" size="300px" name="cdk" required >
            <div></br></div>
            
          </div>
        </div>
        <button class="w3-button w3-dark-grey" type="submit">Submit</button>
      </form>
      
      
      <br><tr>
     <td><p>If you want to buy CDK cards, please contact me---jli169@sheffield.ac.uk</p></td>
    </tr><br>
      
      <tr>
     <td><a href="/woca/ResetBankPwd.jsp">Change password</a></td>
    </tr>
    </div>
  </div>
</header>
<footer class="w3-container w3-padding-32 w3-light-grey w3-center">
  <h4>About us</h4>
  <h6>Team member: JinKun Li, Xu Chen, ShengQi Li, ShiQi Yan</h6>
  
  
  
  <a href="#" class="w3-button w3-black w3-margin"><i class="fa fa-arrow-up w3-margin-right"></i>To the top</a>
  
  <p>Powered by <a target="_blank" class="w3-hover-text-green">Team 12</a></p>
</footer>
</body>

</html>
</body>
</html>