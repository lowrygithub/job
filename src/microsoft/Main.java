package microsoft;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		Set<String> result = new TreeSet<String>();
		for(int i=0;i<s.length();i++){
			Set<Character> set = new HashSet<Character>();
			for(int j=i;j<s.length();j++){
				set.add(s.charAt(j));
				int number = set.size();
				if(isFib(number)){
					result.add(s.substring(i, j+1));
				}
			}
		}
		for(String re: result){
			System.out.println(re);
		}
	}

	public static boolean isFib(int number) {
		if(number==1)
			return true;
		int f0=1,f1=1;
		while(true){
			if(number==(f0+f1)){
				return true;
			}
			if(number<(f0+f1))
				return false;
			int temp=f0;
			f0=f1;f1=temp+f1;
		}
	}
}
