package com.fengdai.base.dubbo.configure;


public interface CacheClient {
	String getKeyVesion();
	
	<T>   boolean set(String key,T t);
	
	<T>   boolean set(String key,int expiredTime,T t);
	
	<T> T get(String key);

	boolean set(String key, String value);
}
