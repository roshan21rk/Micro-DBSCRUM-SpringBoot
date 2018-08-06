package com.roshan.mess.dbScrumservice.DB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roshan.mess.dbScrumservice.Model.Boys;

@Repository
public interface BoysDAO extends JpaRepository<Boys,Integer>{

}
