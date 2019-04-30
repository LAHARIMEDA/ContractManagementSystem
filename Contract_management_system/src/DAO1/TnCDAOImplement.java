package DAO1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Contract;
import model.DB;
import model.TermsAndConditions;

public class TnCDAOImplement implements TnCDAO
{

	@Override
	public void addTnC(TermsAndConditions TnC) 
	{
		try {
			Connection con = DB.getConnection();
			String sql = "insert into terms_and_conditions(Contract_ID,Term1,Term2,Term3,Term4,Term5,Condition1,Condition2,Condition3,Condition4,Condition5,Other_Info) values (?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,TnC.getContract_ID());
			ps.setString(2,TnC.getTerm1());
			ps.setString(3,TnC.getTerm2());
			ps.setString(4,TnC.getTerm3());
			ps.setString(5,TnC.getTerm4());
			ps.setString(6,TnC.getTerm5());
			ps.setString(7,TnC.getCondition1());
			ps.setString(8,TnC.getCondition2());
			ps.setString(9,TnC.getCondition3());
			ps.setString(10,TnC.getCondition4());
			ps.setString(11,TnC.getCondition5());
			ps.setString(12, TnC.getOther_Info());
			
			
			int rowaffected = 	ps.executeUpdate();
			System.out.println(rowaffected + " rows inserted");		
			con.close();
			 }catch(Exception e){
				 System.out.println("Error  : " + e);
			 }
		
	}

	@Override
	public TermsAndConditions getTnC(int cont_id) {
		try {
			Connection con = DB.getConnection();
			String sql = "select * from terms_and_conditions where Contract_ID="+cont_id	;
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
				TermsAndConditions TnC=new TermsAndConditions(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12));
				return TnC;
				
			}
		    
			
              }catch(Exception e) {
			
			System.out.println("Error in listStatus "+e);
		}
		return null;
	}

	@Override
	public void updateTnC(TermsAndConditions TnC) {
		try {
			Connection con = DB.getConnection();
			
			String sql = "update terms_and_conditions set Term1=?,Term2=?,Term3=?,Term4=?,Term5=?,Condition1=?,Condition2=?,Condition3=?,Condition4=?,Condition5=?,Other_Info=? where Contract_ID =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,TnC.getTerm1());
			ps.setString(2, TnC.getTerm2());
			ps.setString(3,TnC.getTerm3());
			ps.setString(4,TnC.getTerm4());
			ps.setString(5, TnC.getTerm5());
			ps.setString(6, TnC.getCondition1());
			ps.setString(7, TnC.getCondition2());
			ps.setString(8, TnC.getCondition3());
			ps.setString(9, TnC.getCondition4());
			ps.setString(10,TnC.getCondition5());
			ps.setString(11, TnC.getOther_Info());
			ps.setInt(12, TnC.getContract_ID());
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println("Error in approval "+e);
		}
		
	}
	

}
