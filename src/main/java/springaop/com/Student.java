package springaop.com;

import org.springframework.stereotype.Component;

@Component
public class Student {

	public void study() {
		
		System.out.println("Hello u r in Student class");
	}
	
	public int add(int a,int b) {
		System.out.println("Add two number");
		return a+b;
	}
	
}
