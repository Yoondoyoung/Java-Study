package days33;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Random;

public class Prob03 {

	private static int[] generateRandomNumber() {
		// 10개 중복 안되는 난수 생성해 배열에 저장 후 리턴
		Random r = new Random();
		int[] ar = new int[10];
		for (int i = 0; i < 10; i++) {
			ar[i] = r.nextInt(100);
			for (int j = 0; j < i; j++) {
				if (ar[i] == ar[j]) { // 숫자가 중복되면 다시 돌린다.
					i--;
				}
			}
		}
		return ar;
	}

	public static void printStatistics(int[] array) throws Exception {
		// 10개의 난수 배열을 매개변수로 발생된 난수와 통계정보를 store.txt에 저장
		double average = 0;
		int sum = 0;
		BufferedWriter bw = new BufferedWriter(new FileWriter("store.txt"));
		for (int i = 0; i < array.length; i++) {
			// System.out.println(array[i]);
			sum += array[i];
			bw.write(Integer.toString(array[i])); // 먼저 10개 write
			bw.newLine(); // Enter
		}
		// System.out.println("sum : "+sum); // 확인용
		// System.out.println("길이 : "+array.length); // 확인용
		average = ((double) sum / array.length);
		Arrays.sort(array); // 작은순으로 나열
		// System.out.println(average);
		bw.write("최대 값 : " + Integer.toString(array[array.length - 1])); // 맨 끝이 가장 큰 숫자
		bw.newLine();
		bw.write("최소 값 : " + Integer.toString(array[0])); // 맨 앞이 가장 작은 숫자
		bw.newLine();
		bw.write("평균값 : " + (average)); // double은 그냥 출력된다.
		bw.close(); // 닫아주기
	}

	public static void main(String[] args) throws Exception {
		int[] array = generateRandomNumber();
		printStatistics(array);
	}

}
