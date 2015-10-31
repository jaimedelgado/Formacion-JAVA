package com.jdlsoft.cajondesastre.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainTest {
	public static void main(String[] args){
		//metodo1();
		//metodo2();
		metodo3();
	}
	
	private static void metodo3() {
		Foo foo1 =new Foo("Antonio Requena");
		Foo foo2 = new Foo("Carlota Simpson");
		Foo foo3 = new Foo("Marcos Segarra");
		Map<Integer,Foo> foos= new HashMap<Integer,Foo>();
		foos.put(10, foo1);
		foos.put(20, foo2);
		foos.put(30, foo3);
		System.out.println("El tamaño de foos es: " + foos.size());
		System.out.println(foos.get(10).getNombre());
		Set<Integer> keys = foos.keySet();
		for(Integer key: keys){
			Foo f = foos.get(key);
			System.out.println(f.getNombre());
		}
		
		Collection<Foo> values = foos.values();
		for(Foo f: values){
			System.out.println(f.getNombre());
		}
	}

	private static void metodo2() {
		Foo foo1 = new Foo("Antonio Requena");
		Foo foo2 = new Foo("Carlota Simpson");
		Foo foo3 = new Foo("Marcos Segarra");
		Foo foo4 = foo3;
		
		Set<Foo> foos = new HashSet<Foo>();
		foos.add(foo1);
		foos.add(foo2);
		foos.add(foo3);
		foos.add(foo4);
		
		System.out.println("Tamaño de foos: " + foos.size());
		
		for(Foo f : foos){
			System.out.println(f.getNombre());
		}
	}

	private static void metodo1(){
		List<Foo> foos = new ArrayList<Foo>();
		System.out.println("Tamaño de foos: " + foos.size());
		foos.add(new Foo());
		foos.add(new Foo());
		foos.add(new Foo());
		foos.add(new Foo());
		System.out.println("Tamaño de foos: " + foos.size());
		foos.clear();
		System.out.println("Tamaño de foos: " + foos.size());
		Foo foo1 =new Foo("Antonio Requena");
		Foo foo2 = new Foo("Carlota Simpson");
		Foo foo3 = new Foo("Marcos Segarra");
		Foo foo4 = foo3;
		Foo foo5 = null;
		foos.add(foo1);
		foos.add(foo2);
		foos.add(foo3);
		foos.add(foo4);
		System.out.println("Tamaño de foos: " + foos.size());
		Foo foo = foos.get(3);
		System.out.println("Obtenemos el foo: " + foo.getNombre());
		System.out.println("****** FOR EACH");
		for(Foo f: foos){
			System.out.println(f.getNombre());
		}
		System.out.println("****** FOR NORMAL");
		for(int i=0; i<foos.size(); i++){
			System.out.println(foos.get(i).getNombre());
		}
		System.out.println("****** ITERADOR");
		Iterator<Foo> iterador = foos.iterator();
		while(iterador.hasNext()){
			System.out.println(iterador.next().getNombre());
		}
	}
}
