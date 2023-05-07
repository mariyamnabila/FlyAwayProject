package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;
import BookingTables1.DayInfo;
import BookingTables1.Customer;
import BookingTables1.SeatsAvailable;
import dao.FlightsImpl;

/**
 * Servlet implementation class final1
 */
public class final1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public final1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter p=response.getWriter();
		HttpSession h=request.getSession(false);
		if(h!=null) {
			Customer c=(Customer) h.getAttribute("loo");
			//p.print(c);
			Session s=FlightsImpl.getSession();
			Transaction t=s.beginTransaction();
			String r=c.getDate();
			LocalDate l=LocalDate.parse(r);
		    int e=l.getDayOfYear();
			DayInfo d=new DayInfo(c.getFno(),e);
			SeatsAvailable ss=s.getReference(SeatsAvailable.class, d);
			int y=ss.getSeats()-c.getSeats();
			
			ss.setSeats(y);
			s.save(c);
			s.save(ss);
			
			
			
			
			
			
			t.commit();
			
			
			
			
			request.setAttribute("loo", c);
			RequestDispatcher rr=request.getRequestDispatcher("success.jsp");
			rr.forward(request, response);
		}
	}

	private SeatsAvailable getreference() {
		// TODO Auto-generated method stub
		return null;
	}

}
