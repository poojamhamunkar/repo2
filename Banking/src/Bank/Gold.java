package Bank;

public class Gold extends Loan {
	double accountbal;
	double emi;
	
	
	public void accdetails(String accno,String accholder,double accountbal,double emi)
	{
		super.accdetails(accno, accholder);
		this.emi=emi;
		
		System.out.println("EMI :"+emi);

}

}
