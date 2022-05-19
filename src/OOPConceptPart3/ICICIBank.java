package OOPConceptPart3;

public class ICICIBank implements USBank, RBI{
	
	//RBI Interface
	@Override
	public void carLoan() {
		System.out.println("icici -- car loan");
		
	}

	@Override
	public void educationLoan() {
		System.out.println("icici - edu loan");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("icici -- home loan");
		
	}
	
	//ICICIBank Interface

	@Override
	public void credit() {
		System.out.println("icici -- credit");
		
	}

	@Override
	public void debit() {
		System.out.println("icici -- debit");
		
	}

	@Override
	public void moneyTransfer() {
		System.out.println("icici -- money transfer");
		
	}

	@Override
	public void trading() {
		System.out.println("icici -- trading");
		
	}
	
	//ICICIBank class methods
	
	public void mutualFund() {
		System.out.println("icici -- mutual funds");
	}
	
	public void insurance() {
		System.out.println("icici -- isurance");
	}

}
