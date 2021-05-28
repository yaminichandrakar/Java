import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,flag=1;
		System.out.println("enter the nth term");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("the prime no. between 1 to "+n+" is");
		for(i=2;i<=n-1;i++)
		{
			flag=1;
			for(j=2;j<=i-1;j++)
			{
				if(i%j==0)
				flag=0;
			}
			if(flag==1)
			System.out.print(i+" ");
		}

	}

}
