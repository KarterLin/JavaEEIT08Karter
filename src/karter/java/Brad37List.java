// list 可重複，有順序姓(index)
package karter.java;

import java.util.ArrayList;
import java.util.LinkedList;

import karter.api.Member;

public class Brad37List {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Brad1");
		list.add("Brad2");
		list.add(1,"Brad3"); //可以指定在第一的位置
		list.add(1,"Brad4"); //也可以指定第一的位置，他比較後面被執行
		list.add("Brad5");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println("--------");
		
		Member m1 = new Member(1, "Brad");
		Member m2 = new Member(2, "Seal");
		Member m3 = new Member(3, "Cat");
		Member m4 = new Member(4, "Karter");
		LinkedList<Member> ms = new LinkedList<>();
		ms.add(m1);
		ms.add(m2);
		ms.add(m3);
		ms.add(m4);
		System.out.println(ms.size());
		System.out.println(ms);
	}

}
