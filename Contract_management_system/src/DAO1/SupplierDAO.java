package DAO1;


import java.util.List;

import model.Supplier;

public interface SupplierDAO {
	public String SupplierById(int supplierId);
	public void addSupplier(Supplier supplier);
	//public  List<Supplier> listStatus();
	public void setStatus(int supplierID);
    public int getSupplierId(String emailid); 
    public Supplier getdet(int sup_id);
	public List<Supplier> suppliername();
	public List<Supplier> notApproved();
}