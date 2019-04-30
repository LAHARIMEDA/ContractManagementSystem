package DAO1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Contract;
import model.DB;
import model.Status;

public class ContractDAOImpl implements ContractDAO{

	@Override
	public void addContract(Contract contract,int sup_id) {
		try {
			Connection con = DB.getConnection();
			String sql = "insert into Contract(Contract_Description,Contract_Submission_Date,Contract_Processing_Date,Contract_Status,Supplier_id) values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1,contract.getContract_Description());
			ps.setString(2,contract.getContract_Submission_Date());
			ps.setString(3, contract.getContract_Submission_Date());
			ps.setString(4, "submitted");
			ps.setInt(5, sup_id);
			
			int rowaffected = 	ps.executeUpdate();
			System.out.println(rowaffected + " rows inserted");		
			con.close();
			 }catch(Exception e){
				 System.out.println("Error  : " + e);
			 }
		
		
		
	}

	@Override
	public int getLastContract() {
		// TODO Auto-generated method stub
		int contract_id=0;
		try {
			Connection con = DB.getConnection();
			String sql = "select contract_id from contract order by contract_id desc";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			rs.next();
			System.out.println("Contract Last registered was with ID : "+ rs.getInt(1));
			contract_id = rs.getInt(1);
			con.close();
			 }catch(Exception e){
				 System.out.println("Error  getLastContracT(): " + e);
			 }
		return contract_id;
	}

	@Override
	public List<Contract> listStatus(int sup_id) {
		try{
			List<Contract> list = new ArrayList<>();
			Connection con = DB.getConnection();
		String sql = "select Contract_ID,Contract_Submission_Date,Contract_Processing_Date from Contract where Contract_Status = 'submitted' and Supplier_ID="+sup_id;
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			Contract cont=new Contract(rs.getInt(1),rs.getString(2),rs.getString(3));
			list.add(cont);
			
		}
	     
		
		return list;
		}catch(Exception e) {
			
			System.out.println("Error in listStatus "+e);
		}
		return null;
	}

	@Override
	public Contract getContract(int cont_id) {
		try {
			Connection con = DB.getConnection();
			String sql = "select * from contract where Contract_ID="+cont_id	;
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
				Contract cont=new Contract(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				return cont;
				
			}
		    
			
              }catch(Exception e) {
			
			System.out.println("Error in listStatus "+e);
		}
	
		return null;
	}

	@Override
	public void approveStatus(int cont_id) {
		try {
			Connection con = DB.getConnection();
			String sql = "update Contract set Contract_Status=? where Contract_ID =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,"Approved");
			ps.setInt(2,cont_id );
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println("Error in approval "+e);
		}
		
	}

	@Override
	public void rejectStatus(int cont_id) {
		try {
			Connection con = DB.getConnection();
			String sql = "update Contract set Contract_Status=? where Contract_ID =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,"Rejected");
			ps.setInt(2,cont_id );
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println("Error in approval "+e);
		}
				
	}

	@Override
	public List<Contract> listidRej(int sup_id) {
		try{
			List<Contract> list = new ArrayList<>();
			Connection con = DB.getConnection();
		String sql = "select Contract_ID,Contract_Submission_Date,Contract_Processing_Date from Contract where Contract_Status = 'Rejected' and Supplier_ID="+sup_id;
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			Contract cont=new Contract(rs.getInt(1),rs.getString(2),rs.getString(3));
			list.add(cont);
			
		}
	     
		
		return list;
		}catch(Exception e) {
			
			System.out.println("Error in listidrej "+e);
		}
		return null;
	}

	@Override
	public Contract listconRej(int cont_id) {
		try{
			Contract cont = null;
			Connection con = DB.getConnection();
		String sql = "select * from Contract where Contract_Status = 'Rejected' and Contract_ID="+cont_id;
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			cont=new Contract(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			
			
		}
	     
		
		return cont;
		}catch(Exception e) {
			
			System.out.println("Error in listconrej "+e);
		}
		return null;
	}

	@Override
	public void updateContract(Contract contract) {
		try {
			Connection con = DB.getConnection();
			System.out.println(contract.getContract_Processing_Date());
			String sql = "update Contract set Contract_description=?,Contract_Submission_Date=?,Contract_Processing_Date=?,Contract_Status=? where Contract_ID =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,contract.getContract_Description());
			ps.setString(2, contract.getContract_Submission_Date());
			ps.setString(3, contract.getContract_Processing_Date());
			ps.setString(4,"submitted");
			ps.setInt(5, contract.getContract_ID());
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println("Error in approval "+e);
		}
		
		
	}

	

}
