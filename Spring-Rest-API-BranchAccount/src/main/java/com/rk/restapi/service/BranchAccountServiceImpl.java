package com.rk.restapi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.restapi.model.BranchAccount;
import com.rk.restapi.repository.BranchAccountRepository;


@Service
public class BranchAccountServiceImpl implements BranchAccountService {
	
	
	@Autowired
	private BranchAccountRepository eRepository;
	
		
		//JPQL QUERE FOR FETCH DATA FROM DATABASE
		@Override
		public List<BranchAccount> getBranchAccount(String branch, String currency,String account_type,String account) {
			return eRepository.getBranchAccount(branch,currency,account_type,account);
		}
		
		//SAVE DATA TO DATABASE
		@Override
		public BranchAccount saveBranchAccount(BranchAccount branchAccount) {
			return eRepository.save(branchAccount);
		}
		
		
}
