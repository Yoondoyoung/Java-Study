package days29;

public class CellPhone {
	//Field
	private String phoneNumber = "";
	private int totalCallTime= 0;
	private int feePerCallTime = 0;
	private int totalFee = 0;
	

	public CellPhone() {
		// TODO Auto-generated constructor stub
	}
	

	public CellPhone(String number, int feePerCallTime) {
		super();
		this.phoneNumber = number;
		this.feePerCallTime = feePerCallTime;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setNumber(String number) {
		this.phoneNumber = number;
	}


	public int getTotalCallTime() {
		return totalCallTime;
	}


	public void setCallTime(int callTime) {
		this.totalCallTime = callTime;
	}


	public int getFeePerCallTime() {
		return feePerCallTime;
	}


	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}


	public int getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}

	
	//method
	public int calculateTotalFee() {
		totalFee = (feePerCallTime * totalCallTime);
		return totalFee;
	}
	
	public int call(String number, int callTime) {
		totalCallTime += callTime;
		System.out.println(number+"번호로 "+callTime+"분 통화함");
		return totalFee;
	}

}
