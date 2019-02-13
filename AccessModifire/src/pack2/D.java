package pack2;

import org.junit.Test;

public class D extends B{
	@Test
	public void test2() {
		//Using inheritance from same package
		m1();
		m1();
		m3();
		//m4(); not accessing because of private.
		
		
	}




}
