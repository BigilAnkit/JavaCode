import java.util.*;

public class main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		int  myNumber= (int)(Math.random()*100);

		
		
		int userNumber=0;
		do
		{
			System.out.println("gusse your number");
			userNumber=sc.nextInt();
			if(userNumber==myNumber)
				{
			System.out.println("your no is carrect");
			break;
			}
			else if (userNumber>myNumber)
			{
				System.out.println("your no is to high");
			}

			else
				{
				System.out.println("your no is to low");
			}
		}while (userNumber>=0);
		
		
		System.out.println(myNumber);


	}
}