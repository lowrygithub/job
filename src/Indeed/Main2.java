package Indeed;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int Q = s.nextInt();
		for(int ii=0;ii<Q;ii++){
			long n = s.nextLong();
			long i=(long) Math.sqrt((n-1)>>1);
			if((1+(i*(i+1)<<1))<n)
				i++;
			long rank = n-(1+(i*(i-1)<<1));
			long x= (rank>>1)-i;
			long y= i-Math.abs(x);
			if(rank%2==0)
				y=-y;
			System.out.println(x+" "+y);
		}
	}
}
