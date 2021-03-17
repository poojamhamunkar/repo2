package Bank;

public class Education   extends Loan{
	String duration;
	double emi;
	public void accdetails(String accno,String accholder,double accontbal,double emi)
	{
		super.accdetails(accno,accholder,accountbal,emi);
		this.emi=emi;
		System.out.println("EMI :"+emi);
        System.out.println("Duration :"+duration);
}
