package com.roshan.mess.dbScrumservice.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ScrumUtkarsh")
public class Boys {
	
	public Boys(int id, String firstname, String lastname, String city, String phone, int age, String profession,
			String status) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.phone = phone;
		this.age = age;
		this.profession = profession;
		Status = status;
	}
	
	public Boys() {
	
	}

	@Id
	@GeneratedValue
	@Column(name="Serial_No")
	int id;
	
	@Column(name="FirstName")
	String firstname;
	
	@Column(name="LastName")
	String lastname;
	
	@Column(name="City")
	String city;
	
	@Column(name="Phone_Number")
	String phone;
	
	@Column(name="Age")
	int age;
	
	@Column(name="Profession")
	String profession;
	
	@Column(name="Maratial_St")
	String Status;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

}
