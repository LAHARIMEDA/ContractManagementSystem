package model;

public class Contract 
{
	 public Contract(String contract_Description, String contract_Submission_Date, String contract_Processing_Date,
			String contract_Status) {
		super();
		this.contract_Description = contract_Description;
		this.contract_Submission_Date = contract_Submission_Date;
		this.contract_Processing_Date = contract_Processing_Date;
		this.contract_Status = contract_Status;
		
	}
	public Contract(int contract_ID) {
		super();
		this.contract_ID = contract_ID;
	}
	private int contract_ID;
	 private String contract_Description;
	 private String contract_Submission_Date;
	 private String contract_Processing_Date;
	 private String contract_Status;
	 //private int supplier_ID;
	public int getContract_ID() {
		return contract_ID;
	}
	public void setContract_ID(int contract_ID) {
		this.contract_ID = contract_ID;
	}
	public String getContract_Description() {
		return contract_Description;
	}
	public void setContract_Description(String contract_Description) {
		this.contract_Description = contract_Description;
	}
	public String getContract_Submission_Date() {
		return contract_Submission_Date;
	}
	public void setContract_Submission_Date(String contract_Submission_Date) {
		this.contract_Submission_Date = contract_Submission_Date;
	}
	public String getContract_Processing_Date() {
		return contract_Processing_Date;
	}
	public void setContract_Processing_Date(String contract_Processing_Date) {
		this.contract_Processing_Date = contract_Processing_Date;
	}
	public String getContract_Status() {
		return contract_Status;
	}
	public void setContract_Status(String contract_Status) {
		this.contract_Status = contract_Status;
	}
	public Contract() {
		super();
	}
	public Contract(int contract_ID, String contract_Description, String contract_Submission_Date,
			String contract_Processing_Date, String contract_Status) {
		super();
		this.contract_ID = contract_ID;
		this.contract_Description = contract_Description;
		this.contract_Submission_Date = contract_Submission_Date;
		this.contract_Processing_Date = contract_Processing_Date;
		this.contract_Status = contract_Status;
	}
	public Contract(int contract_ID, String contract_Submission_Date, String contract_Processing_Date) {
		super();
		this.contract_ID = contract_ID;
		this.contract_Submission_Date = contract_Submission_Date;
		this.contract_Processing_Date = contract_Processing_Date;
	}
	 

}
