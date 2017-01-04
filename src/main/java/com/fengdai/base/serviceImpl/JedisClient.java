package com.fengdai.base.serviceImpl;

import org.springframework.stereotype.Service;

import com.fengdai.base.dubbo.configure.CacheClient;
import com.fengdai.base.dubbo.configure.SerializeUtil;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service
public class JedisClient implements CacheClient{
	

	private static final String OK="ok";
	
	
	private JedisPool jedisPool;//连接池
	
	private String version;//缓存key版本号

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public JedisPool getJedisPool() {
		return jedisPool;
	}

	public void setJedisPool(JedisPool jedisPool) {
		this.jedisPool = jedisPool;
	}

	@Override
	public String getKeyVesion() {
	
		return null;
	}

	@Override
	public <T> boolean set(String key, T t) {
		String result=null;
		Jedis jedis = jedisPool.getResource();
		result=jedis.set(key.getBytes(),SerializeUtil.serialize(t));
		return OK.equals(result) ?  true : false;
	}
	
	@Override
	public  boolean set(String key,String value) {
		String result=null;
		Jedis jedis = jedisPool.getResource();
		result=jedis.set(key,value);
		return OK.equals(result) ?  true : false;
	}

	@Override
	public <T> boolean set(String key, int expiredTime, T t) {
		
		return false;
	}

	@Override
	public String get(String key) {
		Jedis jedis = jedisPool.getResource();
		return jedis.get(key);
	}
}
