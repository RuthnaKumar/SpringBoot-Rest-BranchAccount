package com.rk.restapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rk.restapi.model.BranchAccount;
import com.rk.restapi.service.BranchAccountService;

@RestController
public class BranchAccountController {
	
	@Autowired
	private BranchAccountService eService;
		

			@GetMapping("/branchaccount/{branch}/{currency}/{account_type}/{account}")
			public ResponseEntity<List<BranchAccount>> getBranchAccount(@PathVariable String branch,@PathVariable String currency,
																		@PathVariable String account_type,@PathVariable String account){
				return new ResponseEntity<List<BranchAccount>> (eService.getBranchAccount(branch,currency,account_type,account),HttpStatus.OK);
					
		}
			
			@PostMapping("/branchaccount")
			public ResponseEntity<BranchAccount> saveBranchAccount(@Valid @RequestBody BranchAccount branchAccount) {
				return new ResponseEntity<BranchAccount>(eService.saveBranchAccount(branchAccount),HttpStatus.CREATED);
			}
			
			
	
}
