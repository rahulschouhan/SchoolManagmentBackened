package com.yash.sm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.sm.dto.AttendanceDTO;
import com.yash.sm.dto.TeachersDTO;
import com.yash.sm.entity.AdminEntity;
import com.yash.sm.entity.AttandanceEntity;
import com.yash.sm.entity.TeacherEntity;
import com.yash.sm.service.AdminService;
import com.yash.sm.service.TeachersService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@Autowired
	TeachersService teacherService;
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
	 result= teacherService.addTeachers(entity);

 return new ResponseEntity<Boolean>(result, HttpStatus.OK);
	}
	catch(Exception s) 
	{	return new ResponseEntity<Boolean>(result, HttpStatus.EXPECTATION_FAILED);
	}
	}
   @GetMapping("admin/getTeachers")

	public ResponseEntity<List<TeachersDTO>> getTeachers() {
	   List<TeachersDTO> teacherList = new ArrayList<TeachersDTO>();
	 
	   List<TeacherEntity> listTeach = teacherService.getTeachers();
		for (TeacherEntity teacherEntity : listTeach) {
			  List<AttendanceDTO> atteDTOList = new ArrayList<AttendanceDTO>();
			TeachersDTO bean1 = new TeachersDTO();
			 List<AttandanceEntity> attendanceList	= teacherEntity.getListA();
			for (AttandanceEntity attendancEntity :attendanceList) {
				 AttendanceDTO bean2  =new AttendanceDTO();
			BeanUtils.copyProperties(attendancEntity, bean2);
			atteDTOList.add(bean2);
			}
			bean1.setList(atteDTOList);
			 BeanUtils.copyProperties(teacherEntity, bean1);
			teacherList.add(bean1);
		}
		
		return new ResponseEntity<List<TeachersDTO>>(teacherList, HttpStatus.OK);
	}
   
   @GetMapping("admin/deleteTeachers/{id}")

  	public ResponseEntity<Boolean> deleteTech(@PathVariable("id") Long id) {
  		 boolean result=false;
  		try{
  			TeacherEntity entity =new TeacherEntity();
  			entity.settId(id);
  		 result= teacherService.deletTeacher(entity);

  	 return new ResponseEntity<Boolean>(result, HttpStatus.OK);
  		}
  		catch(Exception s) 
  		{
  		return new ResponseEntity<Boolean>(result, HttpStatus.EXPECTATION_FAILED);
  		}
  		}
   
   @GetMapping("admin/getTeachersAttenadnce/{id}")

  	public ResponseEntity<List<TeachersDTO>> getTeachersAttendance(@PathVariable("id") Long id) {
  	   List<TeachersDTO> teacherList = new ArrayList<TeachersDTO>();
  	 
  	   List<TeacherEntity> listTeach = teacherService.techerAttendance(id);
  		for (TeacherEntity teacherEntity : listTeach) {
  			  List<AttendanceDTO> atteDTOList = new ArrayList<AttendanceDTO>();
  			TeachersDTO bean1 = new TeachersDTO();
  			 List<AttandanceEntity> attendanceList	= teacherEntity.getListA();
  			for (AttandanceEntity attendancEntity :attendanceList) {
  				 AttendanceDTO bean2  =new AttendanceDTO();
  			BeanUtils.copyProperties(attendancEntity, bean2);
  			atteDTOList.add(bean2);
  			}
  			bean1.setList(atteDTOList);
  			 BeanUtils.copyProperties(teacherEntity, bean1);
  			teacherList.add(bean1);
  		}
  		return new ResponseEntity<List<TeachersDTO>>(teacherList, HttpStatus.OK);
  	}
 }
