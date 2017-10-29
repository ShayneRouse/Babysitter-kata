package babysitter;

public class Babysitter {
	
	private int startTime;
	private int endTime = 4;
	private int bedTime = 10;
	
	public void setStartTime(int startTime) {
		
		this.startTime = startTime;
	}
	public int getStartTime() {
		
		return startTime;
	}

	public int getEndTime() {
		
		return endTime;
	}

	public int getBedTime() {
		
		return bedTime;
	}

}
