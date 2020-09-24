package com.samudra.ProjectWithMaven;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name="student_address")
public class address {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) //this line actually gives auto-increment to primary key
	@Column(name="address_id") //name of the primary key in the table would be changed as mentioned
	private int addressId;
	
	@Column(length= 50, name="STREET")
	private String street;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name="is_open")
	private boolean isOpen;
	
	@Transient //if you use this annotation that particular column (here x) won't be created value won't be going to database
	private double x;
	
	@Column(name="added_date")
	@Temporal(TemporalType.DATE) //using this annotation helps to only get the date, the time would be skipped
	private Date addedDate;
	
	@Lob  //this annotation actually tells that large object is going to be stored
	private byte[] image;
	
	
	public address(int addressId, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}


	public address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAddressId() {
		return addressId;
	}


	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public boolean isOpen() {
		return isOpen;
	}


	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}


	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public Date getAddedDate() {
		return addedDate;
	}


	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}


	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	
}
