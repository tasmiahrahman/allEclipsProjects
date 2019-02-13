package pack2;

import org.junit.Test;

import pack1.A;

public class F extends A {
	
	//inheritance from different package.
	@Test
	public void test3() {
	//m1();default not accessing
	m2();
	m3();
	//m4();private not accessing
	
	
	}

}