package com.jdlsoft.cajondesastre.singleton;

public class MainTest {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton);
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2);
		if(singleton == singleton2){
			System.out.println("SON EL MISMO OBJETO");
		}
	}

}
