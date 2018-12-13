package com.yash.sm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.yash.sm.entity.TeacherEntity;
@Repository
@Transactional
public class TeachersDaoImp implements TeachersDao {

	@PersistenceContext	
	private EntityManager entityManager;
	private static final String TEACHERS_QUERY=" from TeacherEntity"; 
	private static final String TEACHERS_ATTENDANCE_QUERY=" from TeacherEntity where tId=?"; 
	
	
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

	@Override
	public boolean deletTeacher(TeacherEntity entity) {
		try {

			entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));

			return true;
			}
			catch (Exception e) {
			e.printStackTrace();
			return false;
			}
		}

	@Override
	public List<TeacherEntity> techerAttendance(long tId) {
		Query query=  entityManager.createQuery(TEACHERS_ATTENDANCE_QUERY);
		query.setParameter(1, tId);
	     List<TeacherEntity>entities= 	query.getResultList();
	   return entities;
	}
	
}
