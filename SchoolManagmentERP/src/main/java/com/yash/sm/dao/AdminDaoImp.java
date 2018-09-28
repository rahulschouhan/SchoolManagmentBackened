package com.yash.sm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.yash.sm.entity.AdminEntity;
import com.yash.sm.entity.TeacherEntity;
@Repository
@Transactional
public class AdminDaoImp implements AdminDao {

	@PersistenceContext	
	private EntityManager entityManager;
	private static final String TEACHERS_QUERY=" from TeacherEntity"; 
	public AdminEntity getAdminDetailsById(Long adminId) {
		AdminEntity adminEntity =  entityManager.find(AdminEntity.class, adminId);
	return adminEntity;
	}

	@Override
	public boolean addTeachers(TeacherEntity entity) {
		try {

		entityManager.persist(entity);

		return true;
		}
		catch (Exception e) {
		e.printStackTrace();
		return false;
		}
	}

	@Override
	public List<TeacherEntity> getTeachers() {
	
		Query query=  entityManager.createQuery(TEACHERS_QUERY);
	     List<TeacherEntity>entities= 	query.getResultList();
		return entities;
	}

}
