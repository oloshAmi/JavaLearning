package javacoreplatform_map;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Map<String, String> map= new HashMap<>();
		
		map.put("111", "abc");
		map.put("222", "def");
		map.put("333", "ghi");
		map.put("444", "jkl");
		
		map.forEach((k,v)-> System.out.println(k +" | "+ v));
		
		System.out.println(map.get("333"));
		System.out.println(map.get("3333"));
		System.out.println(map.getOrDefault("3333", "Dumb"));
		
		map.replaceAll((k,v)->v.toUpperCase());
		map.forEach((k,v)-> System.out.println(k +" | "+ v));
	}

}
