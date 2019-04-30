package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO1.ContractDAO;
import DAO1.ContractDAOImpl;
import DAO1.TnCDAO;
import DAO1.TnCDAOImplement;
import model.Contract;
import model.TermsAndConditions;

/**
 * Servlet implementation class EditTnCServlet
 */
@WebServlet("/EditTnCServlet")
public class EditTnCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditTnCServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int Contract_id = Integer.parseInt(request.getParameter("contract_id"));
		String Term1=request.getParameter("term1");
		String Term2=request.getParameter("term2");
		String Term3=request.getParameter("term3");
		String Term4=request.getParameter("term4");
		String Term5=request.getParameter("term5");
		String Condition1=request.getParameter("Condition1");
		String Condition2=request.getParameter("Condition2");
		String Condition3=request.getParameter("Condition3");
		String Condition4=request.getParameter("Condition4");
		String Condition5=request.getParameter("Condition5");
		String other_Info=request.getParameter("other_info");
		TermsAndConditions TnC = new TermsAndConditions(Contract_id,Term1,Term2,Term3,Term4,Term5,Condition1,Condition2,Condition3,Condition4,Condition5,other_Info);
		TnCDAO dao = new TnCDAOImplement();
		dao.updateTnC(TnC);
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
