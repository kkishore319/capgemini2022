package co.kishore.day11.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStreamofList {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		for (int i=1;i<21;i++) 
		{
			list.add(i);
		}
		
		Stream<Integer> stream= list.stream();
		List<Integer> evenNumberList=stream.filter(i->i %2==0).collect(Collectors.toList());
		System.out.println(evenNumberList);
	}

}
