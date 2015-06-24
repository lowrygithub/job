package microsoft;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Trie {
	public static class Node{
		int count;
		Map<Character,Node> map = new HashMap<Character,Node>(); 
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			Node root = new Node();
			int n = in.nextInt();
			for(int i=0;i<n;i++){
				String word = in.next();
				Node node = root;
				for(int j=0;j<word.length();j++){
					Character letter = word.charAt(j);
					if(node.map.containsKey(letter)){
						node = node.map.get(letter);
						node.count=node.count+1;
					}
					else{
						Node newNode = new Node();
						newNode.count = 1;
						node.map.put(letter, newNode);
						node = node.map.get(letter);
					}
				}
			}
			int m = in.nextInt();
			for(int i=0;i<m;i++){
				String word = in.next();
				Node node = root;
				int j;
				for(j=0;j<word.length();j++){
					Character letter = word.charAt(j);
					if(node.map.containsKey(letter)==false){
						break;
					}
					else{
						node = node.map.get(letter);
					}
				}
				if(j<word.length()){
					System.out.println(0);
				}
				else{
					System.out.println(node.count);
				}
				
			}
		}
		in.close();
	}
}
