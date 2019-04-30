package DAO1;


import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


import model.Amenities;
import model.DB;
import model.TermsAndConditions;

public class AmenitiesDAOImpl implements AmenitiesDAO{

	@Override
	public void addAmenities(Amenities Amenities) {
		try {
			Connection con = DB.getConnection();
			String sql = "insert into Amenities(Contract_ID,Amenities1,Amenities2,Amenities3,Amenities4,Amenities5,Other_Info) values (?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,Amenities.getContract_ID());
			ps.setString(2,Amenities.getAmenities1());
			ps.setString(3,Amenities.getAmenities2());
			ps.setString(4, Amenities.getAmenities3());
			ps.setString(5, Amenities.getAmenities4());
			ps.setString(6, Amenities.getAmenities5());
			ps.setString(7, Amenities.getOther_Info());
			
			
			int rowaffected = 	ps.executeUpdate();
			System.out.println(rowaffected + " rows inserted");		
			con.close();
			 }catch(Exception e){
				 System.out.println("Error  : " + e);
			 }
		
	}

	@Override
	public Amenities getamenities(int cont_id) {
		try {
			Connection con = DB.getConnection();
			String sql = "select * from amenities where Contract_ID="+cont_id	;
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
			Amenities amenities=new Amenities(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				return amenities;
				
			}
		    
			
              }catch(Exception e) {
			
			System.out.println("Error in amenities "+e);
		}
		return null;
	}

	@Override
	public void updateamenities(Amenities amenities) {
		try {
			Connection con = DB.getConnection();
			
			String sql = "update Amenities set Amenities1=?,Amenities2=?,Amenities3=?,Amenities4=?,Amenities5=?,Other_Info=? where Contract_ID =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,amenities.getAmenities1());
			ps.setString(2,amenities.getAmenities2());
			ps.setString(3,amenities.getAmenities3());
			ps.setString(4,amenities.getAmenities4());
			ps.setString(5,amenities.getAmenities5());
			
			ps.setString(6, amenities.getOther_Info());
			ps.setInt(7,amenities.getContract_ID());
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println("Error in approval "+e);
		}
		
	}

}
