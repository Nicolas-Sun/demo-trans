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

	private Logger logger = LoggerFactory.getLogger(UserController.class);

	@Resource
	private IUserService userService;

	@ResponseBody
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request) {
		logger.info("for test jenkins job");
		logger.info("for test jenkins job second times");
		
		String ret = null;
		String idStr = request.getParameter("id");
		if (idStr == null)
		{
			ret  = "id cannot be null";
			return ret;
		}
		int id = Integer.parseInt(idStr);
		User user = userService.getUserById(id);
		ret ="result is "+ (user==null?"no user info":user.toString());
		logger.info(ret);
		return ret;
	}
}