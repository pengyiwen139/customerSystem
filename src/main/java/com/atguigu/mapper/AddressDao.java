package com.atguigu.mapper;

import java.util.List;

import com.atguigu.bean.T_MALL_ADDRESS;

public interface AddressDao {
	
	List<T_MALL_ADDRESS> SelectAllAddressByYHId(int yh_id);
	
	void addAddress(T_MALL_ADDRESS address);
	
	T_MALL_ADDRESS getAddressByAddressId(int id);
}
