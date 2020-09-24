package com.samudra.ProjectWithMaven;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/* 
STEP 1 ( in student class file) : creating basic skeleton of student class  
*/



/* 
Entity annotation will create a table having name of student 
*/

@Entity
@Table(name="mystudents")
public class student {
	
	@Id
	private int id;
	private String name;
	private String city;
	
	
	//Step 2 : generation of default constructor
	public student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	//Step3 : generation of super class constructor
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/* 
	STEP 4 : generation of getter ands setters to set & fetch the values  
	*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	/* toString method helps to print the attributes just calling the reference
	 *   */	
	
	@Override
	public String toString() {
		return this.id+" : "+this.name+" : "+this.city ;
	}
	
	
	

}


