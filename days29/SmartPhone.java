package days29;

public class SmartPhone extends CellPhone {
	//Field
	private boolean isMonthlyFixedRate = false;
	private int monthlyFixedFee = 0;

	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
	public SmartPhone(String number, int feePerCallTime) {
		super(number, feePerCallTime);
	}
	public SmartPhone(String number, int feePerCallTime, boolean isMonthlyFixedRate, int monthlyFixedFee) {
		super(number, feePerCallTime);
		this.isMonthlyFixedRate = isMonthlyFixedRate;
		this.monthlyFixedFee = monthlyFixedFee;
	}
	public int calculateTotalFee() {
		if(isMonthlyFixedRate == false) {
			super.setTotalFee(super.getTotalCallTime()*super.getFeePerCallTime());
			return super.getTotalFee();
		}else {
			System.out.println("고객님은"+monthlyFixedFee+" 정액요금제입니다.");
			super.setTotalFee(this.monthlyFixedFee);
			return super.getTotalFee();
		}
	}
	

}
