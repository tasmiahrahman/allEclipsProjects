package sw1tch.com;

import org.junit.Test;

public class Switch {
	/*
	 * Switch statement works with numeric value, it doesn't take any boolean
	 * condition Switch statement works with multiple condition. we have to break
	 * the condition other wise compiler will execute all conditions if there are no
	 * break. At the end we have to declare default, which works same as else
	 * statement. Which ever case will be equal to the int value that building block
	 * will get executed.
	 */

	int x = 4;
	String v;

	@Test
	public void m3() {
		switch (x) {
		case 1: {
			v = "case ";
			System.out.println(v + 1);
			break;
		}
		case 2: {
			v = "Case ";
			System.out.println(v + 2);
			break;
		}
		case 3: {
			v = "case ";
			System.out.println(v + 3);
			break;
		}
		/*
		 * case 4: { v = "case"; System.out.println(v + 6); break; }
		 */

		default: {

			v = "default ";

			System.out.println(v + 5);
			// no need break
		}
		}

	}
	
	@Test
	public void loop() {

		for (int i = 0; i <= 100; i++) {

			if (i % 3 == 0 && i % 5 == 0) //i don't understand this logic. why??
				
			{
				System.out.println("Shahidul");
			} else if (i % 5 == 0) {
				System.out.println("Asad");
			}
			if (i % 3 == 0) {
				System.out.println("muskfiq");
			} else {
				System.out.println("shahidul,Asad,Mushfiq");
			}
		}
	}

	public void loop1() {
		
		
		for(int n=0;n<=100;n++) {
			
			if(n%3==0) {
				
				System.out.println("mushfiq");
			}
			else if(n%5==0&&n%5==0) {
				
				System.out.println("asad");
			}
			else {
				
				System.out.println("Asad,shohidul,mushfiq");
			}
		}
	}




}
