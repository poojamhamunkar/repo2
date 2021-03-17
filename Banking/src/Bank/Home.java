package Bank;

public class Home extends Loan	
{
	double accountbal;
	double emi;
	
public void accdetails(String accno,String accholder,double accontbal,double emi)
{
	super.accdetails(accno,accholder);
	
	this.emi=emi;
	System.out.println("EMI :"+emi);

}

}
