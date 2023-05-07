<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import= "BookingTables1.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h>paymment successful:</h>
<h>your booking details</h>
<%  Customer c=(Customer)request.getAttribute("loo"); %>
<table border="1">
<tr>
<td>name</td>
<td><%=c.getName() %></td>
</tr>
<tr>
<td>adhaar no</td>
<td><%=c.getAdhaarno() %></td>
</tr>
<tr>
<td>age</td>
<td><%=c.getAge() %></td>
</tr>
<tr>
<td>city</td>
<td><%=c.getCity() %></td>
</tr>
<tr>
<td>phone number</td>
<td><%=c.getPno() %></td>
</tr>
<tr>
<td>source</td>
<td><%=c.getSrc() %></td>
</tr>
<tr>
<td>destination</td>
<td><%=c.getDest() %></td>
</tr>
<tr>
<td>flight no</td>
<td><%=c.getFno() %></td>
</tr>
<tr>
<td>date</td>
<td><%=c.getDate() %></td>
</tr>
<tr>
<td>seats booked</td>
<td><%=c.getSeats() %></td>
</tr>


</table>



<form action ="index.jsp" method="post">
      <input type ="submit" value="Go back home page">
 </form> 
</body>
</html>