package DAO1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sun.corba.se.impl.encoding.CodeSetComponentInfo.CodeSetComponent;

import model.DB;
import model.Status;
import model.Supplier;

public class StatusDAOImpl implements StatusDAO {

	@Override
	public List<Status> listStatus() {
		try{
			List<Status> list = new ArrayList<>();
			Connection con = DB.getConnection();
		String sql = "select * from Status where Status = 'not Approved'";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			Status sup=new Status(rs.getInt(1));
			list.add(sup);
			
		}
	     
		
		return list;
		}catch(Exception e) {
			
			System.out.println("Error in listStatus "+e);
		}
		return null;
	}

	@Override
	public void approveStatus(int supplierID) {
		try {
			Connection con = DB.getConnection();
			String sql = "update status set status=? where id =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,"Approved");
			ps.setInt(2, supplierID);
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println("Error in approval "+e);
		}
		
	}

	@Override
	public void rejectStatus(int supplierID) {
		try {
			Connection con = DB.getConnection();
			String sql = "update status set status=? where id =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,"rejected");
			ps.setInt(2, supplierID);
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println("Error in reject "+e);
		}
		
		
	}

	@Override
	public List<Status> listStatusApp() {
		try{
			List<Status> list = new ArrayList<>();
			Connection con = DB.getConnection();
		String sql = "select * from Status where Status = 'Approved'";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			Status sup=new Status(rs.getInt(1));
			list.add(sup);
			
		}
	     
		
		return list;
		}catch(Exception e) {
			
			System.out.println("Error in listStatus "+e);
		}
		
		return null;
	}

}
