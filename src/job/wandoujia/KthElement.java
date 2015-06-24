package job.wandoujia;

public class KthElement {
	public int kthElement(int[] arrayA, int startA, int endA, 
						   int[] arrayB, int startB, int endB, int k){
		int lengthA = endA-startA;
		int lengthB = endB-startB;
		int indexA = (lengthA*(k-1))/(lengthA+lengthB);
		int indexB = (lengthB*(k-1))/(lengthA+lengthB);
		if(arrayA[indexA]==arrayB[indexB])
			return arrayA[indexA];
		else if(arrayA[indexA] < arrayB[indexB]){
			return kthElement(arrayA,indexA,endA,startA,indexB+1,k-);
		}
	}
}
