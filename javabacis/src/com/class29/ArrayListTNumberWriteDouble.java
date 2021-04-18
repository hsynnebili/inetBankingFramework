package com.class29;

import java.util.*;

public class ArrayListTNumberWriteDouble {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i <= 5; i++) {
			list.add(i);
			list.add(i);

		}
		for (Integer l : list) {
			System.out.print(l + " ");
		}

	}

}
