package com.atguigu.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.atguigu.bean.T_MALL_ADDRESS;
import com.atguigu.service.AddressService;

public class AddressServerImpl implements AddressServer{

	@Autowired
	private AddressService addressService;
	
	public List<T_MALL_ADDRESS> SelectAllAddressByYHId(int yh_id) {
		return addressService.SelectAllAddressByYHId(yh_id);
	}

	public void addAddress(T_MALL_ADDRESS address) {
		addressService.addAddress(address);
	}

	public T_MALL_ADDRESS getAddressByAddressId(int id) {
		System.out.println("======");
		return addressService.getAddressByAddressId(id);
	}

}
