package com.iamvickyav.springbootmvcjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class SpringBootMvcJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcJspApplication.class, args);
	}
}
