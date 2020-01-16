package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="STATES_MASTER")
public class StatesEntity {
	
	@Id
	@Column(name="SSN_ID")
	public Integer ssnId;
	
	@Column(name="SSN_CODE")
	public String ssnCode;
	
	@Column(name="SSN_STATE")
	public String ssnState;

}
