package com.posidex.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.posidex.beans.EmployeeInfo;

@Controller
public class WelcomeController {
	
	@Autowired
	JdbcTemplate jt;
	
	/*@RequestMapping(value="/")
	public String defalutPage() {
		return "index";
	}*/
	@RequestMapping(value = "getResponse", method = RequestMethod.GET)
	public String getResponse(Map map) {
		map.put("msg", "welcome to springboot with static content like css,js files");
		return "welcome";
	}

	@RequestMapping(value="submitExt",method=RequestMethod.POST)
	public String submitExt(Map map,@ModelAttribute EmployeeInfo info) {
		System.out.println(info.getEmpId()+" --- "+info.getEmpName()+" --- "+info.getExtNo());
		map.put("msg", "Extention number submit successfully.");
		return "welcome";
	}
	
}
