package com.kirana.myKiranaapp.service;

import java.util.List;

import com.kirana.myKiranaapp.entity.Information;

public interface InformationService {

	    public List<Information> findAll();
		
		public Information findbyItem(String theitem);
		
		public void save(Information theinformation);
		
		public void deletebyItem(String theitem);
}
