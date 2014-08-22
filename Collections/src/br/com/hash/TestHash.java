package br.com.hash;

import java.util.HashSet;
import java.util.Set;

public class TestHash {

	public static void main(String[] args) {
		
		Set<String> hash = new HashSet<>();
		
		hash.add("String 01");
		hash.add("String 02");
		hash.add("String 03");
		hash.add("String 04");
		hash.add("String 05");
		hash.add("String 06");
		
		
		
		System.out.println(hash.contains("String 01") );
		System.out.println(hash.contains("String 07"));
		System.out.println(hash.hashCode());
		System.out.println(hash.isEmpty());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

	}

}
