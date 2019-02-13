package com.string;

import java.util.Scanner;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	
	  // WebDriver dr=new ChromeDriver();
	  
	  @Test public void m() {
	  
	  }
	  
	  @Test public void stringReverse() { String ulta = "How are you?"; String
	  reverse = new StringBuffer(ulta).reverse().toString();
	  System.out.println(reverse); }
	  
	  @Test public void abc1224Result36() {
	  
	  String s = "12abc24"; String s1 = s.replace("abc", ",");
	  System.out.println(s1); String s2[] = s1.split(","); //
	  System.out.println(s2);//[Ljava.lang.String;@6e5e91e4 
	  int i = Integer.parseInt(s2[0]);// o delum kano?ans;index er jonney split korar por 12 and 24 rray tay 2ee bag // hoesay.
	  int c = Integer.parseInt(s2[1]);// 1delum kano? 
	  System.out.println(i); System.out.println(c);
	  System.out.println(i + c);
	  
	  }
	  
	 
	  
	  @Test public void Palindrom() {
	  
	  /* A regular palindrome is a string of numbers or letters that is the same //
	  forward as backward. // For example, the string "ABCDEDCBA" is a palindrome
	  because it is the same // when the string is read from left to right as when
	  the string is read from // right to left.
*/	  
	  String original, reverse = ""; // Objects of String class 
	  Scanner consoleRead = new Scanner(System.in);
	  
	  System.out.println("Enter a string to check if it is a palindrome :");
	  original = consoleRead.nextLine();
	  
	  int length = original.length();
	  
	  for (int i = length - 1; i >= 0; i--) reverse = reverse + original.charAt(i);
	  
	  if (original.equals(reverse))
	  System.out.println("The string is a palindrome."); else
	  System.out.println("The string isn't a palindrome.");
	  
	  }
	  
	  @Test public void reverseANumber() {
	  
	  int num = 123456; int rev = 0;
	  
	  while (num != 0) {
	  
	  rev = rev * 10 + num % 10; num = num / 10; }
	  System.out.println("the reverse number is :" + rev); }
	 
	
	  @Test public void swapANumberWithOutThirdVariable() { int x=5; int y=10;
	  y=y-x; System.out.println("The new value of Y is :"+y); x=x+x;
	  
	  System.out.println("The new Value of x is :"+x);
	  
	  }
	 

	@Test
	public void primeNumber() {
		/*If i == j, then you must have run through your inner nested loop the maximum number of times possible. 
  But if you were able to do this, that means the condition for the "if" that causes the inner loop to terminate
   ("break") never evaluated to "true". 
   This conditional tests for when a number is notPrime. 
   So if notPrime continuously evaluates false such that you are able to run the inner loop until i == j, 
   then you must have found a prime number.
*/
		for(int i=2;i<=100;i++) {
			for(int j=2;j<=i;j++) {
				
				if(j==i) {
					
					System.out.println(i);
				if(i%j==0) {
					
					
					break;
				}
				}
		}
		}
	}

	@Test
	public void factorialNumber() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	int number=sc.nextInt();
	
	int result=1;
	if (number<=0) {
		
		result=1;
	}
	else {
		
		for(int i=1;i<=number;i++) {
			result=result*i;
			System.out.println(result);
			
		}
	}
}
@Test
public void fibonacci() {
	//Fibonacci number means:4=0+1+1+2.
	
	int numberToPrint;
	Scanner sc=new Scanner(System.in);
	System.out.println("number of Fibonacci number to print :");
	numberToPrint=sc.nextInt();
	int current=1;
	int first=0;
	int lastest;
	System.out.println(first);
	System.out.println(current);
	for(int i=2;i<numberToPrint;i++) {
		
		lastest=first;
		first=current;
		current=lastest+first;
		System.out.println(current);
	}
}




}
