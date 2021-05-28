import java.util.Scanner;

public class P11_sum_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,even=0,odd=0;
		System.out.println("enter the nth number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			if(i%2==0)
			even=even+i;
			else
			odd=odd+i;
	    }
	    System.out.println("the sum of the even no.from 1 to "+num+" is "+even);
	    System.out.println("\nthe sum of the odd no.from 1 to "+num+" is "+odd);

	}

}
