package logicalProg;

public class LogicEg1 {

	public static void main(String[] args) 
	{
		System.out.println("Divisible by 3");
		for (int i=0;i<=100;i++)
		{
		 if (i%3==0)
		System.out.println(i+" ");
		}
		
		System.out.println("Divisible by 5");
		for (int i=0;i<=100;i++)
		{
		if (i%5==0)
		System.out.println(i+" ");
		}

		System.out.println("Divisible by 3 & 5");
		for (int i=0;i<=100;i++)
		{
		if (i%3==0 && i%5==0)
		System.out.println(i+" ");
		}

		System.out.println("============================"); 
		for (int i=0;i<=3;i++) //incremental
		{
			for (int j=0;j<=i;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		}
		
		System.out.println("============================"); 
		for (int i=3;i>=0;i--) //decremental
		{
			for (int j=i;j>=0;j--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		}
		
		System.out.println("============================"); 
		for (int i=0;i<=3;i++) //decremental
		{
			for (int j=3;j>=i;j--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		}
		
		System.out.println("=======================");
		for (int i=0;i<=3;i++) //incremental
		{
			for (int j=0;j<=i;j++)
		{		
			System.out.print("* ");
		}
		System.out.println();
		}
		
		System.out.println("=======================");
		for (int i=3;i>=0;i--) //decremental
		{
			for (int j=i;j>=0;j--)
		{		
			System.out.print("* ");
		}
		System.out.println();
		}

		System.out.println("=======================");
		for (int i=0;i<=3;i++) //decremental
		{
			for (int j=3;j>=i;j--)
		{		
			System.out.print("* ");
		}
		System.out.println();
		}
		
	}
	

}
