package com.class32;

import java.util.LinkedHashMap;
import java.util.*;

public class MapBestBuyStore {

	public static void main(String[] args) {

		Map<Integer, String> bestStore = new LinkedHashMap<>();

		bestStore.put(100, "TV"); // Entry<Key, Value>
		bestStore.put(101, "Printer"); // Entry<String, Integer>
		bestStore.put(102, "aaa");
		bestStore.put(103, "bbb");
		bestStore.put(104, "ccc");

		System.out.println(bestStore);
		for (Map.Entry<Integer, String> entry : bestStore.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		Iterator<Map.Entry<Integer, String>> store = bestStore.entrySet().iterator();
		while (store.hasNext()) {
			Map.Entry<Integer, String> stores = store.next();
			System.out.println(stores.getKey() + "=" + stores.getValue());
		}
	}
}
