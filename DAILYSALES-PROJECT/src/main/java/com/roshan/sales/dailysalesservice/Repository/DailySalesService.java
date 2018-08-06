package com.roshan.sales.dailysalesservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.roshan.sales.dailysalesservice.model.SalesEntity;

@Repository
public interface DailySalesService extends JpaRepository<SalesEntity, Integer>{

}
