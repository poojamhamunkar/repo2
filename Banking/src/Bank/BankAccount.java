package Bank;

public class BankAccount extends Bank {
String accno;
String accholder;
public void accdetails(String accno,String accholder)
{
	this.accno= accno;
	this.accholder= accholder;
}

public void accdetails()
{
	System.out.println("Account number :"+accno);
	System.out.println("Account holder :"+accholder);
}

}
