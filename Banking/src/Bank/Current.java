package Bank;

public class Current extends BankAccount {
	double accountbal;
	public void accdetails(String accno,String accholder,double accountbal)
	{
		super.accdetails(accno, accholder);
		this.accountbal=accountbal;
		System.out.println("Account balance :"+accountbal);

}
}
