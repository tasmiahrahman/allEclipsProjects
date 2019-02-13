package pack2;

import org.junit.Test;

import pack1.A;

public class C {
	@Test
	public void test() {
		//object created from same package,except private everything accessible.
		B x=new B();
		x.m1();
		x.m2();
		x.m3();
		//x.m4();not accessing because it is private
	


//object created from different package,only public access kora jabay.
	A y =new A();
	y.m2();//
	
	
	


	}

}
