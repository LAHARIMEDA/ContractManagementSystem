package model;

public class Admin {
 private int admin_ID;
 private String frist_Name;
 private String last_Name;
 private int age;
 private String gender;
 private String dOB;
 private long contact_Number;
 private long alt_contact_number;
 private String password;
 private String email_ID;
public Admin(int admin_ID, String frist_Name, String last_Name, int age, String gender, String dOB,
		long contact_Number, long alt_contact_number, String password, String email_ID) {
	super();
	this.admin_ID = admin_ID;
	this.frist_Name = frist_Name;
	this.last_Name = last_Name;
	this.age = age;
	this.gender = gender;
	this.dOB = dOB;
	this.contact_Number = contact_Number;
	this.alt_contact_number = alt_contact_number;
	this.password = password;
	this.email_ID = email_ID;
}
public Admin(String frist_Name, String last_Name, int age, String gender, String dOB,
		long contact_Number, long alt_contact_number, String password, String email_ID) {
	super();
	
	this.frist_Name = frist_Name;
	this.last_Name = last_Name;
	this.age = age;
	this.gender = gender;
	this.dOB = dOB;
	this.contact_Number = contact_Number;
	this.alt_contact_number = alt_contact_number;
	this.password = password;
	this.email_ID = email_ID;
}
public Admin() {
	super();
}
public int getAdmin_ID() {
	return admin_ID;
}
public void setAdmin_ID(int admin_ID) {
	this.admin_ID = admin_ID;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail_ID() {
	return email_ID;
}
public void setEmail_ID(String email_ID) {
	this.email_ID = email_ID;
}

}
