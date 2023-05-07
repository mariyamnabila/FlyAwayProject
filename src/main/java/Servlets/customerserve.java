package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import BookingTables1.Customer;
import dao.FlightsImpl;

/**
 * Servlet implementation class customerserve
 */
public class customerserve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public customerserve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a=request.getParameter("ad");
		int b=Integer.parseInt(request.getParameter("ag"));
		String c=request.getParameter("ci");
	    String d=request.getParameter("na");
	    String e=request.getParameter("phno");
		HttpSession h=request.getSession(false);
		if(h!=null) {
			Customer cc=(Customer) h.getAttribute("loo");
			
			cc.setAdhaarno(a);
			cc.setAge(b);
			cc.setCity(c);
			cc.setName(d);
			cc.setPno(e);
			
		//	response.sendRedirect("payment.jsp");
			FlightsImpl fi=new FlightsImpl();
			int y=fi.getprice(cc.getFno(),cc.getSrc(), cc.getDest(),cc.getSeats());
			h.setAttribute("loo", cc);
			request.setAttribute("pu", y);
			 RequestDispatcher r=request.getRequestDispatcher("payment.jsp");
			 r.forward(request, response);	
			
			
			
		/*	PrintWriter p=response.getWriter();
			p.print(cc);*/
		}
		
		
	}

}
