package project.selfefd.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FDData {
	public void java8Map1()
	{
		 System.out.println("asdasd"); 
	}
	
	public void mapExample()
	{
		
		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
		 
		List<Integer> listOfIntegers = listOfStrings.stream()
		                                .map(Integer::valueOf)
		                                .collect(Collectors.toList());
		 
		System.out.println(listOfIntegers);     //[1, 2, 3, 4, 5]
		
	}
	
	public void flatMapExample()
	{
		
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);
		List<Integer> list3 = Arrays.asList(7,8,9);
		 
		List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
		 
		List<Integer> listOfAllIntegers = listOfLists.stream()
		                            .flatMap(x -> x.stream())
		                            .collect(Collectors.toList());
		 
		System.out.println(listOfAllIntegers);  
		
	}
	
	public void java8Map()
	{
		//String[] a = {"andrew","jeri","shirly","judith"};
		 ArrayList<String> students = new ArrayList<String>(); 
		  
	        // Add Strings to list 
	        // each string represents student name 
	        students.add("Ram"); 
	        students.add("Mohan"); 
	        students.add("Sohan"); 
	        students.add("Rabi"); 
		
	        students.forEach((n) -> print(n));

		
	}
	
	public static void print(String n) 
    { 
        System.out.println("Student Name is " + n); 
    }
	
	public static void main(String args[]) {

       
       FDData f = new FDData();
       f.java8Map();
       
	}
}