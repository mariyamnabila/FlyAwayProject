package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import BookingTables1.Customer;
import BookingTables1.Flights;
import BookingTables1.SourceDest;
import BookingTables1.TravelDetails;
import dao.TravelDetailsImpl;

/**
 * Servlet implementation class bookingservlet
 */
public class bookingservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookingservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Customer cc=new Customer();
		
		 String a=request.getParameter("src");
	     String b=request.getParameter("des");
	     String c=request.getParameter("date");
	     int d=Integer.parseInt(request.getParameter("sea"));
	     LocalDate l=LocalDate.parse(c);
	     int e=l.getDayOfYear();
	     
	     PrintWriter p=response.getWriter();
	     
	     SourceDest sd=new SourceDest(a,b);
	    // TravelDetailsImpl td=new TravelDetailsImpl();
	     Session s=TravelDetailsImpl.getSession();
	     TravelDetails t1=s.get(TravelDetails.class,sd);
		 Query aaa=s.createNativeQuery("select DISTINCT day from seatsavailable ");
		 List<Integer> k=(List<Integer>)aaa.list();
	     
		  List<Flights> h;
	     if(t1!=null && k.contains(e)) {
	         h=t1.getF();
	         
	         HttpSession hh=request.getSession();
	         
	         cc.setSrc(a);
	         cc.setDest(b);
	         cc.setDate(c);
	         cc.setSeats(d);
	         
	         hh.setAttribute("loo", cc);
	         request.setAttribute("s1", h);
	         request.setAttribute("s2", t1);
	         request.setAttribute("s3", e);
	         request.setAttribute("s4", d);
	         
			 RequestDispatcher r=request.getRequestDispatcher("index.jsp");
			 r.forward(request, response);
	     }
	     else {
	    	 RequestDispatcher r=request.getRequestDispatcher("index.jsp");
			 r.forward(request, response);
			// p.print("no booking available for this route");
	    	 
	     }
	}

}
