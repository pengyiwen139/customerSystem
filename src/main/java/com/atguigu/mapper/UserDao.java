package com.atguigu.mapper;

import com.atguigu.bean.t_mall_user_account;

public interface UserDao {

	t_mall_user_account selectUser(t_mall_user_account user);

}