package microsoft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;


public class Main3 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<Integer, TreeSet<Integer>> map = new HashMap<Integer, TreeSet<Integer>>();
		TreeSet<Integer> s1 = new TreeSet<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		map.put(1, s1);
		TreeSet<Integer> s2 = new TreeSet<Integer>(Arrays.asList(0,2,3,5,6,8,9));
		map.put(2, s2);
		TreeSet<Integer> s3 = new TreeSet<Integer>(Arrays.asList(3,6,9));
		map.put(3, s3);
		TreeSet<Integer> s4 = new TreeSet<Integer>(Arrays.asList(0,4,5,6,7,8,9));
		map.put(4, s4);
		TreeSet<Integer> s5 = new TreeSet<Integer>(Arrays.asList(0,5,6,8,9));
		map.put(5, s5);
		TreeSet<Integer> s6 = new TreeSet<Integer>(Arrays.asList(6,9));
		map.put(6, s6);
		TreeSet<Integer> s7 = new TreeSet<Integer>(Arrays.asList(0,7,8,9));
		map.put(7, s7);
		TreeSet<Integer> s8 = new TreeSet<Integer>(Arrays.asList(0,8,9));
		map.put(8, s8);
		TreeSet<Integer> s9 = new TreeSet<Integer>(Arrays.asList(9));
		map.put(9, s9);
		TreeSet<Integer> s0 = new TreeSet<Integer>(Arrays.asList(0));
		map.put(0, s0);
		for(int i = 0;i<n;i++){
			String line = in.next();
			int j = 0;
			for(j = 0;j<line.length()-1;j++){
				int now = Integer.parseInt(line.charAt(j)+"");
				int next = Integer.parseInt(line.charAt(j+1)+"");
				if(!map.get(now).contains(next)){
					break;
				}
			}
			if(j==line.length()-1){
				System.out.println(line);
				continue;
			}
			int k=j;
			for(k=j;k>=0;k--){
				int nownow = Integer.parseInt(line.charAt(k)+"");
				int nextnext = Integer.parseInt(line.charAt(k+1)+"");
				Integer target =map.get(nownow).lower(nextnext);
				if(target!=null){
					String temp = line.substring(0, k+1);
					System.out.print(temp+target);
					if(target!=0){
						for(int x=k+2;x<line.length();x++)
							System.out.print("9");
					}
					else{
						for(int x=k+2;x<line.length();x++)
							System.out.print("0");
					}
					break;
				}
			}
			if(k==-1){
				char first = (char) (line.charAt(0)-1);
				System.out.print(first);
				for(int ii=1;ii<line.length();ii++){
					System.out.print('9');
				}
			}
			System.out.println();
		}
	}
}
