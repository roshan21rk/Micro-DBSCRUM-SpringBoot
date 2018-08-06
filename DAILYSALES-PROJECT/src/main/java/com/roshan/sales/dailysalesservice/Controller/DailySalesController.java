package com.roshan.sales.dailysalesservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roshan.sales.dailysalesservice.model.SalesEntity;
import com.roshan.sales.dailysalesservice.service.DaileSaleService;

@RestController
@RequestMapping(value="/Sales")
@CrossOrigin(value="http://localhost:4200")
public class DailySalesController {
	
	@Autowired
	private DaileSaleService service;
	
	@RequestMapping(value="/allSales")
	public List<SalesEntity> getAllSales()
	{
		return service.getSales(); 
	}

}
