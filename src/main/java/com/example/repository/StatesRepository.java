package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.StatesEntity;

@Repository
public interface StatesRepository extends JpaRepository<StatesEntity, Integer> {
	
	@Query("select ssnState from StatesEntity")
	public List<String> getAllStates();

	@Query("select ssnCode from StatesEntity where ssnState=:state")
	public String getStateCode(String state);
}
