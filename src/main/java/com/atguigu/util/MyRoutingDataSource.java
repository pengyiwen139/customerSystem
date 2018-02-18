package com.atguigu.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MyRoutingDataSource extends AbstractRoutingDataSource{

	private static ThreadLocal<String> keyInThreadLocal = new ThreadLocal<String>();

	public static String getKey() {
		return keyInThreadLocal.get();
	}

	public static void setKey(String key) {
		keyInThreadLocal.set(key);
	}


	//将数据源的key传递给context。xml中的数据源路由器
	@Override
	protected Object determineCurrentLookupKey() {
		return getKey();
	}

}
