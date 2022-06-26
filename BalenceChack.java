package chackbalance;

import java.util.Scanner;

public class BalenceChack {
	static double balance=0;

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int deposit;
		int withdraw;
		while(true) {
			System.out.println("1. Deposit "
					+ "2. Withdraw "
					+ "3. Balance "
					+ "4. Exit");
			int userNumber=input.nextInt();
			if(userNumber==1) {
				balanceCheck(userNumber);
				continue;
			}else if(userNumber==2) {
				balanceCheck(userNumber);
				continue;
			}else if(userNumber==3) {
				balanceCheck(userNumber);
			}else if(userNumber==4) {
				System.out.println("Thank You So Much!");
				break;
			}else {
				System.out.println("INPUT 1 TO 4 AND TRY AGAIN");
			}
		}

	}
	public static int balanceCheck(int n) {
		int deposit=0;
		int withdraw=0;
		Scanner input=new Scanner(System.in);
		switch(n) {
		case 1:
			System.out.println("Enter Your Amount for Deposit: ");
			deposit=input.nextInt();
			balance=balance+deposit;
			System.out.println("Successfully deposit ");
			break;
		case 2:
			System.out.println("Enter Your Amount for Withdraw: ");
			withdraw=input.nextInt();
			balance=balance-withdraw;
			System.out.println("Successfully deposit ");
			break;
		case 3:
			System.out.println("The Balance is : "+balance);
			break;
		case 4:
			break;
		default:
			System.out.println("Error found ");
		}
		

		return 0;
	}
	
}
