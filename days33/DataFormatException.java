package days33;

public class DataFormatException extends RuntimeException {
	String s = "";

	public DataFormatException() {
		// TODO Auto-generated constructor stub
	}

	public DataFormatException(String message) {
		s = message;
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		String warn = (s + "å ������ ��ȯ�� �� ���� ������ �����Դϴ�.");
		return warn;

	}

}
