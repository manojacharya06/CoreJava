package dataTypes;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print("  ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}

	}

}

/*Output:
5 4 3 2 1  
  5 4 3 2  
    5 4 3  
      5 4  
        5 
*/ 

