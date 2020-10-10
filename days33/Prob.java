package days33;

import java.util.Vector;
import java.util.zip.DataFormatException;

public class Prob {

	private static Book makeBook(String bookData) throws days33.DataFormatException {
		// 구현
		String[] line = new String[bookData.length()]; // 스트링어레이 사이즈 임의설정
		Book book = new Book();
		line = bookData.split(":"); // :를 기준으로 split해 line에 담아줌
		if (line.length == 3) { // 데이터 포맷 체크
			book.setTitle(line[0].trim());
			book.setKind(line[1].trim());
			book.setRentalPrice(Integer.parseInt(line[2].trim())); // int로 casting한 후 여백 제거
			return book;
		} else { // 데이터 포맷 부합 시 예외 던지기
			throw new days33.DataFormatException(line[0].trim()); // Book Title만 제공
		}

	}

	private static void printBookList(Vector bookList) {
		// 구현
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}

	public static void main(String[] args) {

		Vector bookList = new Vector();

		try {
			bookList.add(makeBook("Java Programming 기초 : 컴퓨터 : 35000"));
			bookList.add(makeBook("초보자를 위한 SQL : 컴퓨터 : 28000"));
			bookList.add(makeBook("HTML5 API 소개 : 컴퓨터 : 35000"));
			// Case1
			bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터 : 45000"));
			// Case2
			// bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터"));
			bookList.add(makeBook("JSP Programming 고급 : 컴퓨터 :56000"));
			System.out.println("<< 책 목록 >>");
			printBookList(bookList);
		} catch (days33.DataFormatException e) { // 예외 잡아서 처리
			System.out.println(e.getMessage());
			// e.printStackTrace(); // 이왕이면 써주자. 에러 잡기 편하게
		}
	}
}
