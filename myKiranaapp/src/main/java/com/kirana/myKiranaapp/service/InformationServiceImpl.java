package com.kirana.myKiranaapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kirana.myKiranaapp.entity.Information;
import com.kirana.myKiranaapp.repository.InformationRepository;



@Service
public class InformationServiceImpl implements InformationService{
	
	private InformationRepository informationRepository;
	
	@Autowired
	public InformationServiceImpl(InformationRepository theinformationRepository) {
		
		informationRepository = theinformationRepository;
	}
	
	@Override
	  public List<Information> findAll()
	{
		return informationRepository.findAll();
	}
	
	@Override
	public Information findbyItem(String theitem)
	{
		Optional<Information> result = informationRepository.findbyItem(theitem);
		
		Information theInformation = null;
		
		if (result.isPresent()) {
			theInformation = result.get();
		}
		else {
			// we didn't find the Information
			throw new RuntimeException("Did not find item - " + theitem);
		}
		
		return theInformation;
	}
	
	
	@Override
	public void save(Information theinformation) {
		informationRepository.save(theinformation);
	}

	@Override
	public void deletebyItem(String theitem) {
		informationRepository.deletebyItem(theitem);
	}
	}
	
	
	
	
	
	
	
	


