package com.collections.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SynchronizedVersionOfMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(10, "Santosh");

		Map<Integer, String> synchronizedMap = Collections.synchronizedMap(hm);
		List<Object> list = Collections.synchronizedList(new ArrayList<>());
		System.out.println(synchronizedMap);
	}

}
