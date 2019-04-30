package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO1.AmenitiesDAO;
import DAO1.AmenitiesDAOImpl;
import DAO1.ContractDAO;
import DAO1.ContractDAOImpl;
import DAO1.TnCDAO;
import DAO1.TnCDAOImplement;
import model.Amenities;
import model.Contract;
import model.TermsAndConditions;

/**
 * Servlet implementation class EditContractServlet
 */
@WebServlet("/EditContractServlet")
public class EditContractServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditContractServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int Contract_id = Integer.parseInt(request.getParameter("contract_id"));
		String Contract_Description=request.getParameter("contract_desc");
		String Contract_Submission_Date=request.getParameter("contract_sub_date");
		String Contract_Processing_Date=request.getParameter("contract_proc_date");
		String Contract_Status=request.getParameter("contract_status");
		Contract contract = new Contract(Contract_id,Contract_Description,Contract_Submission_Date,Contract_Processing_Date, Contract_Status);
		ContractDAO dao = new ContractDAOImpl();
		dao.updateContract(contract);
	
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
			TnCDAO dao1 = new TnCDAOImplement();
			dao1.updateTnC(TnC);
		
			
				String Amenities1=request.getParameter("Amenity1");
				String Amenities2=request.getParameter("Amenity2");
				String Amenities3=request.getParameter("Amenity3");
				String Amenities4=request.getParameter("Amenity4");
				String Amenities5=request.getParameter("Amenity5");
				
				String other_Info1=request.getParameter("other_info");
				Amenities amenities = new Amenities(Contract_id,Amenities1,Amenities2,Amenities3,Amenities4,Amenities5,other_Info1);
				AmenitiesDAO dao2 = new AmenitiesDAOImpl();
				dao2.updateamenities(amenities);
				 response.sendRedirect("EditContract.jsp");
	}

}
