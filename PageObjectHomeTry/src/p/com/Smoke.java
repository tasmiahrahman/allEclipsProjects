package p.com;

public class Smoke extends Base {//Smoke class inherited Base class.
public static void main(String[] args) throws InterruptedException {
	
	open();// this open() from Base class,because of inheritance method it can be called without object creation or by reference name.
	
	Shared s = new Shared(dr);// shared class's object created here.
	s.target();
	
	
	close();
}
}
