import java.util.Scanner;

public class P5_swap_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two no.");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("the numbers are");
		System.out.println("a = "+a+" b = "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("no. after swapping");
		System.out.println("a = "+a+" b = "+b);

	}

}
