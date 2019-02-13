package com.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.xalan.xsltc.compiler.sym;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class List {
	/*
	 * List(Interface) 1.ArrayList. 2.LinkedList. 3.vector.
	 */

	@Test
	@Ignore
	public void arrayList() {

		System.out.println("hi");

		/*
		 * //Arraylist class implements List interface and it is based on an Array data
		 * structure. ArrayList is a resizable-array implementation of the List
		 * interface. It implements all optional list operations, and permits all
		 * elements, including null.
		 */

		ArrayList<String> alist = new ArrayList<>();// string type
		alist.add("Afnan");
		alist.add("Zafirah");
		alist.add("Aisha");
		System.out.println(alist);

		alist.remove("Zafirah");
		System.out.println(alist + " This will remove Zafirah ");
		alist.add(1, "Zafirah" + " This will add Zafirah 2nd place");// index position
		System.out.println(alist);
		System.out.println(alist.size());

		ArrayList<Integer> al = new ArrayList<>();// ArratList Interger type
		System.out.println(al.size());// al er vitor kisu nae
		al.add(1);
		al.add(1);
		al.add(2);
		al.add(33);
		al.add(3, 4);// 4 number ayi add hobey
		System.out.println(al.size());// size show korbay
		System.out.println(al);// sob gulur value dhakabey
		al.remove(2);// # remove korbay
		System.out.println(al.get(0) + " ki print hobay");// oh so #1 print hobay

		for (int i = 0; i < al.size(); i++) {

			System.out.println(al.get(i));

		}

	}

	@Test // arraylist ayi add remove loop chara size and loop soho size dhakbo.
	public void loop() {

		ArrayList<String> als = new ArrayList<>();
		als.add("mahmud");
		als.add("Robin");
		als.add("AApon");
		System.out.println(als + " mra :shobar num print korbay");

		als.remove(2);
		System.out.println(als + " aapon remove hobay");
		als.add(2, "AApon");
		System.out.println(als + "AApon abar add hobey");
		System.out.println(als.size() + " ki hobay?");// hmm so 2 jon er size dhakaby
		System.out.println(als.get(2) + "  dhaki ki hoy abar");// hmm AApon print korlo
		// akon 3 type loop chalabo. size r ki assey dhakbo Arraylist er

		for (int i = 0; i < als.size(); i++) {

			String s = als.get(i);
			System.out.println(s + " normal for loop*******");
		}

		// for each loop
		for (String stb : als) {

			System.out.println(stb + " ******* for each loop");

		}

		Iterator<String> st = als.iterator();
		while (st.hasNext()) {
			String sg = (String) st.next();
			System.out.println(sg + "<<<<<< itrator");
		}

	}

	@Test
	@Ignore
	public void mtry() {

		ArrayList<Integer> ali = new ArrayList<>();
		ali.add(10);
		ali.add(20);
		ali.add(30);

		System.out.println(ali + " ali tay ki dhakaby?");

		System.out.println(ali.size() + " size show korbay");
		// for loop
		System.out.println("for loop normal");
		for (int i = 2; i < ali.size(); i++) {

			Integer k = ali.get(i);

			System.out.println(k + " for loop er size er value dhakabay ja holo 3");
			ali.remove(1);

			System.out.println(ali + " 20 remove hobay");
			System.out.println("for each or advance loop ");
			// for each or advance loop
			ali.add(1, 20);// abar 20 add korse
			for (Integer tas : ali) {
				System.out.println(tas + " for each loop er result");
			}

			System.out.println("While loop");
			int j = 0;
			while (ali.size() > j) {
				System.out.println(ali.get(j));
				j++;

			}
			System.out.println("Iterator");
			Iterator<Integer> it = ali.iterator();

			while (it.hasNext()) {
				System.out.println(it.next() + " itrator result");

			}

		}

	}












}






















/*
 * @Test public void m2() { ArrayList<String> tryme1 = new ArrayList<>();
 * 
 * tryme1.add("Sumi Rahman"); tryme1.add("Sumon Rahman");
 * tryme1.add("Tasmiah Rahman"); tryme1.add("Borna Rahman");
 * System.out.println(tryme1); tryme1.add(1,"Sagor Rahman");//add hobay index
 * akaray System.out.println(tryme1);
 * 
 * 
 * System.out.println(tryme1); // iterating ArrayList for (String shob : tryme1)
 * {
 * 
 * System.out.println(shob);// shobar num print hobay
 * 
 * System.out.println(shob);
 * 
 * } }
 */
