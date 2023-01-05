package com.jsp.bank;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
private int id;
private String Empname;
private String password;
private String Emailid;
private String Role;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmailid() {
	return Emailid;
}
public void setEmailid(String emailid) {
	Emailid = emailid;
}
public String getRole() {
	return Role;
}
public void setRole(String role) {
	Role = role;
}
public String getEmpname() {
	return Empname;
}
public void setEmpname(String empname) {
	Empname = empname;
}

}
