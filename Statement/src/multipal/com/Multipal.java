package multipal.com;

import org.junit.Test;

public class Multipal {
	/*
	  If, else if, else If there are multiple conditions then in that case we will have to use multiple if
	  else statement. If the 1st condition is found as true ,then compiler will execute that line. 
	  break the statement and will not go anywhere.
	   If none of the condition found as true then compiler will execute else.*/
	@Test
	public void  m() {
		int a=10;
		String s;
		if(a<=5) {
		s="false";	
		System.out.println(s);	
			
		}
		else if(a<2) {
			s="false too";
			System.out.println(s);
			
		}
		else {
			s="else";
			System.out.println("None of this condition is right so it will print "+ s);
		}
	}
	
	
}
