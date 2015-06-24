package microsoft;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		for(int i=0;i<size;i++){
			int N = in.nextInt();
			int M = in.nextInt();
			int K = in.nextInt();
			
			int totalCase =cmn(M, N);
			if(totalCase<K){
				System.out.println("Impossible");
				continue;
			}
			print01(N, M, K);
		}
	}

	private static void print01(int n, int m, int k) {
		if(k==1){
			for(int i=0;i<n;i++){
				System.out.print(0);
			}
			for(int i=0;i<m;i++){
				System.out.print(1);
			}
			System.out.println();
			return;
		}
		for(int i=0;i<=n;i++){
			k=k-cmn(m-1, i);
			if(k<=0){
				k+=cmn(m-1,i);
				for(int j =n;j>i;j--)
					System.out.print(0);
				System.out.print(1);
				print01(i,m-1,k);
				return;
			}
		}
	}
	private static int cmn(int M, int N){
		int child =1, mother =1;
		for(int m = M, mn = M+N;m>0;m--,mn--){
			child*=mn;
			mother*=m;
		}
		return child/mother;
	}
}
