package days31;

public class AfterThreadRunnable implements Runnable {
	
	private String name;

	public AfterThreadRunnable() {
	}
	public AfterThreadRunnable(String name){
		this.name = name;
	}

	@Override
	public void run() {
		for(int i = 0; i<100; i++){
			System.out.println(name+" : "+i);
			
			/* 
				sleep() ==> API check
				try{
					Thread.sleep(100); // sleep() ==> 임시실행중지, 밀리초 단위
				}catch(InterrupetedException e){
					System.out.println(e);
		}
		*/
		}

	}

	public static void main(String[] args) {
		System.out.println("여기는 main start...");
		AfterThreadRunnable bt1 = new AfterThreadRunnable("1번째");
		AfterThreadRunnable bt2 = new AfterThreadRunnable("2번째");

		//Thread 생성자 확인
		Thread t1 = new Thread(bt1);
		Thread t2 = new Thread(bt2);

		t1.start();
		t2.start();
		System.out.println("여기는 end..");

	}

}
