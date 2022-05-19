package OOPConceptPart3;

public interface USBank {
	
	// BY default variables are static in nature---no need to mentiona static keyword
	 
	int min_bal = 100;
	
	//only method declaration
	
	public void credit();
	
	public void debit();
	
	public void moneyTransfer();

	public void trading();
}
