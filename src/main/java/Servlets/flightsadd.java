package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BookingTables1.Flights;
import dao.FlightsImpl;

/**
 * Servlet implementation class flightsadd
 */
public class flightsadd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public flightsadd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(request.getParameter("no"));
		 String b=request.getParameter("tim");
	     
	     int c=Integer.parseInt(request.getParameter("sea"));
        String d=request.getParameter("aname");
	     
	     int e=Integer.parseInt(request.getParameter("cos"));
	     PrintWriter p=response.getWriter();
	     FlightsImpl td=new FlightsImpl();
	     Flights t1=td.add(a,b,c,d,e);
	     request.setAttribute("s1", t1);
		 RequestDispatcher r=request.getRequestDispatcher("flightsadd.jsp");
		 r.forward(request, response);
	}

}
