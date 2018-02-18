package com.atguigu.service;

import java.util.List;

import com.atguigu.bean.T_MALL_ADDRESS;

public interface AddressService {
	List<T_MALL_ADDRESS> SelectAllAddressByYHId(int yh_id);

	void addAddress(T_MALL_ADDRESS address);

	T_MALL_ADDRESS getAddressByAddressId(int id);
}
