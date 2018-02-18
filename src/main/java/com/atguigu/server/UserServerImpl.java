package com.atguigu.server;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;

import com.atguigu.bean.t_mall_user_account;
import com.atguigu.service.UserService;
import com.google.gson.Gson;

public class UserServerImpl implements UserServer{

	@Autowired
	private UserService userService;
	
	public t_mall_user_account login(t_mall_user_account user) {
		return userService.selectUser(user);
	}
	
	public t_mall_user_account login2(t_mall_user_account user) {
		return userService.selectUser2(user);
	}

	@Path("/Ruser")
	@Consumes("application/x-www-form-urlencoded")
	@Produces("application/json")
	@GET
	public String login3(@BeanParam t_mall_user_account user) {
		 t_mall_user_account selectUser2 = userService.selectUser2(user);
		 String json = new Gson().toJson(selectUser2);
		return json;
	}

}