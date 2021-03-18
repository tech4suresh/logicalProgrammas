package com.str.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
	public void findDuplicateChar(String in) {
		// to iterate each string char
		char[] inChars = in.toCharArray();
		// to store key and its occerances in number
		Map<Character, Integer> inMap = new HashMap<Character, Integer>();

		for (char c : inChars) {
			// check is it available in map and put first occerance
			if (!inMap.containsKey(c)) {
				inMap.put(c, 1);
			} else {
				// its all ready there=>increment occernce
				inMap.put(c, (inMap.get(c) + 1));
			}
		}
		// duplicate not allowed it contains each element only once
		// here if i iterated from array, array contains duplicate elements so
		// it would have checked same element multiple times its not recommended 
		Set<Character> duplicates = inMap.keySet();
		for (Character character : duplicates) {
			if (inMap.get(character) > 1) {
				System.out.println("DUPLICATES ::::" + character);

			}
		}
		System.out.println("OCCRENCES" + inMap.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.findDuplicateChar("susussaahp");

	}

}
