package com.example;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

public class Person {
	private int mAge;
	private String mName;
	private boolean mSex;
	private float mWeight;
	private float mHeight;
	
	public static class Builder{
		private int mAge;
		private String mName;
		private boolean mSex;
		private float mWeight;
		private float mHeight;
		
		public Builder(int age, String name, boolean sex) {
			mAge = age;
			mName = name;
			mSex = sex;
		}
		
		public Builder setAge(int age) {
			mAge = age;
			
			return this;
		}
		
		public Builder setName(String name) {
			mName = name;
			
			return this;
		}
		
		public Builder setSex(boolean sex) {
			mSex = sex;
			
			return this;
		}
		
		public Builder setWeight(float weight) {
			mWeight = weight;
			
			return this;
		}
		
		public Builder setHeight(float height) {
			mHeight = height;
			
			return this;
		}
		
		public Person build() {
			return new Person(this); 
		}
	}
	
	private Person(Builder builder) {
		mAge = builder.mAge;
		mName = builder.mName;
		mSex = builder.mSex;
		mWeight = builder.mWeight;
		mHeight = builder.mHeight;
	}
	
	@Override
	public String toString() {
		return "age is " + mAge + ", name is " + mName + ", sex is " + (mSex ? "male" : "female") + ", weight is " + mWeight + ", height is " + mHeight;
	}
	
	
}
