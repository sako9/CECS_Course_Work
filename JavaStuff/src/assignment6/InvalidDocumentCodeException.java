package assignment6;

public class InvalidDocumentCodeException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidDocumentCodeException()
	{
	}
	    public String getMessage()
	    {
	        return "Document code must be U (Unclassified), C (Confidential),     or P (Proptietary)." +
	"\n\tDocument will default to Unclassified.";
	    }
}
