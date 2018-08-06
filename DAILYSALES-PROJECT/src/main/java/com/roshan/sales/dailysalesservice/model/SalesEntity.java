package com.roshan.sales.dailysalesservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sales_Table")
public class SalesEntity {
	
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		
		@Column(name="Transaction_id")
		long tran_no;
		
		@Column(name="Effective_date")
		Date date;
	
		@Column(name="Sales_Dollar")
		double saleAmount;
	
		@Column(name="Store_Num")
		String location;
		
		public long getTran_no() {
			return tran_no;
		}

		public void setTran_no(long tran_no) {
			this.tran_no = tran_no;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public double getSaleAmount() {
			return saleAmount;
		}

		public void setSaleAmount(double saleAmount) {
			this.saleAmount = saleAmount;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		
		
}
