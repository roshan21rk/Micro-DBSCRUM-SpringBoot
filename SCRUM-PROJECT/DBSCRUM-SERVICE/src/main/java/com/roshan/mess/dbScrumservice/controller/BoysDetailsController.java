package com.roshan.mess.dbScrumservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.roshan.mess.dbScrumservice.Model.Boys;
import com.roshan.mess.dbScrumservice.Service.BoysService;


@RestController
@RequestMapping(value="/Scrum")
@CrossOrigin(origins="*")
public class BoysDetailsController {
	
	@Autowired
	private BoysService service;
	
	//Get all Details
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public List<Boys> getBoysDetails()
	{
		return this.service.getBoysDetails();
	}
	
	//Add Detail
	//@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/Add", method=RequestMethod.POST)
	public void addBoysDetails(@RequestBody Boys boysdetails)
	{
		 this.service.addBoysDetails(boysdetails);
	}

	//Get by Id 
	//@CrossOrigin(origins="http://localhost:4200",maxAge = 3600)
	@RequestMapping(value="/view/{id}", method=RequestMethod.GET)
	public Optional<Boys> getbyID(@PathVariable("id") int id)
	{
		return this.service.getbyID(id);
	}
	
	
	//Update Details
	//@CrossOrigin(origins="http://localhost:4200", maxAge = 3600)
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public void updateBoysDetails(@PathVariable("id") int id, @RequestBody Boys boysdetails)
	{
		this.service.updateBoysDetails(id, boysdetails);
	}
	//Delete Details
	//@CrossOrigin(origins="http://localhost:4200", maxAge = 3600)
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteBosyDetails(@PathVariable("id") int id)
	{
		this.service.deleteBosyDetails(id);
	}
	

}
