package com.kirana.myKiranaapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kirana.myKiranaapp.entity.Information;

public interface InformationRepository extends JpaRepository<Information, Integer> {

	void deletebyItem(String theitem);

	Optional<Information> findbyItem(String theitem);
	
	

}
