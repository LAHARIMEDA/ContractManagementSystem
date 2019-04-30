package DAO1;

import model.TermsAndConditions;


public interface TnCDAO 
{
	public void addTnC(TermsAndConditions TnC);
	public TermsAndConditions getTnC(int cont_id);
	public void updateTnC(TermsAndConditions TnC);
}
