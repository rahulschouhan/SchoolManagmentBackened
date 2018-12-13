package com.yash.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.sm.dao.TeachersDao;
import com.yash.sm.entity.TeacherEntity;
@Service
public class TeachersServiceImpl implements TeachersService {

	@Autowired
	TeachersDao teachersdao;
	
	@Override
	public boolean addTeachers(TeacherEntity entity) {
		return teachersdao.addTeachers(entity);
	}

	@Override
	public List<TeacherEntity> getTeachers() {
		return teachersdao.getTeachers();
	}

	@Override
	public boolean deletTeacher(TeacherEntity entity) {
		return teachersdao.deletTeacher(entity);
	}

	@Override
	public List<TeacherEntity> techerAttendance(long tId) {
		
		return teachersdao.techerAttendance(tId);
	}

	
}
