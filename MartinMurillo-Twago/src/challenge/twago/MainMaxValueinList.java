package challenge.twago;

import java.util.Arrays;
import java.util.Scanner;

class result{
	
	public static int GetMaxValue(int[] myarray, int[][] m, int operations) {
		
		int l = myarray.length;
		int[] newarray = new int[l];
		int k1 = 0;
		int k2 =0;
		
		for(int i =0; i< operations; i++) {
			for(int j=0; j< 2; j++) {
				if(j == 0) {
				k1 += k1 + m[i][2];
				newarray[m[i][j]-1] += k1;
				}if(j==1) {
					k2 += k2 + m[i][2];
					newarray[m[i][j]-1] += k2;
				}
						
					
			}
			k1 =0; k2=0;
		}
		
		Arrays.sort(newarray);
		
		return newarray[newarray.length-1];
	}
	
	
	
}


public class MainMaxValueinList {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		int arraysize = scan.nextInt();
		int operations = scan.nextInt();
		int[] myarray = new int[arraysize];
		int[][] m = new int[3][operations];
	
		
		for(int i = 0; i < operations; i ++) {
			
			for(int j=0; j < m.length; j++) {
				
		
				
				m[i][j]= scan.nextInt();
				
			}
			
		}
		
	System.out.println(result.GetMaxValue(myarray,m,operations));
		
	
	}

}
