class  ArrayPractice
{
	public static void main(String[] args) 
	{
		String [][] text = new String[9][9];

		for(int i = 1; i<text.length; i++){
				System.out.println(i+"���� ����մϴ�.");

				for(int j = 1; j<text[i].length; j++){
					text[i][j] = (i+"*"+j+"="i*j);
				}

				System.out.println(i + "x" +j+" = "+ text[i][j]);

				if(j==9){
					System.out.println("\n");
				}
				
		}
		
		}
	}
}
