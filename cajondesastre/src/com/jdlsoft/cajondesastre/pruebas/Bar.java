package com.jdlsoft.cajondesastre.pruebas;

public class Bar {

	public static void main(String[] args) {
		Bar bar = new Bar();
		Foo foo = new Foo();
		bar = foo;
		bar = (Bar) foo;
	//	foo = bar;
		foo = (Foo) bar;
		
	}

}

class Foo extends Bar{
	
}
