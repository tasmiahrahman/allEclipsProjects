package a.com;

import org.junit.Test;

// non access modifier give us attribute change. Static,final,abstract
public class NonAccessModifier {

	public int f = 7;// it will come back to initial value after it change. instance variable 
	public static int d = 7; // static variable works with change value.Class variable 

	
	public NonAccessModifier() {
		 f++;
		 d++;
		 System.out.println(f);
		 System.out.println(d);
		 
	}
	NonAccessModifier(int x){
		
		f++;
		 d++;
		 System.out.println(f);
		 System.out.println(d);
		
		
	}
	
	
	

}
