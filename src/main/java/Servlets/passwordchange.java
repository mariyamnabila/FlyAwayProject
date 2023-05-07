package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import BookingTables1.Adim;
import dao.TravelDetailsImpl;

/**
 * Servlet implementation class passwordchange
 */
public class passwordchange extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public passwordchange() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String np=request.getParameter("np");
		String user=request.getParameter("use");
		Session s=TravelDetailsImpl.getSession();
		Adim a=s.get(Adim.class, user);
		a.setPass(np);
		
		
		
	}

}
