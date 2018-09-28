package com.yash.sm.service;

import java.util.List;

import com.yash.sm.entity.AdminEntity;
import com.yash.sm.entity.TeacherEntity;

public interface AdminService {

public AdminEntity getAdminDetails(Long adminId);	
public boolean addTeachers(TeacherEntity entity);
public List<TeacherEntity> getTeachers();
	

}
