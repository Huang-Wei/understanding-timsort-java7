package cn.lifebackup.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import cn.lifebackup.common.DupeTimSort;

/**
 * This class is to demonstrate the TimSort algorithm
 */
public class UnderstandTimsort {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		int[] sample = new int[]{7,5,1,2,6,8,10,12,4,3,9,11,13,15,16,14};
		List<Integer> list = new ArrayList<Integer>();
		for (int i : sample)
			list.add(i);
		
		/*for (int i = 17; i <= 50; i++)
			list.add(i);*/
		
		DupeTimSort.sort(list.toArray(), (Comparator) new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
			
		});
	}

}
