package com.yash.sm.dao;

import java.util.List;

import com.yash.sm.entity.AttandanceEntity;
import com.yash.sm.entity.TeacherEntity;

public interface TeachersDao {
public boolean addTeachers(TeacherEntity entity);
public List<TeacherEntity> getTeachers();
public boolean deletTeacher(TeacherEntity entity);	
public List<TeacherEntity> techerAttendance(long tId);



}
