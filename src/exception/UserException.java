package exception;

public class UserException extends Exception {

	/**
	 * Custom Exception for Invalid Inputs
	 */
	private static final long serialVersionUID = 1L;

	public UserException(String msg) {
		super(msg);
	}

}
