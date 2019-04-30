package DAO1;

import java.util.List;

import model.Contract;
import model.Status;
import model.TermsAndConditions;


public interface ContractDAO {
public void addContract(Contract contract,int sup_id);
public int getLastContract();
public  List<Contract> listStatus(int sup_id);
public Contract getContract(int cont_id);
public void approveStatus(int cont_id);
public void rejectStatus(int cont_id);
public  List<Contract> listidRej(int cont_id);
public  Contract listconRej(int cont_id);
public void updateContract(Contract contract);




}
