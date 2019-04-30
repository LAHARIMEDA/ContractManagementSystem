package model;

public class Supplier {
	 private int supplier_ID;
	 private String frist_Name;
	 private String last_Name;
	 private int age;
	 private String gender;
	 private String dOB;
	 private long contact_Number;
	 private long alt_contact_number;
	 private String email_ID;
	 private String password;
	 private String address_Line_1;
	 private String address_Line_2;
	 private String city;
	 private String state;
	 private String zipcode;
	 private String status;
	public Supplier() {
		super();
	}
	public Supplier(int supplier_ID, String frist_Name, String last_Name, int age, String gender, String dOB,
			long contact_Number, long alt_contact_number, String email_ID, String password, String address_Line_1,
			String address_Line_2, String city, String state, String zipcode) {
		super();
		this.supplier_ID = supplier_ID;
		this.frist_Name = frist_Name;
		this.last_Name = last_Name;
		this.age = age;
		this.gender = gender;
		this.dOB = dOB;
		this.contact_Number = contact_Number;
		this.alt_contact_number = alt_contact_number;
		this.email_ID = email_ID;
		this.password = password;
		this.address_Line_1 = address_Line_1;
		this.address_Line_2 = address_Line_2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	public int getSupplier_ID() {
		return supplier_ID;
	}
	public void setSupplier_ID(int supplier_ID) {
		this.supplier_ID = supplier_ID;
	}
	public String getFrist_Name() {
		return frist_Name;
	}
	public void setFrist_Name(String frist_Name) {
		this.frist_Name = frist_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getdOB() {
		return dOB;
	}
	public void setdOB(String dOB) {
		this.dOB = dOB;
	}
	public long getContact_Number() {
		return contact_Number;
	}
	public void setContact_Number(long contact_Number) {
		this.contact_Number = contact_Number;
	}
	public long getAlt_contact_number() {
		return alt_contact_number;
	}
	public void setAlt_contact_number(long alt_contact_number) {
		this.alt_contact_number = alt_contact_number;
	}
	public String getEmail_ID() {
		return email_ID;
	}
	public void setEmail_ID(String email_ID) {
		this.email_ID = email_ID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress_Line_1() {
		return address_Line_1;
	}
	public void setAddress_Line_1(String address_Line_1) {
		this.address_Line_1 = address_Line_1;
	}
	public String getAddress_Line_2() {
		return address_Line_2;
	}
	public void setAddress_Line_2(String address_Line_2) {
		this.address_Line_2 = address_Line_2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Supplier(String frist_Name, String last_Name, int age, String gender, String dOB, long contact_Number,
			long alt_contact_number, String email_ID, String password, String address_Line_1, String address_Line_2,
			String city, String state, String zipcode) 
	{
		super();
		this.frist_Name = frist_Name;
		this.last_Name = last_Name;
		this.age = age;
		this.gender = gender;
		this.dOB = dOB;
		this.contact_Number = contact_Number;
		this.alt_contact_number = alt_contact_number;
		this.email_ID = email_ID;
		this.password = password;
		this.address_Line_1 = address_Line_1;
		this.address_Line_2 = address_Line_2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	public Supplier(int supplier_ID, String frist_Name, String status) {
		super();
		this.supplier_ID = supplier_ID;
		this.frist_Name = frist_Name;
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
