package DAO1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Supplier;

import model.DB;
import model.Status;

public class SupplierDAOImpl implements SupplierDAO 
{

	@Override
	public String SupplierById(int supplierId) {
		
			String pass=null;
			try {
			Connection con=DB.getConnection();
			
			String qry="select password from Supplier where Supplier_ID ="+supplierId;
			System.out.println(qry);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(qry);
			while(rs.next()) {
				pass=rs.getString(1);
				 //System.out.println(pass);
			}
		
			}
			catch(Exception ex){
				System.out.println("Error :"+ex);
				
			}
			return pass;
		
		
	}

	@Override
	public void addSupplier(Supplier supplier) {
		try {
			Connection con = DB.getConnection();
			String sql = "insert into Supplier(First_Name,Last_Name,Age,Gender,DoB,Contact_Number,Alt_Contact_Number,Email_ID,password,Address_Line_1,Address_Line_2,City,State,Zipcode) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			//ps.setInt(1, admin.getAdmin_ID());
			ps.setString(1, supplier.getFrist_Name());
			ps.setString(2,supplier.getLast_Name());
			ps.setInt(3, supplier.getAge());
			ps.setString(4,supplier.getGender());
			ps.setString(5,supplier.getdOB());
			ps.setLong(6,supplier.getContact_Number());
			ps.setLong(7,supplier.getAlt_contact_number());
			ps.setString(8,supplier.getEmail_ID());
			ps.setString(9,supplier.getPassword());
			ps.setString(10,supplier.getAddress_Line_1());
			ps.setString(11,supplier.getAddress_Line_2());
			ps.setString(12,supplier.getCity());
			ps.setString(13,supplier.getState());
			ps.setString(14,supplier.getZipcode());
			int rowaffected = 	ps.executeUpdate();
			System.out.println(rowaffected + " rows inserted");		
			con.close();
			 }catch(Exception e){
				 System.out.println("Error  : " + e);
			 }
		
		
	}

	

	@Override
	public void setStatus(int supplierID) {
	try {
		Connection con = DB.getConnection();
		String sql = "insert into Status values(?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, supplierID);
		ps.setString(2,"not Approved");
		ps.executeUpdate();
		
	}catch(Exception e) {
		System.out.println("Erro in set Status "+e);
		
	}
		
	}

	@Override
	public int getSupplierId(String emailid) {
		int supplierId = 0;
		try {
			Connection con = DB.getConnection();
			String sql = "select Supplier_ID from Supplier where Email_ID =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, emailid);
			ResultSet rs = ps.executeQuery();
			rs.next();
			supplierId = rs.getInt(1);
			return supplierId;
			
		}catch(Exception e) {
			System.out.println("Error in getSupplier "+e);
			return supplierId;		}
	}

	@Override
	public Supplier getdet(int sup_id) 
	{
		Supplier obj=new Supplier();
		try {
			Connection con = DB.getConnection();
			String qry="Select * from Supplier where Supplier_ID="+sup_id;
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(qry);
			while(rs.next())
			{
			obj=new Supplier( rs.getInt(1),rs.getString(2), rs.getString(3), rs.getInt(4),rs.getString(5),rs.getString(6),rs.getLong(7),rs.getLong(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15));
			}
			con.close();
			
		}
		catch(Exception E) 
		{
			System.out.println("Exception at getting details "+E);
		}
		return obj;
	}

	@Override
	public List<Supplier> suppliername() {
		try{
			List<Supplier> list = new ArrayList<>();
			Connection con = DB.getConnection();
		String sql = "SELECT t1.supplier_id, t1.first_name, t2.status FROM supplier t1, status t2 where t1.supplier_id = t2.id  and t2.status like 'Approved'; ";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			Supplier sup = new Supplier(rs.getInt(1),rs.getString(2),rs.getString(3));
			list.add(sup);
			
		}
	     
		
		return list;
		}catch(Exception e) {
			
			System.out.println("Error in listStatus "+e);
		}
		return null;
	}

	@Override
	public List<Supplier> notApproved() {
		try{
			List<Supplier> list = new ArrayList<>();
			Connection con = DB.getConnection();
		String sql = "SELECT t1.supplier_id, t1.first_name, t2.status FROM supplier t1, status t2 where t1.supplier_id = t2.id  and t2.status like 'not Approved'; ";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			Supplier sup = new Supplier(rs.getInt(1),rs.getString(2),rs.getString(3));
			list.add(sup);
			
		}
	     
		
		return list;
		}catch(Exception e) {
			
			System.out.println("Error in listStatus "+e);
		}
		return null;
	}
	
	
		
	}



