package com.rk.restapi.service;

import java.util.List;

import com.rk.restapi.model.BranchAccount;
public interface BranchAccountService {
	
	
	//JPQL QUERY FOR FETCH DATA FROM DATABASE
	List<BranchAccount> getBranchAccount(String branch,String currency,String account_type,String account);
	
	BranchAccount saveBranchAccount (BranchAccount branchAccount);
	
}
