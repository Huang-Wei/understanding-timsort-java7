package cn.lifebackup.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This class is to reproduce the Java 7 Exception - i.e. <p>
 * Exception in thread "main" java.lang.IllegalArgumentException: Comparison 
 * method violates its general contract!
 */
public class ReproJava7Exception {
	public static void main(String[] args) {
		int[] sample = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-2,1,0,-2,0,0,0,0};
		List<Integer> list = new ArrayList<Integer>();
		for (int i : sample)
			list.add(i);
		
		// use the native TimSort in JDK 7
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// miss the o1 = o2 case on purpose
				return o1 > o2 ? 1 : -1;
			}
		});
	}
}
