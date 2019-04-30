package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AdminDAO;
import DAO.AdminDAOImpl;
import DAO1.ContractDAO;
import DAO1.ContractDAOImpl;
import model.Admin;
import model.Contract;

/**
 * Servlet implementation class ContractCreateServlet
 */
@WebServlet("/ContractCreateServlet")
public class ContractCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContractCreateServlet() {
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
		
		
		String Contract_Description=request.getParameter("contract_desc");
		String Contract_Submission_Date=request.getParameter("contract_sub_date");
		String Contract_Processing_Date=request.getParameter("contract_proc_date");
		String Contract_Status=request.getParameter("contract_status");
		int id=Integer.parseInt(request.getSession().getAttribute("Current_user_id").toString());
		
		
		
		Contract contract = new Contract(Contract_Description,Contract_Submission_Date,Contract_Processing_Date, Contract_Status);
		ContractDAO dao = new ContractDAOImpl();
		dao.addContract(contract,id);
		 response.sendRedirect("TermsAndConditions.jsp");
		
	}

}
