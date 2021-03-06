package com.yash.sm.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Teachers") 
public class TeacherEntity implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long tId;

@Column()
private String fName;

@Column()
private String lName;

@Column()
private String adress;

@Column()
private String mobile;

@Column()
private String tEmailId;

@Column()
private String subject;

@Column()
private Date doj ;

@Column()
private Date dob ;

public Long gettId() {
	return tId;
}

public void settId(Long tId) {
	this.tId = tId;
}

public String getfName() {
	return fName;
}

public void setfName(String fName) {
	this.fName = fName;
}

public String getlName() {
	return lName;
}

public void setlName(String lName) {
	this.lName = lName;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String gettEmailId() {
	return tEmailId;
}

public void settEmailId(String tEmailId) {
	this.tEmailId = tEmailId;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public Date getDoj() {
	return doj;
}

public void setDoj(Date doj) {
	this.doj = doj;
}

public Date getDob() {
	return dob;
}

public void setDob(Date dob) {
	this.dob = dob;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((adress == null) ? 0 : adress.hashCode());
	result = prime * result + ((dob == null) ? 0 : dob.hashCode());
	result = prime * result + ((doj == null) ? 0 : doj.hashCode());
	result = prime * result + ((fName == null) ? 0 : fName.hashCode());
	result = prime * result + ((lName == null) ? 0 : lName.hashCode());
	result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
	result = prime * result + ((subject == null) ? 0 : subject.hashCode());
	result = prime * result + ((tEmailId == null) ? 0 : tEmailId.hashCode());
	result = prime * result + ((tId == null) ? 0 : tId.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	TeacherEntity other = (TeacherEntity) obj;
	if (adress == null) {
		if (other.adress != null)
			return false;
	} else if (!adress.equals(other.adress))
		return false;
	if (dob == null) {
		if (other.dob != null)
			return false;
	} else if (!dob.equals(other.dob))
		return false;
	if (doj == null) {
		if (other.doj != null)
			return false;
	} else if (!doj.equals(other.doj))
		return false;
	if (fName == null) {
		if (other.fName != null)
			return false;
	} else if (!fName.equals(other.fName))
		return false;
	if (lName == null) {
		if (other.lName != null)
			return false;
	} else if (!lName.equals(other.lName))
		return false;
	if (mobile == null) {
		if (other.mobile != null)
			return false;
	} else if (!mobile.equals(other.mobile))
		return false;
	if (subject == null) {
		if (other.subject != null)
			return false;
	} else if (!subject.equals(other.subject))
		return false;
	if (tEmailId == null) {
		if (other.tEmailId != null)
			return false;
	} else if (!tEmailId.equals(other.tEmailId))
		return false;
	if (tId == null) {
		if (other.tId != null)
			return false;
	} else if (!tId.equals(other.tId))
		return false;
	return true;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("TeacherEntity [tId=");
	builder.append(tId);
	builder.append(", fName=");
	builder.append(fName);
	builder.append(", lName=");
	builder.append(lName);
	builder.append(", adress=");
	builder.append(adress);
	builder.append(", mobile=");
	builder.append(mobile);
	builder.append(", tEmailId=");
	builder.append(tEmailId);
	builder.append(", subject=");
	builder.append(subject);
	builder.append(", doj=");
	builder.append(doj);
	builder.append(", dob=");
	builder.append(dob);
	builder.append(", gettId()=");
	builder.append(gettId());
	builder.append(", getfName()=");
	builder.append(getfName());
	builder.append(", getlName()=");
	builder.append(getlName());
	builder.append(", getAdress()=");
	builder.append(getAdress());
	builder.append(", getMobile()=");
	builder.append(getMobile());
	builder.append(", gettEmailId()=");
	builder.append(gettEmailId());
	builder.append(", getSubject()=");
	builder.append(getSubject());
	builder.append(", getDoj()=");
	builder.append(getDoj());
	builder.append(", getDob()=");
	builder.append(getDob());
	builder.append(", hashCode()=");
	builder.append(hashCode());
	builder.append("]");
	return builder.toString();
}


}
