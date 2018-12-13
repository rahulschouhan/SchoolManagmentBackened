package com.yash.sm.service;

import java.util.List;

import com.yash.sm.entity.TeacherEntity;

public interface TeachersService {

public boolean addTeachers(TeacherEntity entity);
public List<TeacherEntity> getTeachers();
public boolean deletTeacher(TeacherEntity tId);	
public List<TeacherEntity> techerAttendance(long tId);
	

}
