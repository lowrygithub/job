package job.wandoujia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * lkr-wandoujia-电面
 * 随机打乱一个数组中元素的算法（实现java中的 shuffle方法）
 * @author Lowry
 *
 */
public class Shuffle {
	public void shuffle(Integer[] array){
		int length = array.length;
		int resultArray[] = new int[length];
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		
		length = 10;
		for(int i=0;i<length;i++){
			int randomIndex = (int) (Math.random()*(length-i)%(length-i));
			System.out.println(randomIndex);
			resultArray[i] = list.remove(randomIndex);
		}
		for(int i = 0;i<length;i++){
			System.out.print(resultArray[i]);
		}
	}
	public static void main(String[] args){
		Integer[] a =new Integer[10];
		for(int i=0;i<a.length;i++){
			a[i] = i+1;
		}
		Shuffle s = new Shuffle();
		s.shuffle(a);
	}
}
