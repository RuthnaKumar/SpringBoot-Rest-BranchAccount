package com.rk.restapi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.rk.restapi.model.BranchAccount;


@Repository
public interface BranchAccountRepository extends PagingAndSortingRepository<BranchAccount, Long> {
	
	//JPQL QUERY FOR FETCH DATA FROM DATABASE
	@Query("FROM BranchAccount WHERE branch = :branch OR currency =:currency OR account_type = :account_type OR account =:account")
	List<BranchAccount> getBranchAccount(String branch ,String currency,String account_type,String account);

	
	
}
