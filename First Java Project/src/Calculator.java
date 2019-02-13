
class Calculator {

	String s = "hi";
	                       // int a= 5 it will show red color which means compile error.
	int a1 = 5;
	int i = 100;           // Integer is generally used as the default data type for integral values unless there is a concern about memory.
	byte b = 127;          // Byte data type is used to save space in large arrays, mainly in place of integers, since a byte is four times smaller than an integer.
	short sh = 10000;      // Short data type can also be used to save memory as byte data type. A short is 2 times smaller than an integer.
	long l = 100000;       // This type is used when a wider range than int is needed.
	float f = 234.5f;     // Float is mainly used to save memory in large arrays of floating point numbers.
	double d = 1.2;       // data type is generally used as the default data type for decimal values.
	boolean bo = true;   // This data type is used for simple flags that track true/false conditions.
    char letterA='A';    //Char data type is used to store any character.
	int a = 20;

	void abc() {

		System.out.println(a +" This is global variable a.");
		int b = 12;
		int c = b + a;
		System.out.println(c);
		System.out.println(a1);
		int z=a1+i;
		System.out.println(z +" This z is inside local abc(); addition of global variable.");
        int bt=i+b;
        double du=b+d;
        float fe=f+a;
        System.out.println(bt);
        System.out.println(b+d);
        System.out.println(du);
        System.out.println(a-d);
        System.out.println(fe);
        
        
       
	}

	void xyz() {
		String xc="local variable ";
		String y=xc+s;
		System.out.println(s+" This s is global Varible String");
		System.out.println(xc);
		System.out.println(y);
		
		
	}

}
