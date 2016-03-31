package com.example;

public class Test {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.init(3, "33");
		SingletonManager.addSingleton(SingletonManager.SINGLETON,singleton);
		
		Singleton singleton2 = SingletonManager.getSingleton(SingletonManager.SINGLETON);
		
		if(null != singleton2) {
			System.out.println(singleton2.toString());
		} else {
			System.out.println("wrong singleton name");
		}
		
		if(null == SingletonManager.getSingleton("Test")) {
			System.out.println("wrong singleton name");
		}
	}

}
