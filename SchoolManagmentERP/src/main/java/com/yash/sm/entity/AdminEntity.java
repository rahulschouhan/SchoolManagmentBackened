package com.yash.sm.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin") 
public class AdminEntity implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;

@Column(nullable=true,length=10)
private String first_Name;

@Column(nullable=true,length=10)
private String last_Name;

@Column(nullable=true,length=10)
private String adress;

@Column(nullable=true,length=10)
private String mob;

@Column(nullable=true,length=15)
private String emailId;

@Column(nullable=true,length=15)
private String pasword;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFirst_Name() {
	return first_Name;
}

public void setFirst_Name(String first_Name) {
	this.first_Name = first_Name;
}

public String getLast_Name() {
	return last_Name;
}

public void setLast_Name(String last_Name) {
	this.last_Name = last_Name;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}

public String getMob() {
	return mob;
}

public void setMob(String mob) {
	this.mob = mob;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getPasword() {
	return pasword;
}

public void setPasword(String pasword) {
	this.pasword = pasword;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("AdminEntity [id=");
	builder.append(id);
	builder.append(", first_Name=");
	builder.append(first_Name);
	builder.append(", last_Name=");
	builder.append(last_Name);
	builder.append(", adress=");
	builder.append(adress);
	builder.append(", mob=");
	builder.append(mob);
	builder.append(", emailId=");
	builder.append(emailId);
	builder.append(", pasword=");
	builder.append(pasword);
	builder.append(", getClass()=");
	builder.append(getClass());
	builder.append(", hashCode()=");
	builder.append(hashCode());
	builder.append(", toString()=");
	builder.append(super.toString());
	builder.append("]");
	return builder.toString();
}

}
