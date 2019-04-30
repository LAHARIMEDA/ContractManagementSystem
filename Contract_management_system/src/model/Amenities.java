package model;

public class Amenities {
	private int contract_ID;
	private String amenities1;
	private String amenities2;
	private String amenities3;
	private String amenities4;
	private String amenities5;
	private String other_Info;
	public int getContract_ID() {
		return contract_ID;
	}
	public void setContract_ID(int contract_ID) {
		this.contract_ID = contract_ID;
	}
	public String getAmenities1() {
		return amenities1;
	}
	public void setAmenities1(String amenities1) {
		this.amenities1 = amenities1;
	}
	public String getAmenities2() {
		return amenities2;
	}
	public void setAmenities2(String amenities2) {
		this.amenities2 = amenities2;
	}
	public String getAmenities3() {
		return amenities3;
	}
	public void setAmenities3(String amenities3) {
		this.amenities3 = amenities3;
	}
	public String getAmenities4() {
		return amenities4;
	}
	public void setAmenities4(String amenities4) {
		this.amenities4 = amenities4;
	}
	public String getAmenities5() {
		return amenities5;
	}
	public void setAmenities5(String amenities5) {
		this.amenities5 = amenities5;
	}
	public String getOther_Info() {
		return other_Info;
	}
	public void setOther_Info(String other_Info) {
		this.other_Info = other_Info;
	}
	public Amenities(int contract_ID, String amenities1, String amenities2, String amenities3, String amenities4,
			String amenities5, String other_Info) {
		super();
		this.contract_ID = contract_ID;
		this.amenities1 = amenities1;
		this.amenities2 = amenities2;
		this.amenities3 = amenities3;
		this.amenities4 = amenities4;
		this.amenities5 = amenities5;
		this.other_Info = other_Info;
	}
	public Amenities() {
		super();
	}
	
}
