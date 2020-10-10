package days32;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Vector;

public class Prob {
	String line = "";
	String[] v = new String[5];
	Vector<Score> vv = new Vector<Score>();
	LinkedList lk = new LinkedList();
	public LinkedList getScore(String fileName) throws Exception, FileNotFoundException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
		Score sc = new Score();
		while(true) {
			line = bf.readLine();
			if(line == null) {
				break;
			}
			v = line.split("/");
			/*
			sc.setName(v[0]);
			sc.setKor(Integer.parseInt(v[1]));
			sc.setEng(Integer.parseInt(v[2]));
			sc.setMath(Integer.parseInt(v[3]));
			sc.setSum(Integer.parseInt(v[1])+Integer.parseInt(v[2])+Integer.parseInt(v[3]));
			*/
			int sum = Integer.parseInt(v[1])+Integer.parseInt(v[2])+Integer.parseInt(v[3]);
			sc = new Score(v[0],Integer.parseInt(v[1]),Integer.parseInt(v[2]),Integer.parseInt(v[3]),sum);
			//vv.addElement(sc);
			lk.add(sc);
		}
		bf.close();
		return lk;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int j = 0; /// Enhanced for문 쓰려고 만든 데이터
		Prob p2 = new Prob();
		LinkedList scores = p2.getScore("C:\\Users\\YOON\\eclipse-workspace\\practice\\JavaClass\\data.txt");
		
		for(int i = 0; i<scores.size();i++) {
			Score score = (Score)scores.get(i);
			System.out.println(score.getName()+" : "+score.getKor()+" "+score.getEng()+" "+score.getMath()+" "+score.getSum());
		}
		
		/*for(Object s : scores) { // 그냥 for문 쓰는게 더 나은 것 같다.
			Score score = (Score)scores.get(j);
			System.out.println(score.getName()+" : "+score.getKor()+" "+score.getEng()+" "+score.getMath()+" "+score.getSum());
			j++;
		}*/
	}

}
