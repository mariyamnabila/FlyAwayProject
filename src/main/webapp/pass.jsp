<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="org.hibernate.Session  " %>
    <%@ page import ="dao.TravelDetailsImpl  " %>
   <%@ page import ="BookingTables1.Adim " %>
   <%@ page import =" org.hibernate.Transaction   " %>
   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action ="pass.jsp" method="post">

      username :<input type="text" name="use" required><br/>
      old password : <input type="text" name="op" required><br/>
      new password: <input type="text" name="np" required><br/>
      <input type ="submit" name="sub" value="change">
 </form>

 <br>
 <br>
<%
if(request.getParameter("sub")!=null){
	String np=request.getParameter("np");
	String user=request.getParameter("use");
	Session s=TravelDetailsImpl.getSession();
	Adim a=s.get(Adim.class, user);
	Transaction t=s.beginTransaction();
	a.setPass(np);
	s.save(a);
	t.commit();
	%>
	<h>password changed</h>
	</div>
<%}

%>
<div align ="center">
<form action ="Login.html" method="post">
      <input type ="submit" value="Logout">
 </form> 
<div>


</body>
</html>