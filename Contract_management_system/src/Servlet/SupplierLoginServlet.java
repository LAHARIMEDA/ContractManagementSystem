package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AdminDAOImpl;
import DAO1.SupplierDAOImpl;

/**
 * Servlet implementation class SupplierLoginServlet
 */
@WebServlet("/SupplierLoginServlet")
public class SupplierLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupplierLoginServlet() {
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

        int uname=Integer.parseInt(request.getParameter("uname"));
        String pwd=request.getParameter("pwd");
        SupplierDAOImpl implObj=new  SupplierDAOImpl();
        String pass=implObj.SupplierById(uname);
        
        if(pass.equals(pwd))
        {
        	
               request.getSession().setAttribute("Current_user_id",uname);
               response.sendRedirect("EditContract.jsp");
               
        }
        else
        {			System.out.println("Not Found");
               response.sendRedirect("Supplierlogin.jsp");
               
        }
		
	}

}
