package Bank;

public class Saving extends BankAccount {
	
	double accountbal;
	public void accdetails(String accno,String accholder,double accontbal)
	{
		super.accdetails(accno,accholder);
		this.accountbal=accountbal;
		System.out.println("Account balance :"+accountbal);
	}

}
