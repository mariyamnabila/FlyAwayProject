<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import= "BookingTables1.Flights" %>
    <%@ page import ="java.util.*" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action ="flightsadd" method="post">
      Flight No :<input type="number" name="no" required><br/>
      timings : <input type="text" name="tim" required><br/>
      seats: <input type="number" name="sea" required><br/>
      Airlines name: <input type="text" name="aname" required><br/>
      Cost/hour: <input type="number" name="cos" required><br/>
      <input type ="submit" name="sub" value="Add">
 </form>
 </div>
 <br>
 <br>
 <br>
 <% 
 if(request.getParameter("sub")!=null){
 Flights hf=(Flights)request.getAttribute("s1");
 if(hf==null) {%>
 <h>Records exists already</h>
 <%
 }
 else{%>
 <div align="center">
	 <table border="1">
	 <tr>
	 <td>Flightno</td>
	 <td>timings</td>
	 <td>seats</td>
	 <td>airlines name</td>
	 <td>cost/hr</td>
	 </tr>
	 <tr>
	 <td><%=hf.getFlightno()   %></td>
	 <td><%=hf.getTimings() %></td>
	 <td><%= hf.gettSeats() %></td>
	  <td><%=hf.getAname() %></td>
	 <td><%= hf.getCostperhour() %></td>
	 </tr>
	 </table>
	 </div>
<%}}%>
 <br>
 <br>
 <br>
  <div align="center">
   <form action ="AdminHome.jsp" method="post">
      <input type ="submit" value="go to home">
 </form>
 </div>
 
</body>
</html>