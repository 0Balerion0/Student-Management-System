package com.student.manage;

public class StudentDetails {
	
	/**
	 * 
	 */
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int id;
	private String name;
	private String phone;
	private String city;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param id
	 * @param name
	 * @param phone
	 * @param city
	 */
	public StudentDetails(String name, String phone, String city) {
		super();
		this.name = name;
		this.phone = phone;
		this.city = city;
	}


	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", phone=" + phone + ", city=" + city + "]";
	}
	
	
	
}
