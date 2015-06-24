package microsoft;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Lower {
	public static void main(String[] args){
		//方法1：
		Set<Integer> set1 = new TreeSet<>(Arrays.asList(1,2,3,5,6));
		
		//方法2：
		Integer[] arr = {1,2,3,5,6};
		Set<Integer> set2 = new TreeSet<>(Arrays.asList(arr));
	}
}
