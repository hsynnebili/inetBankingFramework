package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class WordsRemove {
	public static void main(String[] args) {
		ArrayList<String> wordlist = new ArrayList<>();

		wordlist.add("lemon");
		wordlist.add("apple");
		wordlist.add("picture");
		wordlist.add("lesson");
		wordlist.add("screen");

		Iterator<String> it = wordlist.iterator();
		while (it.hasNext()) {
			String words = it.next();
			if (words.endsWith("e")) {
				it.remove();
			}

		}
		System.out.println(wordlist);
	}

}
