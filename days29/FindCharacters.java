package days29;

public class FindCharacters
{

	//method
	public int countChar(String str, char c){
		//����
		int sum = 0; // c�� ������ ���� �ʵ�
		char[] ca = new char[str.length()]; // char[] ca�� str�� �ϳ��� char�� ��ȯ �� �ִ´�.
		for(int i = 0; i<str.length(); i++){ //ca�� ����ִ� str�� �ϳ��� c�� ��
			ca[i] = str.charAt(i);
			//System.out.println(ca[i]);
			if(ca[i] == c){
				sum++;	//c�� ���� �ܾ� Ȯ�� �� sum�� 1 ����
			}
		}
		return sum;	
	}
	
	public static void main(String[] args){
		FindCharacters fc = new FindCharacters();
		int count = fc.countChar("Boys, be ambitious",'b');
		System.out.println(count);
	}
}