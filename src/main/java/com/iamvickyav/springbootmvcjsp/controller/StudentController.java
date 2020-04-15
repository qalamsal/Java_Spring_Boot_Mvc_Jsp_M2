package com.iamvickyav.springbootmvcjsp.controller;

import com.iamvickyav.springbootmvcjsp.entity.Employee;
import com.iamvickyav.springbootmvcjsp.entity.Student;
import com.iamvickyav.springbootmvcjsp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class StudentController {

	private final StudentRepository studentRepository;

	@Autowired
	public StudentController(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	/*
	@GetMapping("list")
	public ModelAndView showUpdateForm(ModelAndView model) {
		ModelAndView modelAndView=new ModelAndView("list");
		List<Student> std= (List<Student>) studentRepository.findAll();
		model.addObject("students", studentRepository.findAll());
		return modelAndView;
	}
	 */

	@GetMapping("list")
	public String showUpdateForm(Model model) {
		model.addAttribute("title","Crud with SpringBoot Mvc Jsp");
		model.addAttribute("emp",new Employee(100,"John"));
		model.addAttribute("students", studentRepository.findAll());
		return "list";
	}
}