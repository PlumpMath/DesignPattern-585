package com.example;

import java.util.HashMap;
import java.util.Map;

public class SingletonManager {
	public static final String SINGLETON = "singleton";
	
	private static Map<String, Object> singletonMap = new HashMap<>();
	
	public static void addSingleton(String key, Object o) {
		if(!singletonMap.containsKey(key)) {
		singletonMap.put(key, o);
		}
	}
	
	public static <T extends Object> T getSingleton(String key) {
		return (T)singletonMap.get(key);
	}
}
