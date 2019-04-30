package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AdminDAO;
import DAO.AdminDAOImpl;
import DAO1.SupplierDAO;
import DAO1.SupplierDAOImpl;
import model.Supplier;

/**
 * Servlet implementation class AdminRegServlet
 */
@WebServlet("/SupRegServlet")
public class SupRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupRegServlet() {
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
		// TODO Auto-generated method stub
	
		
		String First_Name=request.getParameter("fname");
		String Last_Name=request.getParameter("lname");
		int Age=Integer.parseInt(request.getParameter("age"));
		String Gender=request.getParameter("gender");
		String DoB=request.getParameter("dob");
		Long Contact_Number=Long.parseLong(request.getParameter("conno"));
		Long Alt_contact_Number=Long.parseLong(request.getParameter("altconno"));
		String password=request.getParameter("password");
		String Email_ID=request.getParameter("email");
		String Address_Line_1=request.getParameter("address1");
		String Address_Line_2=request.getParameter("address2");
		String City=request.getParameter("city");
		String State=request.getParameter("state");
		String Zipcode=request.getParameter("zipcode");
		Supplier supplier =new Supplier(First_Name, Last_Name, Age, Gender,DoB, Contact_Number, Alt_contact_Number,Email_ID,password,Address_Line_1,Address_Line_2,City,State,Zipcode);
		SupplierDAO dao = new SupplierDAOImpl();
		dao.addSupplier(supplier);
		int supplierId = dao.getSupplierId(Email_ID);
		dao.setStatus(supplierId);
		request.getSession().setAttribute("idde",Email_ID);
		response.sendRedirect("home.jsp");
	
	}

}
