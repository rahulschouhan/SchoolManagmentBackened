package com.yash.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.sm.dao.AdminDao;
import com.yash.sm.entity.AdminEntity;
import com.yash.sm.entity.TeacherEntity;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao admindao;
	
	@Override
	public AdminEntity getAdminDetails(Long adminId) {
		return admindao.getAdminDetailsById(adminId);
	}

	@Override
	public boolean addTeachers(TeacherEntity entity) {
		return admindao.addTeachers(entity);
	}

	@Override
	public List<TeacherEntity> getTeachers() {
		return admindao.getTeachers();
	}

}
