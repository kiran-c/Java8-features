package com.orakle.streamfilterpredicateoptional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamOne {

	public static void main(String[] args) {


		List<Integer> numList = new ArrayList<>();
		numList.add(11);
		numList.add(12);
		numList.add(211);
		numList.add(121);
		numList.add(141);
		numList.add(1661);
		
		System.out.println("numList:  "+numList);

		
		List<Integer> oddList = new ArrayList<>();
		
		for(Integer i : numList)
		{
			if(i % 2 != 0)
			{
				oddList.add(i);
			}
		}
		
		System.out.println("oddList:  "+oddList);
		
		
		oddList = numList
		.stream()
		.filter((num) -> {return num % 2 != 0; } )
		.collect(Collectors.toList());
		
		
		Predicate<Integer> oddLogicPred = (num) -> {return num % 2 !=0;};
		Predicate<Integer> gt50 = num -> num > 50; 
		 
		oddList =  numList
		.stream()
		.filter(oddLogicPred)
		.filter(gt50)
		.collect(Collectors.toList());
		
 		
		
	}

	
	
	
}
