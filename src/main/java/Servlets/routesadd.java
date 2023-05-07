package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import BookingTables1.TravelDetails;
import dao.TravelDetailsImpl;
import config.Configmain;

/**
 * Servlet implementation class routesadd
 */
public class routesadd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public routesadd() {
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
	     int d=Integer.parseInt(request.getParameter("tra"));
	     PrintWriter p=response.getWriter();
	     TravelDetailsImpl td=new TravelDetailsImpl();
	     TravelDetails t1=td.add(a,b,d);
	     request.setAttribute("s1", t1);
		 RequestDispatcher r=request.getRequestDispatcher("Routes.jsp");
		 r.forward(request, response);	
				
	}

}
