import java.util.Scanner;

public class method {
	Scanner sc=new Scanner(System.in);
	public Customer[] create()
	{
		
		System.out.println("Enter number to how many people can created account:");
		int n=sc.nextInt();
		Customer arr[]=new Customer[n];
		
	 for(int i=0;i<arr.length;i++)
	 {
		System.out.println("Enter the customer id:");
		System.out.println("Enter the customer name:");
		System.out.println("Enter the mobile number:");
		int a=sc.nextInt();
		String b=sc.next();
		double c=sc.nextDouble();
		
		System.out.println("Enter the account number:");
		System.out.println("Enter the account type:");
		System.out.println("Enter the account balance:");
		double d=sc.nextDouble();
		String e=sc.next();
		double f=sc.nextDouble();
		
		
		
		System.out.println("Enter the state:");
		System.out.println("Enter the Dist:");
		System.out.println("Enter the village:");
		String c1=sc.next();
		String c2=sc.next();
		String c3=sc.next();
		
		
		
	
		Account a1=new Account(d,e,f);
		Address a2=new Address(c1,c2,c3);
		
		Customer a3=new Customer(a,b,c,a1,a2);
		arr[i]=a3;
		
	 }
		return arr;
	}

	public void display(Customer[] a)
	{
		for(int i=0;i<a.length;i++)
		{
		System.out.println("customer id:"+a[i].getCustid());
		System.out.println("customer name:"+a[i].getCustname());
		System.out.println("mobile number:"+a[i].getCustmobno());
		
		System.out.println("account number:"+a[i].getObj1().getAccno());
		System.out.println("account type:"+a[i].getObj1().getAcctype());
		System.out.println("account balance:"+a[i].getObj1().getAccbal());
		
		System.out.println(" state:"+a[i].getObj2().getState());
		System.out.println("Dist:"+a[i].getObj2().getDist());
		System.out.println("village:"+a[i].getObj2().getVillage());
		
		System.out.println("\n");
		
		}
	}
	
	public void search(Customer[] a,String b)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i].getCustname().equals(b))
			{
				System.out.println("data found");
				System.out.println("customer id:"+a[i].getCustid());
				System.out.println("customer name:"+a[i].getCustname());
				System.out.println("account balance:"+a[i].getCustmobno());
				
				System.out.println("account number:"+a[i].getObj1().getAccno());
				System.out.println("account type:"+a[i].getObj1().getAcctype());
				System.out.println("account balance:"+a[i].getObj1().getAccbal());
				
				System.out.println(" state:"+a[i].getObj2().getState());
				System.out.println(" Dist:"+a[i].getObj2().getDist());
				System.out.println("village:"+a[i].getObj2().getVillage());
				
				
			}
			
			
		}
		}
			
		
	    public void modify(Customer[] a,String b) {
	    	
	    	for(int i=0;i<a.length;i++)
			{
				if(a[i].getCustname().equals(b))
				{
					System.out.println("Enter name to modify:");
					a[i].setCustname(sc.next());
					System.out.println("Enter mobile number to modify:");
					a[i].setCustmobno(sc.nextInt());
					System.out.println("Enter account type  to modify:");
					a[i].getObj1().setAcctype(sc.next());
					System.out.println("Enter state to modify:");
					a[i].getObj2().setState(sc.next());
					System.out.println("Enter districk to modify:");
					a[i].getObj2().setDist(sc.next());
					System.out.println("Enter village to modify:");
					a[i].getObj2().setVillage(sc.next());
				}
				}
	    	
	    }
	    public void withdraw(Customer[] a,double b)
	    {for(int i=0;i<a.length;i++)
		{
			if(a[i].getObj1().getAccno()==b)
			{
				System.out.println("Enter amount for withdraw:");
				double d=sc.nextDouble();
				double e=a[i].getObj1().getAccbal();
				double f=e-d;
				a[i].getObj1().setAccbal(f);
			}
			}
	    	
	    }
	    
	    public void deposit(Customer[] a,double b)
	    {for(int i=0;i<a.length;i++)
		{
			if(a[i].getObj1().getAccno()==b)
			{
				System.out.println("Enter amount for deposit:");
				double d=sc.nextDouble();
				double e=a[i].getObj1().getAccbal();
				double f=e+d;
				a[i].getObj1().setAccbal(f);
			}
			}
	    	
	    }
	}

