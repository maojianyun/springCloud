package com.singhand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.singhand.entity.UserBean;

@Controller
public class UserController {

	@RequestMapping(value="getUser", method=RequestMethod.POST)
	@ResponseBody
	public UserBean getUser(@RequestBody UserBean user){
		return user;
	}
}
