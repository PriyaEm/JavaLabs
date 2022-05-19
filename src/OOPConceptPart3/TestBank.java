package OOPConceptPart3;

public class TestBank {

	public static void main(String[] args) {
		
		ICICIBank ic = new ICICIBank();
		
		ic.carLoan();
		ic.educationLoan();
		ic.homeLoan();
		
		ic.credit();
		ic.debit();
		ic.moneyTransfer();
		ic.trading();
		
		ic.mutualFund();
		ic.insurance();
		
		System.out.println(USBank.min_bal);  //calling by interface name
		
		

	}

}
