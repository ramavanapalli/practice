package com.cms.pastor1.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pastorregistration")
public class PastorEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

private  int id;
private String firstname;
private String lastname;
private String email;
private String password;
private long phonenumber;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(long phonenumber) {
	this.phonenumber = phonenumber;
}
@Override
public String toString() {
	return "PastorEntity [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
			+ ", password=" + password + ", phonenumber=" + phonenumber + "]";
}


}

