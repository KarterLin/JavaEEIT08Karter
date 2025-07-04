package karter.java;

import java.util.HashMap;
import java.util.Set;

public class Brad38HashMap {

	public static void main(String[] args) {
		HashMap<String, Object> person = new HashMap<>();
		person.put("name", "Karter");
		person.put("gender", true);
		person.put("age", 27);
		person.put("weight", 77.7);
		
		System.out.println(person.size());
		System.out.println(person.get("name"));
		System.out.println("-----");
		Set<String> keys = person.keySet();
		for (String key : keys) {
			System.out.println(key + ":" + person.get(key)+"\n");
		}

	}

}
