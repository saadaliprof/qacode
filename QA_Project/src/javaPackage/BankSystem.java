package javaPackage;

public class BankSystem {
	
	BankSystem(String user,String pass)

	{
		System.out.println("This is constructor section"+user+ " "+pass);
	}
	// globally
	int amt =1000; 
	
	void deposit(int a)
	{
		//locally
	amt = amt +a;
	System.out.println("The amount after deposit "+amt);
	}
	
	void withdraw(int b)
	{
		amt =amt-b;
		System.out.println("the amt after the withdraw "+amt);
	}
	
	int dispaly()
	{
		return amt;
	}
	public static void main(String[] args) {
		
		//Create an object. 
		BankSystem obj=new BankSystem("Saad12","!234");
		obj.deposit(1000);
		obj.withdraw(500);
		System.out.println(obj.dispaly());

	}

}
