package lab6;

public class BadTransactionException extends Exception {
	/**
	 * 
	 */
	public int transAmount;  // The invalid withdraw amount.

	  /**
	   *  Creates an exception object for bad withdraw amount.
	   **/
	  public BadTransactionException(int badTransAmount) {
	    super("Invalid withdraw amount: " + badTransAmount);
	    
	    transAmount = badTransAmount;
	    
	  }
}
