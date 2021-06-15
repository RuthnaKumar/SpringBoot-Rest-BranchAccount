package com.rk.restapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "branch_account")
public class BranchAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")  
	private long id;
	@Column(name = "match")  
	private String match;
	@Column(name = "branch")  
	private String branch;
	@Column(name = "currency")  
	private String currency;
	@Column(name = "account_type")  
	private String account_type;
	@Column(name = "account")  
	private String account;
	@Column(name = "beneficiary_country_code")  
	private String beneficiary_country_code;
	@Column(name = "iban_code")  
	private String iban_code;
	@Column(name = "status")  
	private String status;
 

	//TIMESTAMP
	@CreationTimestamp()
	@Column(name = "created_at",nullable =false, updatable = false)
	private Date createdAt;
	@UpdateTimestamp
	@Column(name = "updated_at")
	private Date updateAt;
}
