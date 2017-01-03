package com.test.demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.demo.bean.User;
import com.test.demo.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private Logger  logger = LoggerFactory.getLogger(UserController.class);
	

	@Resource
	private IUserService userService;

	@ResponseBody
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request) {
		String idStr = request.getParameter("id");
		if (idStr == null)
			return "id cannot be null";
		int id = Integer.parseInt(idStr);
		User user = userService.getUserById(id);
		logger.info("result is "+user.toString());
		return user == null ? "no user info" : user.toString();
	}
}