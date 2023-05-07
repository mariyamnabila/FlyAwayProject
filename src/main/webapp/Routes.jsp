<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import= "BookingTables1.TravelDetails" %>
    <%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action ="routesadd" method="post">

      Source :<input type="text" name="sour" required><br/>
      Dest : <input type="text" name="dest" required><br/>
      Travel time: <input type="number" name="tra" required><br/>
      <input type ="submit" name="sub" value="Add">
 </form>
 </div>
 <% 
 if(request.getParameter("sub")!=null){
 TravelDetails hf=(TravelDetails)request.getAttribute("s1");
 if(hf==null) {%>
 <h>Records exists already</h>
 <%
 }
 else{%>
 <div align="center">
	 <table border="1">
	 <tr>
	 <td>Source</td>
	 <td>Dest</td>
	 <td>TravelTime</td>
	 </tr>
	 <tr>
	 <td><%=hf.getSd().getSource() %></td>
	 <td><%=hf.getSd().getDest() %></td>
	 <td><%= hf.getHours() %></td>
	 </tr>
	 </table>
	 </div>
<%}}%>
<br>
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