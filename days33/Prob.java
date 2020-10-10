package days33;

import java.util.Vector;
import java.util.zip.DataFormatException;

public class Prob {

	private static Book makeBook(String bookData) throws days33.DataFormatException {
		// ����
		String[] line = new String[bookData.length()]; // ��Ʈ����� ������ ���Ǽ���
		Book book = new Book();
		line = bookData.split(":"); // :�� �������� split�� line�� �����
		if (line.length == 3) { // ������ ���� üũ
			book.setTitle(line[0].trim());
			book.setKind(line[1].trim());
			book.setRentalPrice(Integer.parseInt(line[2].trim())); // int�� casting�� �� ���� ����
			return book;
		} else { // ������ ���� ���� �� ���� ������
			throw new days33.DataFormatException(line[0].trim()); // Book Title�� ����
		}

	}

	private static void printBookList(Vector bookList) {
		// ����
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}

	public static void main(String[] args) {

		Vector bookList = new Vector();

		try {
			bookList.add(makeBook("Java Programming ���� : ��ǻ�� : 35000"));
			bookList.add(makeBook("�ʺ��ڸ� ���� SQL : ��ǻ�� : 28000"));
			bookList.add(makeBook("HTML5 API �Ұ� : ��ǻ�� : 35000"));
			// Case1
			bookList.add(makeBook("JDBC Programming ���� : ��ǻ�� : 45000"));
			// Case2
			// bookList.add(makeBook("JDBC Programming ���� : ��ǻ��"));
			bookList.add(makeBook("JSP Programming ��� : ��ǻ�� :56000"));
			System.out.println("<< å ��� >>");
			printBookList(bookList);
		} catch (days33.DataFormatException e) { // ���� ��Ƽ� ó��
			System.out.println(e.getMessage());
			// e.printStackTrace(); // �̿��̸� ������. ���� ��� ���ϰ�
		}
	}
}
