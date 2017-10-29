package babysitter;

public class Babysitter {
	
	CalculatePay calcPay = new CalculatePay();
	
	private int startTime;
	private int endTime;
	private int bedTime;
	
	public void setStartTime(int startTime) {
		
		this.startTime = startTime;
	}
	
	public int getStartTime() {
		
		return startTime;
	}
    
	public void setEndTime(int endTime) {
		
		this.endTime = endTime;
	}
	
	public int getEndTime() {
		
		return endTime;
	}
	
	public void setBedTime(int bedTime) {
		
		this.bedTime = bedTime;
	}

	public int getBedTime() {
		
		return bedTime;
	}
	
	public int getHoursFromStartTimeToBedTime() {
		
		return calcPay.hoursTo24Clock(getBedTime()) - getStartTime();
	}
	
	public int getHoursFromBedtimeToMidnight() {
		
		 return 24 - getBedTime();
	}
	
	public int getHoursFromBedTimeToEndTime() {
		
		return calcPay.hoursTo24Clock(getEndTime()) - calcPay.hoursTo24Clock(getBedTime());
	}
	
	
	

}
