package com.yash.sm.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.activemq.filter.function.inListFunction;
import org.aspectj.weaver.tools.Trace;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity
@Table(name ="COMPANY")
@NamedQueries({@NamedQuery(name ="ss" ,query="ss")})
@NamedNativeQueries({@NamedNativeQuery(name="sss", query="ss")})
public class CompanyEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    @Column
    private long companyId;
    
    @Column
    private String Comp_name;

    @Column
    private String ComAdress;
    
    @OneToMany(mappedBy ="", orphanRemoval=true ,cascade=CascadeType.ALL,fetch= FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
	private List<EmployeeEntity> employeeList;
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	public String getComp_name() {
		return Comp_name;
	}
	public void setComp_name(String comp_name) {
		Comp_name = comp_name;
	}
	public String getComAdress() {
		return ComAdress;
	}
	public void setComAdress(String comAdress) {
		ComAdress = comAdress;
	}
	public List<EmployeeEntity> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<EmployeeEntity> employeeList) {
		this.employeeList = employeeList;
	}

}
