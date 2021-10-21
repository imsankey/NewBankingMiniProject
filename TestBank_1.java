package miniproject;

import java.util.Scanner;

public class TestBank_1
{
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		Bank_1[] b= new Bank_1[10];
		int accnum,choice=0,count=0;
		String acchname,typeofacc;
		double bal=0,deposite,withdrawn;
		
		do
		{
			System.out.println("1.open account \n 2.deposite money \n3.withdrawn money \n4.display all acount \n5.search account");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter the account number");
				accnum=sc.nextInt();
				
				System.out.println("Enter the account holder name");
				acchname=sc.next();
				
				System.out.println("Enter the account Type");
				typeofacc=sc.next();
				
				System.out.println("Enter the account balance");
				bal=sc.nextDouble();
				
				b[count]=new Bank_1(accnum,acchname,typeofacc,bal);
				count++;
				System.out.println("Added sucessfully");
				
				break;
				
			case 2:
				System.out.println("Enter the account number to deposite money");
				accnum=sc.nextInt();
				System.out.println("Enter the amount to deposite");
				deposite=sc.nextDouble();
				
				for(int i=0;i<=count;i++)
				{
					if(b[i]!=null && b[i].getAccountNumber()==accnum)
					{
						b[i].setBalance(bal+=deposite);
						System.out.println(b[i]);
						System.out.println("Deposited succesfully");
					}
				}
				
				break;
				
			case 3:
				
				System.out.println("Enter the account number to withdrawn money");
				accnum=sc.nextInt();
				System.out.println("Enter the amount to withdrawn");
				withdrawn=sc.nextDouble();
				for(int i=0;i<=count;i++)
				{
					if(b[i]!=null && b[i].getAccountNumber()==accnum)
					{
						b[i].setBalance(bal-=withdrawn);
						System.out.println(b[i]);
						System.out.println("withdrawn succesfully");
					}
				}
				
				break;
				
			case 4:
				
				System.out.println("---------------------bank account details-----------------------------");
				for(int i=0;i<=count;i++)
				{
					System.out.println(b[i]);
				}
				break;
				
			case 5:
				System.out.println("Enter the acoount number to get details");
				accnum=sc.nextInt();
				for(int i=0;i<=count;i++)
				{
					if(b[i]!=null && b[i].getAccountNumber()==accnum)
					{
						System.out.println(b[i]);
					}
				}
				
				break;
				
				default :
					System.out.println("invalid choice");
					
			
			}
		}while(choice!=6);
	}

}
