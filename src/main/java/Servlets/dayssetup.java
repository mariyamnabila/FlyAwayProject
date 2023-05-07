package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import BookingTables1.Flights;
import dao.FlightsImpl;
import dao.TravelDetailsImpl;
import BookingTables1.DayInfo;
import BookingTables1.SeatsAvailable;

/**
 * Servlet implementation class dayssetup
 */
public class dayssetup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dayssetup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		    Calendar c = Calendar.getInstance();
			int z=c.get(Calendar.DAY_OF_YEAR);
			Session s=TravelDetailsImpl.getSession();
			Query aaa=s.createNativeQuery("select DISTINCT day from seatsavailable ");
		    List<Integer> k=(List<Integer>)aaa.list();
		    PrintWriter p=response.getWriter();
		    
		    for(int x:k) {
		    	if(x<z) {
		         Query a=s.createNativeQuery("delete from seatsavailable where day=:n");
		         a.setParameter("n", x);
		    	}
		    }
			FlightsImpl fi=new FlightsImpl();
			List<Flights> f=fi.getAll();
			Transaction t=s.beginTransaction();
			SeatsAvailable sa;
			for(int a=z;a<=z+2;a++) {
			
			for(Flights v:f) {
				DayInfo di=new DayInfo(v.getFlightno(),a);
				sa=s.get(SeatsAvailable.class, di);
				if(sa==null) {
					sa=new SeatsAvailable(di,v.gettSeats());
					s.save(sa);
				}
			}
			}
			t.commit();
			RequestDispatcher r=request.getRequestDispatcher("setup.jsp");
			r.include(request, response);
			p.print("done");
			
			
			
	}

}
