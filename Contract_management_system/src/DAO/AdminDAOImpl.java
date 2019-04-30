package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;



import model.Admin;
import model.DB;

public class AdminDAOImpl implements AdminDAO {

	@Override
	public String AdminById(int adminId) {
		String pass=null;
		try {
		Connection con=DB.getConnection();
		
		String qry="select password from admin_1 where Admin_ID ="+adminId;
		System.out.println(qry);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(qry);
		while(rs.next()) {
			pass=rs.getString(1);
			 System.out.println(pass);
		}
	
		}
		catch(Exception ex){
			System.out.println("Error :"+ex);
			
		}
		return pass;
	}

	@Override
	public void addAdmin(Admin admin) {
		 try {
				Connection con = DB.getConnection();
				String sql = "insert into admin_1(First_Name,Last_Name,Age,Gender,DoB,Contact_Number,Alt_Contact_Number,Email_ID,password) values (?,?,?,?,?,?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				//ps.setInt(1, admin.getAdmin_ID());
				ps.setString(1, admin.getFrist_Name());
				ps.setString(2,admin.getLast_Name());
				ps.setInt(3, admin.getAge());
				ps.setString(4,admin.getGender());
				ps.setString(5,admin.getdOB());
				ps.setLong(6,admin.getContact_Number());
				ps.setLong(7,admin.getAlt_contact_number());
				ps.setString(8,admin.getEmail_ID());
				ps.setString(9,admin.getPassword());
				
				
				int rowaffected = 	ps.executeUpdate();
				System.out.println(rowaffected + " rows inserted");		
				con.close();
				 }catch(Exception e){
					 System.out.println("Error  : " + e);
				 }
		
	}
}

