package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO1.AmenitiesDAO;
import DAO1.AmenitiesDAOImpl;
import DAO1.TnCDAO;
import DAO1.TnCDAOImplement;
import model.Amenities;
import model.TermsAndConditions;

/**
 * Servlet implementation class AmenitiesServlet
 */
@WebServlet("/AmenitiesServlet")
public class AmenitiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AmenitiesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int Contract_ID = Integer.parseInt( request.getParameter("contract_id") );
		String Amenities1=request.getParameter("Amenity1");
		String Amenities2=request.getParameter("Amenity2");
		String Amenities3=request.getParameter("Amenity3");
		String Amenities4=request.getParameter("Amenity4");
		String Amenities5=request.getParameter("Amenity5");
		
		String Other_Info=request.getParameter("other_info");
		
		int id=Integer.parseInt(request.getSession().getAttribute("Current_user_id").toString());
		
		
		
		Amenities amenities = new Amenities(Contract_ID,Amenities1,Amenities2,Amenities3,Amenities4,Amenities5,Other_Info);
		AmenitiesDAO dao = new AmenitiesDAOImpl();
		dao.addAmenities(amenities);
		response.sendRedirect("home.jsp");
	}

}
