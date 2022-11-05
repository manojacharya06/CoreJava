package dataTypes;

public class Pattern3 {

	public static void main(String[] args) {
		int i,j,k=0;
		for(i=1;i<=3;i++)
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
		
		for(i=2;i>=1;i--)
		{
			for(j=2;j>=i;j--)
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
	}

}

/*Output:
    * 
  * * * 
* * * * * 
  * * * 
    * 
*/
