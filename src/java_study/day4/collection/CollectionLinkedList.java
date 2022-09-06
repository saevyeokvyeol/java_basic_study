package java_study.day4.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import java_study.day2.object.Ex2;

public class CollectionLinkedList {
	Ex2[] member;
	static List<Ex2> list;
	public CollectionLinkedList() {
		member = new Ex2[3];
		for(int i = 0; i < member.length; i++) {
			member[i] = new Ex2("À¯´Ù" + i, "" + (char)(97 + i), "1234");
		}
		list = Arrays.asList(member);
		for (Ex2 m : list) {
			System.out.println(m.getId());
		}
		list = new LinkedList<Ex2>();
		Iterator<Ex2> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getId());
		}
		list.remove(member[1]);
		for (Ex2 m : list) {
			System.out.println(m.getName());
		}
	}
	public static void main(String[] args) {
		new CollectionLinkedList();
	}
}
