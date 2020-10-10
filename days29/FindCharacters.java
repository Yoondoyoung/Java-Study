package days29;

public class FindCharacters
{

	//method
	public int countChar(String str, char c){
		//구현
		int sum = 0; // c의 갯수를 받을 필드
		char[] ca = new char[str.length()]; // char[] ca에 str을 하나씩 char로 변환 후 넣는다.
		for(int i = 0; i<str.length(); i++){ //ca에 들어있는 str을 하나씩 c와 비교
			ca[i] = str.charAt(i);
			//System.out.println(ca[i]);
			if(ca[i] == c){
				sum++;	//c와 같은 단어 확인 시 sum값 1 증가
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