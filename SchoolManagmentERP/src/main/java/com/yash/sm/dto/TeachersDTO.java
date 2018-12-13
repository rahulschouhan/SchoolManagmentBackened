package com.yash.sm.dto;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class TeachersDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long tId;
	private String fName;
	private String lName;
	private String adress;
	private String mobile;
	private String tEmailId;
	private String subject;
	private Date doj ;
	private Date dob ;
    private List<AttendanceDTO> list;
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
	public List<AttendanceDTO> getList() {
		return list;
	}
	public void setList(List<AttendanceDTO> list) {
		this.list = list;
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
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result + ((tEmailId == null) ? 0 : tEmailId.hashCode());
		result = prime * result + ((tId == null) ? 0 : tId.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "TeachersDTO [tId=" + tId + ", fName=" + fName + ", lName=" + lName + ", adress=" + adress + ", mobile="
				+ mobile + ", tEmailId=" + tEmailId + ", subject=" + subject + ", doj=" + doj + ", dob=" + dob
				+ ", list=" + list + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeachersDTO other = (TeachersDTO) obj;
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
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
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
}
