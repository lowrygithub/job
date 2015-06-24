import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class Test {
	public static void main(String[] args){
//		new Test().print1ToMaxOfNDigits(90);
		String[] arr = {"111","222","222"};
		HashSet<String> set = new HashSet<String>(Arrays.asList(arr));
		char[] sChars = "1234".toCharArray();
		HashSet targetSet = new HashSet(Arrays.asList(sChars));
		new HashMap<String, String>().recontainsKey("");
		
		System.out.println(targetSet.contains('2'));
//		System.out.println("123".substring(0,0));
	}
	public void print1ToMaxOfNDigits(int n){
		int leftNumberOfDigits = n%9;
		int numberOf9 = n/9;
		int[] number = new int[numberOf9+1];
		int maxNumber = 1;
		for(int i=0;i<leftNumberOfDigits;i++){
			maxNumber*=10;
		}
		for(int i=0;i<maxNumber;i++){
			number[0] = i;
			printRecursively(number, 1);
		}
	}
	void printRecursively(int[] number, int index){
		int size = number.length;
		if(index>=size){
			printNumber(number);
			return;
		}
		for(int i=0;i<999999999;i++){
			number[index]=i;
			printRecursively(number, index+1);
		}
	}
	void printNumber(int[] number){
		boolean begin = false;
		for(int i=0;i<number.length;i++){
			if(!begin&&number[i]!=0){
				begin = true;
			}
			if(begin == true){
				System.out.println(number[i]);
			}
		}
	}
	
}
