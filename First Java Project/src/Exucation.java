
public class Exucation {

	public static void main(String[] args) {// to work with variable or work we have to do inside a method
	}
	public void work() {
	Calculator c = new Calculator();// object created 
		c.abc();
		int q=c.a;
		//c.a1=7; this a1 from Calculator class .Qus: how can i use it??
		int r=c.a1;
		
		upt(10);// method call
		
		//c.xyz();// this is xyz(); i called from Calculator Class by creating object of that class.
		// t.abc(); compiler not understand bottom to top, it goes top to bottom

		
		
		
		
		
		//Calculator t = new Calculator(); //this is new Object of class Calculator
		//t.abc();
		//t.xyz();
		//c.abc();// we can do like this because compiler goes top to bottom
		//int d = c.a;// if i want to call a variable from another class then i have to either use it  or assign it.
		//c.a=4;// if i want to call a variable from another class then i have to either use it  or assign it.
		

	}
   static void upt(int a) {//main() static so this upt(); has to be static
	   int a1=8;
	   System.out.println(a1);
   }




   void hui() {
	   Calculator dha = new Calculator();
	   int re=dha.a;
	 System.out.println(re);  
   }


}
