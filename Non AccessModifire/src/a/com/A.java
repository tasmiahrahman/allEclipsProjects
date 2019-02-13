package a.com;

import org.junit.Test;

public class A {
	
	 A() {
	
		/*super key word parent class er variable
		super(); parent class er constructor
		this key word same class variable.
		this();same class method.*/
	}
	
	
	
	@Test
	public void test() {
		
		NonAccessModifier non= new NonAccessModifier();
		NonAccessModifier nin1= new NonAccessModifier(5);
		int x= NonAccessModifier.d;// static thaklay class er name .variable korlay  static variable ashbey .
		
	}
	
}
