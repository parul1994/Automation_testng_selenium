package constructor_practice;

import java.util.Scanner;

 class greatest_no_using_const {
	
	int n1;
	int n2;
	int n3;
	int n4;

	public greatest_no_using_const(int a,int b,int c,int d)
	{
		n1=a;
		n2=b;
		n3=c;
		n4=d;
		/*if(a>b)
		{
			System.out.println("a is greater than b; value of a is = "+a);
		}
		else
		{
			System.out.println("b is greater than a; value of b is = "+b);
		}*/
		/*if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater than c; value of a is = "+a);
			}
			else
			{
				System.out.println("c is greater than a; value of c is = "+c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is greater than c; value of b is = "+b);
			}
			else
			{
				System.out.println("c is greater than b; value of c is = "+c);
			}
		}*/
		
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("a is greater than d; value of a is = "+a);
				}
				else
				{
					System.out.println("d is greater than a; value of d is = "+d);
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println("c is greater than d; value of c is = "+c);
				}
				else
				{
					System.out.println("d is greater than c; value of d is = "+d);
				}
				
			}
		}
		
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.println("b is greater than d; value of b is = "+b);
				}
				else
				{
					System.out.println("d is greater than b; value of d is = "+d);
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println("c is greater than d; value of c is = "+c);
				}
				else
				{
					System.out.println("d is greater than c; value of d is = "+d);
				}
			}
		}

	
	
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first input:- ");
		int n1=sc.nextInt();
		System.out.println("Enter second input");
		int n2 =sc.nextInt();
		System.out.println("Enter third input");
		int n3=sc.nextInt();
		System.out.println("Enter fourth input");
		int n4=sc.nextInt();
		greatest_no_using_const obj=new greatest_no_using_const(n1,n2,n3,n4);
		
		
	}

}
