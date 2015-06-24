import java.util.Scanner;

public class Main1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int T = in.nextInt();
			for(int i=0;i<T;i++){
				int N = in.nextInt();
				int M = in.nextInt();
				int[] lostDays = new int[N+2];
				for(int j = 1;j<=N;j++){
					lostDays[j] = in.nextInt();
				}
				lostDays[N+1] = 101;
				if(M>=N)
					System.out.println(100);
				else{
					int max = 0;
					for(int k = M+1;k<N+2;k++){
						int length = lostDays[k]-lostDays[k-M-1]-1;
						if(length>max)
							max = length;
					}
					System.out.println(max);
				}
			}
		}
	}
}
