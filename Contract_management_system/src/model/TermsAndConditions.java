package model;

public class TermsAndConditions 
{
	private int contract_ID; 
	private String Term1;
	 private String Term2;
	 private String Term3;
	 private String Term4;
	 private String Term5;
	 private String Condition1;
	 private String Condition2;
	 private String Condition3;
	 private String Condition4;
	 private String Condition5;
	 private String other_Info;
	public TermsAndConditions(int contract_ID, String term1, String term2, String term3, String term4, String term5,
			String condition1, String condition2, String condition3, String condition4, String condition5,
			String other_Info) {
		super();
		this.contract_ID = contract_ID;
		Term1 = term1;
		Term2 = term2;
		Term3 = term3;
		Term4 = term4;
		Term5 = term5;
		Condition1 = condition1;
		Condition2 = condition2;
		Condition3 = condition3;
		Condition4 = condition4;
		Condition5 = condition5;
		this.other_Info = other_Info;
	}
	public int getContract_ID() {
		return contract_ID;
	}
	public TermsAndConditions(String term1, String term2, String term3, String term4, String term5, String condition1,
			String condition2, String condition3, String condition4, String condition5, String other_Info) {
		super();
		Term1 = term1;
		Term2 = term2;
		Term3 = term3;
		Term4 = term4;
		Term5 = term5;
		Condition1 = condition1;
		Condition2 = condition2;
		Condition3 = condition3;
		Condition4 = condition4;
		Condition5 = condition5;
		this.other_Info = other_Info;
	}
	public void setContract_ID(int contract_ID) {
		this.contract_ID = contract_ID;
	}
	public String getTerm1() {
		return Term1;
	}
	public void setTerm1(String term1) {
		Term1 = term1;
	}
	public String getTerm2() {
		return Term2;
	}
	public void setTerm2(String term2) {
		Term2 = term2;
	}
	public String getTerm3() {
		return Term3;
	}
	public void setTerm3(String term3) {
		Term3 = term3;
	}
	public String getTerm4() {
		return Term4;
	}
	public void setTerm4(String term4) {
		Term4 = term4;
	}
	public String getTerm5() {
		return Term5;
	}
	public void setTerm5(String term5) {
		Term5 = term5;
	}
	public String getCondition1() {
		return Condition1;
	}
	public void setCondition1(String condition1) {
		Condition1 = condition1;
	}
	public String getCondition2() {
		return Condition2;
	}
	public void setCondition2(String condition2) {
		Condition2 = condition2;
	}
	public String getCondition3() {
		return Condition3;
	}
	public void setCondition3(String condition3) {
		Condition3 = condition3;
	}
	public String getCondition4() {
		return Condition4;
	}
	public void setCondition4(String condition4) {
		Condition4 = condition4;
	}
	public String getCondition5() {
		return Condition5;
	}
	public void setCondition5(String condition5) {
		Condition5 = condition5;
	}
	public String getOther_Info() {
		return other_Info;
	}
	public void setOther_Info(String other_Info) {
		this.other_Info = other_Info;
	}
	public TermsAndConditions() {
		super();
	}
	 
	 
}
