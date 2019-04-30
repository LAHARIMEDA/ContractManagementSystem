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
 * Servlet implementation class EditamenitiesServlet
 */
@WebServlet("/EditamenitiesServlet")
public class EditamenitiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditamenitiesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int Contract_id = Integer.parseInt(request.getParameter("contract_id"));
		String Amenities1=request.getParameter("Amenity1");
		String Amenities2=request.getParameter("Amenity2");
		String Amenities3=request.getParameter("Amenity3");
		String Amenities4=request.getParameter("Amenity4");
		String Amenities5=request.getParameter("Amenity5");
		
		String other_Info=request.getParameter("other_info");
		Amenities amenities = new Amenities(Contract_id,Amenities1,Amenities2,Amenities3,Amenities4,Amenities5,other_Info);
		AmenitiesDAO dao = new AmenitiesDAOImpl();
		dao.updateamenities(amenities);
		 response.sendRedirect("DisplayRej.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
