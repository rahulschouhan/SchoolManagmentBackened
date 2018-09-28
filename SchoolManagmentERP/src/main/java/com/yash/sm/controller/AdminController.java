package com.yash.sm.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;

import com.yash.sm.entity.AdminEntity;
import com.yash.sm.entity.TeacherEntity;
import com.yash.sm.service.AdminService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdminController {

	@Autowired
	AdminService adminService;
	@GetMapping("admin/{id}")

	public ResponseEntity<AdminEntity> getArticleById(@PathVariable("id") Long id) {
		AdminEntity article = adminService.getAdminDetails(id);
		return new ResponseEntity<AdminEntity>(article, HttpStatus.OK);
	}
   @PostMapping("admin/addTeachers")
	public ResponseEntity<Boolean>addTeachers(@RequestBody TeacherEntity entity)
	{
	 boolean result=false;
	try{
	 result= adminService.addTeachers(entity);

 return new ResponseEntity<Boolean>(result, HttpStatus.OK);
	}
	catch(Exception s) 
	{	return new ResponseEntity<Boolean>(result, HttpStatus.EXPECTATION_FAILED);
	}
	}
   @GetMapping("admin/getTeachers")

	public ResponseEntity<List<TeacherEntity>> getTeachers() {
		List<TeacherEntity> listTeach = adminService.getTeachers();
		return new ResponseEntity<List<TeacherEntity>>(listTeach, HttpStatus.OK);
	}
 }
