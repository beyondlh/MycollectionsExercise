package customer;

public class NegativeBalanceException extends Exception {

	private static final long serialVersionUID = 6278880227654651432L;
	private static String message = "balance cannot be less than 0";
	
	public NegativeBalanceException() {
		super(message);
	}
	
}
