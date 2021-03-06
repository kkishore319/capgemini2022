package co.kishore.day8.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* The important points about Java LinkedHashSet class are:
  Java LinkedHashSet class contains unique elements only like HashSet.
  Java LinkedHashSet class provides all optional set operation and permits null elements.
  Java LinkedHashSet class is non synchronized.
  ava LinkedHashSet class maintains insertion order.
 * */

public class LinkedHashSetdemo {

	public static void main(String ar[]) {

		//Set<String> setdemo = new LinkedHashSet<String>();
		
		LinkedHashSet<String> linkedHashSettdemo = new LinkedHashSet<String>();

		linkedHashSettdemo.add("apple");
		linkedHashSettdemo.add("mango");
		linkedHashSettdemo.add("banana");
		linkedHashSettdemo.add("nuts");
		linkedHashSettdemo.add("apple");
		linkedHashSettdemo.add("apple");
		linkedHashSettdemo.add("apple");
		linkedHashSettdemo.add("apple");

		// Collections.synchronizedSet(setdemo); ///explicity

		linkedHashSettdemo.add(null);
		linkedHashSettdemo.add(null);

		linkedHashSettdemo.add(null);

		Iterator iterator = linkedHashSettdemo.iterator();

		if (iterator != null) {

			while (iterator.hasNext()) {

				System.out.println(iterator.next());

			}

		}

	}

}
