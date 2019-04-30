package DAO1;

import java.util.List;

import model.Status;


public interface StatusDAO {
	public  List<Status> listStatus();
	public void approveStatus(int supplierID);
	public void rejectStatus(int supplierID);
	public  List<Status> listStatusApp();
}
