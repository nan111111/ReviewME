package chap6;
import java.util.*;
public class CarExample {
	public static void main(String[] args) {
		int a = 0;
		for(int i = 1; i < 10000; i++){
	        
	     
	        if(1 <= i && i < 10) {
		        a = i + i;
	        	System.out.println(a);
	        }
	        if (10 <= i && i < 100) {
	        	int b = 0;
	        	int c = 0;
	        	b = i % 10;// 1�� �ڸ�
	        	c = i / 10;//10�� �ڸ�
	        	a = i + b + c;
	        	System.out.println(a);
	        }
	        if (100 <= i && i < 1000) {
	        	int b = 0;
	        	int c = 0;
	        	int d = 0;
	        	b = i % 10;// 1�� �ڸ�
	        	d = i / 100;//100�� �ڸ�
	        	c = (i / 10) - d;//10�� �ڸ�
	        	a = i + b + c + d;
	        	System.out.println(a);
	        }
	        if (1000 <= i && i < 10000) {
	        	int b = 0;
	        	int c = 0;
	        	int d = 0;
	        	int e = 0;
	        	b = i % 10;// 1�� �ڸ�
	        	e = i / 1000;//1000�� �ڸ�
	        	d = (i / 100) - e;//100�� �ڸ�
	        	c = (i / 10) - d - e;//10�� �ڸ�
	        	a = i + b + c + d + e;
	        	System.out.println(a);
	        }
	        if(i == 10000) {
	        	a = 10000 + 1;
	        }
	        
	        
		}
		
				
		
	}
}
