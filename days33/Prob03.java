package days33;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Random;

public class Prob03 {

	private static int[] generateRandomNumber() {
		// 10�� �ߺ� �ȵǴ� ���� ������ �迭�� ���� �� ����
		Random r = new Random();
		int[] ar = new int[10];
		for (int i = 0; i < 10; i++) {
			ar[i] = r.nextInt(100);
			for (int j = 0; j < i; j++) {
				if (ar[i] == ar[j]) { // ���ڰ� �ߺ��Ǹ� �ٽ� ������.
					i--;
				}
			}
		}
		return ar;
	}

	public static void printStatistics(int[] array) throws Exception {
		// 10���� ���� �迭�� �Ű������� �߻��� ������ ��������� store.txt�� ����
		double average = 0;
		int sum = 0;
		BufferedWriter bw = new BufferedWriter(new FileWriter("store.txt"));
		for (int i = 0; i < array.length; i++) {
			// System.out.println(array[i]);
			sum += array[i];
			bw.write(Integer.toString(array[i])); // ���� 10�� write
			bw.newLine(); // Enter
		}
		// System.out.println("sum : "+sum); // Ȯ�ο�
		// System.out.println("���� : "+array.length); // Ȯ�ο�
		average = ((double) sum / array.length);
		Arrays.sort(array); // ���������� ����
		// System.out.println(average);
		bw.write("�ִ� �� : " + Integer.toString(array[array.length - 1])); // �� ���� ���� ū ����
		bw.newLine();
		bw.write("�ּ� �� : " + Integer.toString(array[0])); // �� ���� ���� ���� ����
		bw.newLine();
		bw.write("��հ� : " + (average)); // double�� �׳� ��µȴ�.
		bw.close(); // �ݾ��ֱ�
	}

	public static void main(String[] args) throws Exception {
		int[] array = generateRandomNumber();
		printStatistics(array);
	}

}
