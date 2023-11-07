package com.api.spring.requestBody;

public class ExampleRequestBody {
private Long cui, age;
private String firstName, SecondName, firstSurname, secondSurname, email;

public ExampleRequestBody(Long cui, String firstName, String SecondName, String firstSurname,String secondSurname, String email) {
    this.cui = cui;
    this.firstName = firstName;
    this.SecondName = SecondName;
    this.firstSurname = firstSurname;
    this.secondSurname = secondSurname;
    this.email = email;
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
	return SecondName;
}

public void setSecondName(String secondName) {
	SecondName = secondName;
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
