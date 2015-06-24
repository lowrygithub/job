package microsoft;

import java.util.Scanner;
public class KMP{
    static int[] next;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s, t;
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            t = scan.next();
            s = scan.next();
            System.out.println(kmp(s, t));
        }
    }
    public static int kmp(String src, String tgt){
        initNext(tgt);
        int count = 0;
        int len = src.length();
        int indexT = 0;
        for(int i=0;i<len;i++){
            while(indexT>0 && src.charAt(i)!=tgt.charAt(indexT))
                indexT = next[indexT-1];
            if(src.charAt(i)==tgt.charAt(indexT))
                indexT ++;
            if(tgt.length()==indexT){
                count++;
                indexT = next[indexT-1];
            }
        }
        return count;
    }
    public static void initNext(String tgt){
    	int len = tgt.length();
    	next = new int[len];
        next[0] = 0;
        int k = 0;
        for(int i=1;i<len;i++){
            while(k>0 && tgt.charAt(i)!=tgt.charAt(k))
                k = next[k-1];
            if(tgt.charAt(i)==tgt.charAt(k))
                k ++;
            next[i]=k;
        }
    }
    
}