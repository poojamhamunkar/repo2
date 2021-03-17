package Bank;

public class User {
	public static void main(String[]args)
	{
		BankAccount a1=new Saving();
		BankAccount a2=new Current();
		BankAccount a3=new Loan();
		BankAccount a4=new Personal();
		Loan b1=new Education();
		Loan b2=new Gold();
		Loan b3 =new home();
		Loan b4=new PersonalLoan();
		Loan b5=new vehical();
		Vehical c1=new Car();
		Vehical c2=new Bike();
		Vehical c3=new Auto();
		Education d1=new Lower();
		Education d2=new Higher();
		d2.accdetails("12345678910","Pooja",10000,500,"3years");
		
		
		
		
	}

}
