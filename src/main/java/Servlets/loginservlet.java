package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import BookingTables1.Adim;
import dao.TravelDetailsImpl;

/**
 * Servlet implementation class loginservlet
 */
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("use");
		String pw=request.getParameter("ps");
		PrintWriter p=response.getWriter();
		Session s=TravelDetailsImpl.getSession();
		Adim a=s.get(Adim.class, user);
		
  	if(a!=null && (a.getName().equalsIgnoreCase(user))) {
  		String l=a.getPass();
  		if(l.equalsIgnoreCase(pw)) {
			response.sendRedirect("AdminHome.jsp");
  		}
  		else {
  			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
		    rd.include(request, response);
		    p.print("Invalid password");
  		}
			
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
		    rd.include(request, response);
		    p.print("Invalid username");
			
		}
		
	}

}
