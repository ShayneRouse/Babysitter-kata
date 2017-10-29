package babysitter;

public class Babysitter {
	
	
	
	private int startTime;
	private int endTime;
	private int bedTime;
	
	public Babysitter () {}
	
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
	
	public int hoursTo24Clock(int hoursTo24Clock) {
		
		if(hoursTo24Clock >= 0 && hoursTo24Clock <=4) {
			
			hoursTo24Clock += 24;
		}
		    return hoursTo24Clock;
	}
	
	public int getHoursFromStartTimeToBedTime() {
		
		return hoursTo24Clock(getBedTime()) - getStartTime();
	}
	
	public int getHoursFromBedtimeToMidnight() {
		
		 return 24 - getBedTime();
	}
	
	public int getHoursFromBedTimeToEndTime() {
		
		return hoursTo24Clock(getEndTime()) - hoursTo24Clock(getBedTime());
	}
	
    public int payAmount( ) {
    	
        return (getHoursFromStartTimeToBedTime()*12) + 
       		(getHoursFromBedtimeToMidnight()*8) + 
       		(getHoursFromBedTimeToEndTime()*16);
       
       
   }
		

}





