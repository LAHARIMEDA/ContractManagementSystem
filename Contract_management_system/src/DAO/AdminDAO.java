package DAO;

import model.Admin;

public interface AdminDAO {

	public String AdminById(int adminId);
	public void addAdmin(Admin admin);
	
}
