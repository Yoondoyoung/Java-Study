package practice;

public class MyException extends RuntimeException {
	String error = "";

	public MyException() {
		// TODO Auto-generated constructor stub
	}

	public MyException(String arg0) {
		error = arg0;
		// TODO Auto-generated constructor stub
	}

	public MyException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	
	public String getMessage() {
		return error;
	}

}
