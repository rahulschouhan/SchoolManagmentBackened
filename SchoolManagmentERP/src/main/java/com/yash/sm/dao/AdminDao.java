package com.yash.sm.dao;

import java.util.List;

import com.yash.sm.entity.AdminEntity;
import com.yash.sm.entity.TeacherEntity;

public interface AdminDao {
	
public AdminEntity getAdminDetailsById(Long adminEntity) ;
public boolean addTeachers(TeacherEntity entity);
public List<TeacherEntity> getTeachers();



}
