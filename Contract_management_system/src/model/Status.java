package model;

public class Status {
	private int Supplier_ID;
	private String Status;
	public int getSupplier_ID() {
		return Supplier_ID;
	}
	public void setSupplier_ID(int supplier_ID) {
		Supplier_ID = supplier_ID;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Status(int supplier_ID, String status) {
		super();
		Supplier_ID = supplier_ID;
		Status = status;
	}
	public Status(int supplier_ID) {
		super();
		Supplier_ID = supplier_ID;
	}
	

}
