package Bank;

public class Vehical extends Loan
{
	String loanDuration;
	public void accdetails(String accno,String accholder,double accontbal,double emi,String loanDuration) )
	{
		super.accdetails(accno,accholder,accountbal,emi);
		this.loanduration=loanDuration;
		System.out.println("Loan Duration :"+loanduration);

}
}
