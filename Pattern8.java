package dataTypes;

public class Pattern8 {

	public static void main(String[] args) {
		int i,j,k=0;
		for(i=3;i>=1;i--)
		{
			for(j=1;j<=3-i;j++)
			{
				System.out.print("  ");
			}
			
			while(k!=(2*i-1))
			{
				System.out.print("*" + " ");
				k++;
				
			}
			k=0;
			System.out.println();
		}
		
		for(i=1;i<=2;i++)
		{
			for(j=i;j<=1;j++)
			{
				System.out.print("  ");
			}
			
			while(k!=(2*i+1))
			{
				System.out.print("*" + " ");
				k++;
				
			}
			k=0;
			System.out.println();
		}

	}

}
/*Output:

* * * * * 
  * * * 
    * 
  * * * 
* * * * * 

*/
