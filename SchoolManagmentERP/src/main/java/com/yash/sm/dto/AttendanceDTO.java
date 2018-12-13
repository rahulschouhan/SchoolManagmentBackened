package com.yash.sm.dto;

import java.io.Serializable;
import java.sql.Date;

public class AttendanceDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long attId;
	private Date dateOfday;
	private boolean presentAbsence;
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
		AttendanceDTO other = (AttendanceDTO) obj;
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
	@Override
	public String toString() {
		return "AttendanceDTO [attId=" + attId + ", dateOfday=" + dateOfday + ", presentAbsence=" + presentAbsence
				+ "]";
	}
}
