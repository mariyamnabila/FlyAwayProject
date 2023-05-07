<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int y=(int)request.getAttribute("pu");
%>
<h>total cost <%=y %></h>

<div id="recome">
      <h2>payment</h2>
     <form autocomplete="off" action="final1" method="post">
       <div>
       <label>cardholdername :</label>
       <input type="text" name="cn" class="adhaarsouce" placeholder="xxxx xxxx xxxx" required>
       </div>
       <br>
       <div>
       <label>card no :</label>
       <input type="text" name="cn1" class="agesouce" placeholder="Enter Age" required>
       </div>
       <br>
       <div>
       <label>expiry date :</label>
       <input type="text" name="ci" class="citysouce" placeholder="Enter city" required>
       </div>
       <br>
       <div>
       <label>CCV :</label>
       <input type="number" name="na" class="namesouce" placeholder="Enter Name" required>
       </div>
       <br>
       
       <button class="button">pay</button>
       
     </form>
     </div >

</body>
</html>