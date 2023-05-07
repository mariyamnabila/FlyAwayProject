package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BookingTables1.TravelDetails;
import dao.TravelDetailsImpl;
import BookingTables1.Flights;

/**
 * Servlet implementation class flightsetup
 */
public class flightsetup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public flightsetup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String a=request.getParameter("sour");
	     String b=request.getParameter("dest");
	     int c=Integer.parseInt(request.getParameter("fno"));
	     PrintWriter p=response.getWriter();
	     TravelDetailsImpl td=new TravelDetailsImpl();
	     Flights t1=td.setup(a,b,c);
	     request.setAttribute("s1", t1);
		 RequestDispatcher r=request.getRequestDispatcher("setup.jsp");
		 r.forward(request, response);	
	     
	}

}
