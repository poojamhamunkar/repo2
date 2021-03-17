package Bank;

public class Loan   extends BankAccount{
	double accountbal;
	double emi;
	public void accdetails(String accno,String accholder,double accontbal,double emi)
	{
		super.accdetails(accno,accholder);
		this.accountbal=accountbal;
		this.emi=emi;
		System.out.println("Account balance :"+accountbal);
		System.out.println("EMI :"+emi);
		

}
}
