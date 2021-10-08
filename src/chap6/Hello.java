package chap6;

import java.util.Scanner;
public class Hello {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double f;//√÷¡æ
        for(int i = 0; i < a; i++) {
        	int b = scan.nextInt();
        	double[] arr1 = new double[b];
        	double c = 0;
        	for(int j = 0; j < b; j++) {
        		arr1[j] = scan.nextInt();
        		c = c + arr1[j];
        	}
        	c = c / b;// ∆Ú±’
        	int q = 0;
        	for(int j = 0; j < b; j++) {
        		if(arr1[j] > c) {
        			q = q + 1;
        		}
        		
        	}
        	
        	f = ((double)q / (double)b) * 100;
        	
        	
        	System.out.println(String.format("%.3f", f));
        }
		
	
         
       
	}

}

