package com.atguigu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.t_mall_user_account;
import com.atguigu.mapper.UserDao;
import com.atguigu.util.MyRoutingDataSource;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public t_mall_user_account selectUser(t_mall_user_account user) {
		MyRoutingDataSource.setKey("1");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userDao.selectUser(user);
	}

	public t_mall_user_account selectUser2(t_mall_user_account user) {
		MyRoutingDataSource.setKey("2");
		return userDao.selectUser(user);
	}

}
