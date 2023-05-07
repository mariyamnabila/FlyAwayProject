<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import= "BookingTables1.Flights" %>
    <%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action ="dayssetup" method="post"> 
      <input type ="submit" name="sub1" value="setup">
 </form>
</div>
<br>
<br>
<br>
<div align="center">
<form action ="flightsetup" method="post">
      flight no: <input type="number" name="fno" required><br/>
      Source :<input type="text" name="sour" required><br/>
      Dest : <input type="text" name="dest" required><br/>
      
      <input type ="submit" name="sub" value="setup">
 </form>
 </div>
 

  <% 
 if(request.getParameter("sub")!=null){
 Flights hf=(Flights)request.getAttribute("s1");
 if(hf==null) {%>
 <h>cannot setup.records not available</h>
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
	 <td>Travel details</td>
	 </tr>
	 <tr>
	 <td><%=hf.getFlightno()   %></td>
	 <td><%=hf.getTimings() %></td>
	 <td><%= hf.gettSeats() %></td>
	  <td><%=hf.getAname() %></td>
	 <td><%= hf.getCostperhour() %></td>
	 <td><%=hf.getTd().get(0).getSd()  %></td>
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