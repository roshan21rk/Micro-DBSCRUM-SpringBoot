package com.roshan.sales.dailysalesservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roshan.sales.dailysalesservice.Repository.DailySalesService;
import com.roshan.sales.dailysalesservice.model.SalesEntity;

@Service
public class DaileSaleService {

	@Autowired
	private DailySalesService service;

	public List<SalesEntity> getSales() {
		
		return service.findAll();
	}
	
	
	
}
