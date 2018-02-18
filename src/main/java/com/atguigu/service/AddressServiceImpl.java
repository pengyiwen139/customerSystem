package com.atguigu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.T_MALL_ADDRESS;
import com.atguigu.mapper.AddressDao;

@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressDao addressDao;
	public List<T_MALL_ADDRESS> SelectAllAddressByYHId(int yh_id) {
		System.out.println("******************yh_id="+yh_id);
		return addressDao.SelectAllAddressByYHId(yh_id);
	}

	public void addAddress(T_MALL_ADDRESS address) {
		addressDao.addAddress(address);
	}

	public T_MALL_ADDRESS getAddressByAddressId(int id) {
		return addressDao.getAddressByAddressId(id);
	}

}
