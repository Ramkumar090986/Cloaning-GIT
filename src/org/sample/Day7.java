package org.sample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day7 {
	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		
		System.out.println("List Values:"+li);
		List lj=new ArrayList();
		lj.add(30);
		lj.add(40);
		lj.add(50);
		lj.add(60);
		lj.add(80);
	    System.out.println("List Values1:"+lj);
	    li.addAll(lj);
	    System.out.println("Add all:"+li);
		lj.removeAll(li);
		System.out.println("Unique values:"+lj);
		System.out.println("Work done by Person2");
		System.out.println("Person 3 code added");

}
}
	


