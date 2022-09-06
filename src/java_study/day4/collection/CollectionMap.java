package java_study.day4.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "spring");
		map.put("2", "summer");
		map.put("3", "fall");
		map.put("4", "winter");
		
		String value = map.get("1");
		System.out.println(value);
		
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("key = " + key + " | value = " + map.get(key));
		}
	}

}
