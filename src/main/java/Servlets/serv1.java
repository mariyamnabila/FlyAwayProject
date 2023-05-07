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

/**
 * Servlet implementation class serv1
 */
public class serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serv1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int c=Integer.parseInt(request.getParameter("fno"));
	    PrintWriter p=response.getWriter();
	    HttpSession h=request.getSession(false);
		if(h!=null) {
			Customer cc=(Customer) h.getAttribute("loo");
			cc.setFno(c);
			h.setAttribute("loo", cc);
			response.sendRedirect("register.jsp");
		}
	   /* RequestDispatcher r=request.getRequestDispatcher("register.jsp");
		r.forward(request, response);	*/
	     
	}

}
