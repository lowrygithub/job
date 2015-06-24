package Indeed;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Math.pow(10, n)-1);
		ArrayList<String> resultList = new ArrayList<>();
		resultList = getList(n);
		for(String s: resultList)
			System.out.println(s);
	}
	public static ArrayList<String> getList(int n){
		ArrayList<String> resultList = new ArrayList<>();
		if(n==1){
			for(int i=0;i<10;i++){
				resultList.add(i+"");
			}
		}
		else{
			for(int i=0;i<10;i++){
				ArrayList<String> list = getList(n-1);
				if(i%2==0){
					for(String str:list){
						resultList.add(i+str);
					}
				}
				else{
					int len = resultList.size();
					for(String str:list){
						resultList.add(len, i+str);;
					}
				}
			}
		}
		return resultList;
			
	}
}
