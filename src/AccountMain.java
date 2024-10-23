import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		int i;
		method a1=new method();
		
		Scanner sc=new Scanner(System.in);
		Customer[] b1 = null;
		
		do {System.out.println("Menu");
			System.out.println("1.create a customer accounts\n2.search Customer account\n3.modify data\n4.withdraw\n5.deposit");
			int ch=sc.nextInt();
			switch(ch) {
		
			case 1: b1=a1.create();
			        a1.display(b1);
				    System.out.println("----------Account successfully created------");
	                break;
			case 2:
				System.out.println("Enter record name to search:");
				String b=sc.next();
				a1.search(b1, b);
				System.out.println("----------Customer search successfully ---------");
				break;
			
			case 3:
				System.out.println("Enter record name of customer to modify data:");
				String c=sc.next();
				  a1.modify(b1,c);
				  System.out.println("----------Account successfully modify------");
				  break;
				  
			case 4:
				System.out.println("Enter account number to withdraw:");
				a1.withdraw(b1, sc.nextDouble());
				System.out.println("----------Ammount  successfully withdraw------");
				break;
				
			case 5:
			System.out.println("Enter account number to deposit:");
			a1.deposit(b1,sc.nextDouble());
			System.out.println("----------Ammount  successfully added to account------");
			break;
		
		
			}
			System.out.println("Do you want to continue press 1:");
		   i=sc.nextInt();
		
		}while(i==1);
	}

}
