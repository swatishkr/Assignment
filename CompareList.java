package Java2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareList {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(); 
		List<Integer> list2 = new ArrayList<>();

		list1.add(10);
		list1.add(1);
		list1.add(9);
		list1.add(11);
		
		
		
		list2.add(11);
		list2.add(12);
		list2.add(9);
		list2.add(10);
		list2.add(23);
		
		
		
list1.retainAll(list2);

System.out.println("Common elements: "
        + list1);
		

       
		
	}
}
