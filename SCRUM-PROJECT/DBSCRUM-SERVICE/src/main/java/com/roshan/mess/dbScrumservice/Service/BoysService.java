package com.roshan.mess.dbScrumservice.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.roshan.mess.dbScrumservice.DB.BoysDAO;
import com.roshan.mess.dbScrumservice.Model.Boys;

@Service
public class BoysService {
	
	
	public BoysService(BoysDAO bDao) {
		this.bDao = bDao;
	}
	private BoysDAO bDao;
	
	//Get all Details
	public List<Boys> getBoysDetails()
	{
		return this.bDao.findAll();
	}
	
	//Add Detail
	
	public void addBoysDetails(@RequestBody Boys boysdetails)
	{
		 this.bDao.save(boysdetails);
		
	}

	//Get by Id 
	
	public Optional<Boys> getbyID(int id)
	{
		return this.bDao.findById(id);
	}
	
	
	//Update Details
	
	public void updateBoysDetails(int id,Boys boysdetails)
	{
		this.bDao.save(boysdetails);
	}
	//Delete Details
	
	public void deleteBosyDetails(int id)
	{
		this.bDao.deleteById(id);
	}
	
	
}
