package com.api.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserDetails")
public class UserDetails {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;
	  @Column(name = "cui")
	  private Long cui;
	  @Column(name = "age")
	  private Long age;
	  @Column(name = "firstName")
	  private String firstName; 
	  @Column(name = "secondName")
	  private String secondName;
	  @Column(name = "firstSurname")
	  private String firstSurname;
	  @Column(name = "secondSurname")
	  private String secondSurname;
	  @Column(name = "email")
	  private String email;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCui() {
		return cui;
	}
	public void setCui(Long cui) {
		this.cui = cui;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getFirstSurname() {
		return firstSurname;
	}
	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}
	public String getSecondSurname() {
		return secondSurname;
	}
	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	  
	  
	  
	  
}
