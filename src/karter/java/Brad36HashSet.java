// HashSet 不重複
package karter.java;

import java.util.HashSet;

import karter.api.Member;

public class Brad36HashSet {

	public static void main(String[] args) {
		Member m1 = new Member(1, "Brad");
		Member m2 = new Member(2, "Seal");
		Member m3 = new Member(3, "Cat");
		Member m4 = new Member(4, "Karter");

		HashSet<Member> members = new HashSet<>();
		members.add(m1);
		members.add(m2);
		members.add(m3);
		members.add(m4);
		
		System.out.println(members.size());
		System.out.println(members);
	}

}
