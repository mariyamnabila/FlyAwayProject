<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import= "BookingTables1.TravelDetails" %>
    <%@ page import= "BookingTables1.Flights" %>
     <%@ page import= "BookingTables1.DayInfo" %>
    <%@ page import= "dao.TravelDetailsImpl" %>
    <%@ page import= "dao.FlightsImpl" %>
    <%@ page import ="java.util.*" %>




<html>
  <head>
    <title>Hello, World!</title>
    <style>
    *{
      background-color:#FFEFD5;
    }
      #recome{
        text-align:center;
        width:100%;
        color: #DA70D6;
        box-sizing: border-box;
      }
      h2{
        
        color: #6B8E23;
        text-align:center;
      }
       .button {
  padding: 10px 15px;
  font-size: 14px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: #fff;
  background-color: #04AA6D;
  border: none;
  border-radius: 5px;
  
}
.button:hover {background-color: red}
    </style>
  </head>
  <body>
  <form action="Login.html" method="post">
       <div class="mainContainer" style="text-align:left;">
      <button type="submit" name="sub">Login</button>
      </div>
      <br>
      <div style="text-align:center">
    </form>
  
  
  
    <div id="recome">
      <h2>Travel Form</h2>
     <form autocomplete="off" action="bookingserv" method="post">
       <div>
       <label>Source :</label>
       <input type="text" name="src"  class="souce" placeholder="Travel from" required>
       </div>
       <br>
       <div>
       <label>Destination :</label>
       <input type="text" name="des" class="dre" placeholder="Travel To" required>
       </div>
       <br>
       <div>
       <label>Date :</label>
       <input type="text" name="date" class="data" placeholder="yyyy-mm-dd" required>
       </div>
       <br>
       <div>
       <label>Seats :</label>
       <input type="number" name="sea" class="dre" placeholder="enter no of seats" required>
       </div>
       <button class="button" name="sub1">Submit</button>
     </form>
     </div >
     <br>
     <br>
     <br>
     
     
 <% 
 if(request.getParameter("sub1")!=null){
 List<Flights> hf1=(List<Flights>)request.getAttribute("s1");
 

 if(hf1==null) {%>
 <h>No record found</h>
 <%
 }
 else{
	 int i=(int)request.getAttribute("s3");
	 int ii=(int)request.getAttribute("s4");
	 TravelDetails t1=(TravelDetails)request.getAttribute("s2");
 
 %>
 <div align="center">
 <h><b>FlightDetails</b></h>
	 <table border="1">
	 <tr>
	 <td>Flightno</td>
	 <td>timings</td>
	 <td>seats</td>
	 <td>airlines name</td>
	 <td>Totalcost</td>
	 <td>Sourcedest</td>
	 </tr>
	 <% for(Flights v:hf1){ 
		 FlightsImpl f=new FlightsImpl();
		 int y=f.getseatsavailable(v, i);
		 if(y<ii){
			 continue;
		 }
	 %>
	 <tr>
	 <td><%= v.getFlightno()   %></td>
	 <td><%=v.getTimings() %></td>
	 <td><%= y %></td>
	  <td><%=v.getAname() %></td>
	 <td><%= v.getCostperhour()*t1.getHours()%></td>
	 <td><%=v.getTd()%></td>
	 </tr>
	 <%} %>
	 </table>
	 </div>
<%}%>
<br>
<br>
<br>
<br>
 <form action ="serv1" method="post">
 <input type="number" name="fno"   required>
      <input type ="submit" value="submit">
 </form>
 
 
 
 
<% }%>
        
     
  </body>
</html>