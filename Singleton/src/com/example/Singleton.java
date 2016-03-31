package com.example;

public class Singleton {
	private int mSign;
	private String mSignName;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return SingletonHolder.sInstance;
	}
	
	private static class SingletonHolder {
		private static Singleton sInstance = new Singleton();
	}
	
	public  void init(int sign, String signName) {
		this.mSign = sign;
		this.mSignName = signName;
	}
	
	@Override
	public String toString() {
		return "sign is " + mSign + ",sign name is " + mSignName;
	}
}
