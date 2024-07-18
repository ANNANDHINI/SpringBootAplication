package com.jetblueapp6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/*import org.springframework.web.bind.annotation.RequestParam;*/
import org.springframework.web.bind.annotation.RequestParam;


import com.jetblueapp6.entity.Students;
import com.jetblueapp6.payload.StudentDto;
import com.jetblueapp6.services.StudentsService;

@Controller
public class StudentsController {
	@Autowired
	private StudentsService stdserv; 
	
	@RequestMapping("/student")
	public String student() {
		return "student";
	}
	
	/*@RequestMapping("/savestudent")
	public String savestudent(Students stud) {
		stdserv.savestud(stud);
		return "student";
		
		
	}*/
	
	/*@RequestMapping("/savestudent")
	public String savestudent(@RequestParam("name")String name,
			@RequestParam("branch")String branch,
			@RequestParam("study")String study,
			@RequestParam("marks")String marks) {
	
	  Students stud=new Students();
	
	stud.setName(name);
	stud.setBranch(branch);
	stud.setStudy(study);
	stud.setMarks(marks);
	
	stdserv.savestud(stud);
	
	return "student";
	
	}*/
	
	@RequestMapping("/savestudent")
	public String savestudent(StudentDto studDto) {
		Students stud=new Students();
		stud.setId(studDto.getId());
		stud.setName(studDto.getName());
		stud.setBranch(studDto.getBranch());
		stud.setStudy(studDto.getStudy());
		stud.setMarks(studDto.getMarks());
		
		stdserv.savestud(stud);
		return "student";
	}
	
	@RequestMapping("/list_all")
	public String listall(Students stud,Model model) {
		List<Students> student = stdserv.listallData(stud);
		model.addAttribute("student", student);
		return "list_all";
	}
	@RequestMapping("/update")
	public String update(@RequestParam("id")long id,Model model) {
		Students student=stdserv.updateonestudent(id);
		model.addAttribute("student", student);
		return "update_stud";
	}
	//update student
			@RequestMapping("/update_stud")
			public String updatepass(Students stud,Model model) {
			 stdserv.updateonedata(stud);
				List<Students> student=stdserv.listallData(stud);
				model.addAttribute("student",student);
				return "list_all";
				
			}
			//delete data of student
			@RequestMapping("/deletestud")
			public String deletestud(@RequestParam("id") long id,Students stud,Model model){
			stdserv.deleteonepass(id);
				List<Students> student=stdserv.listallData(stud);
				model.addAttribute("student",student);
				return "list_all";
			}
	
}
