package microsoft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LongestRepeatedSequence {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		TreeSet<Integer> set = new TreeSet<Integer>(Arrays.asList(2,3,4,5));
		HashMap<Integer,TreeSet<Integer>> map = new HashMap<Integer, TreeSet<Integer>>();
		map.put(1, set);
		System.out.println(map.get(0)==null);
		
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		m.put(1, 1);
		System.out.println(m.get(0)==null);
		
		System.out.println(set.lower(2) == null);
		System.out.println(map.get(1).lower(2) == null);
		
//		if(set.lower(2)+""!="null")
//			System.out.println(set.lower(2));
//		System.out.println((set.lower(2)+"").equals("null"));
	}

}
