package week3.Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesAssign2 {

	public static void main(String[] args) {

		String s = "We learn java basics as part of java sessions in java week1";

		Set<Character> remove = new LinkedHashSet<Character>();

		for (char c : s.toCharArray()) {

			System.out.println(remove.add(c));
		}
		for (char dis : remove) {
			System.out.print(dis);

		}

	}
}
