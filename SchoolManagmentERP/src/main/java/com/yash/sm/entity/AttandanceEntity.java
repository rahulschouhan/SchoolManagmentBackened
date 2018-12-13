package com.yash.sm.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Attendance")

public class AttandanceEntity implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long attId;
@Column
private Date dateOfday;
                                                                                                                                                                          
@Column
private boolean presentAbsence;


@ManyToOne
@JoinColumn(name = "tatId", referencedColumnName = "tId")
private TeacherEntity aId;


public long getAttId() {
	return attId;
}


public void setAttId(long attId) {
	this.attId = attId;
}


public Date getDateOfday() {
	return dateOfday;
}


public void setDateOfday(Date dateOfday) {
	this.dateOfday = dateOfday;
}


public boolean isPresentAbsence() {
	return presentAbsence;
}


public void setPresentAbsence(boolean presentAbsence) {
	this.presentAbsence = presentAbsence;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((aId == null) ? 0 : aId.hashCode());
	result = prime * result + (int) (attId ^ (attId >>> 32));
	result = prime * result + ((dateOfday == null) ? 0 : dateOfday.hashCode());
	result = prime * result + (presentAbsence ? 1231 : 1237);
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
	AttandanceEntity other = (AttandanceEntity) obj;
	if (aId == null) {
		if (other.aId != null)
			return false;
	} else if (!aId.equals(other.aId))
		return false;
	if (attId != other.attId)
		return false;
	if (dateOfday == null) {
		if (other.dateOfday != null)
			return false;
	} else if (!dateOfday.equals(other.dateOfday))
		return false;
	if (presentAbsence != other.presentAbsence)
		return false;
	return true;
}


public TeacherEntity getaId() {
	return aId;
}


public void setaId(TeacherEntity aId) {
	this.aId = aId;
}


@Override
public String toString() {
	return "AttandanceEntity [attId=" + attId + ", dateOfday=" + dateOfday + ", presentAbsence=" + presentAbsence
			+ ", aId=" + aId + "]";
}




}
