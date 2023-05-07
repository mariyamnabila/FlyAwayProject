<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import= "BookingTables1.TravelDetails" %>
    <%@ page import= "BookingTables1.Flights" %>
    <%@ page import= "dao.TravelDetailsImpl" %>
    <%@ page import= "dao.FlightsImpl" %>
    <%@ page import ="java.util.*" %>






<html>
  <head>
   
   
   
   <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  </head>
  
  <body>
<ul class="nav nav-pills nav-fill">
  <li class="nav-item">
    <a class="nav-link active" href="Routes.jsp"><h2>Travel Routes</h2></a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="flightsadd.jsp"><h2>FlightsInfo</h2></a>
  </li>
   <li class="nav-item">
    <a class="nav-link" href="setup.jsp"><h2>Setup</h2></a>
  </li>
  
  
  <li class="nav-item">
    <a class="nav-link" href="pass.jsp"><h2>Password</h2></a>
  </li>

</ul>

 <% 
 TravelDetailsImpl td=new TravelDetailsImpl();
 List<TravelDetails> hf=td.getAll();
 if(hf==null) {%>
 <h>No record found</h>
 <%
 }
 else{%>
 <div align="center">
 <h1>TravelDetails</h1>
 
	 <table border="1">
	 <tr>
	 <td>Source</td>
	 <td>Dest</td>
	 <td>TravelTime</td>
	 </tr>
	 <% for(TravelDetails d:hf){ %>
	 <tr>
	 <td><%=d.getSd().getSource() %></td>
	 <td><%=d.getSd().getDest() %></td>
	 <td><%= d.getHours() %></td>
	 </tr>
	 <%} %>
	 </table>
	 </div>
<%}%>


 <% 
 FlightsImpl td1=new FlightsImpl();
 List<Flights> hf1=td1.getAll();
 if(hf1==null) {%>
 <h>No record found</h>
 <%
 }
 else{%>
 <div align="center">
 <h1>FlightDetails</h1>
	 <table border="1">
	 <tr>
	 <td>Flightno</td>
	 <td>timings</td>
	 <td>seats</td>
	 <td>airlines name</td>
	 <td>cost/hr</td>
	 <td>Sourcedest</td>
	 </tr>
	 <% for(Flights v:hf1){ %>
	 <tr>
	 <td><%=v.getFlightno()   %></td>
	 <td><%=v.getTimings() %></td>
	 <td><%= v.gettSeats() %></td>
	  <td><%=v.getAname() %></td>
	 <td><%= v.getCostperhour() %></td>
	 <td><%=v.getTd()%></td>
	 </tr>
	 <%} %>
	 </table>
	 </div>
<%}%>

<br>
<br>
<br>
<div align="center">
<form action ="index.jsp" method="post">
      <input type ="submit" value="Logout">
 </form> 
</div>
  </body>
</html>