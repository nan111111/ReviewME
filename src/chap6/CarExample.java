package chap6;
import java.util.*;
public class CarExample {
	public static void main(String[] args) {
		selfNum();
	}
	
	public static void selfNum(){
		int a = 0;
		boolean[100001] notSelfNum = new boolean[100001];
		
		for (int i=1; i<= 10000; i++){
			int b = i % 10;// 1의 자리
	       		int c = (i / 10) - d - e;//10의 자리
	        	int d = (i / 100) - e;//100의 자리
	        	int e = i / 1000;//1000의 자리
			
			a = i + b + c + d + e;
			
			if ( a > 10001)
				continue;
			boolean[a] = true;
		}
		
		for (int i=1; i<= 10000; i++){
			if ( notSelfNum[i] != true)
				System.out.println(i);
		}
	}
}
