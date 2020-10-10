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
		String warn = (s + "책 정보는 변환할 수 없는 데이터 포맷입니다.");
		return warn;

	}

}
