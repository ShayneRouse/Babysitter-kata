package babysitter;

public class CalculatePay {
	
	Babysitter sitterTime = new Babysitter();
   
    public CalculatePay() {
    	
    }
    
	public int hoursTo24Clock(int hoursTo24Clock) {
		
		if(hoursTo24Clock >= 0 && hoursTo24Clock <=4) {
			
			hoursTo24Clock += 24;
		}
		    return hoursTo24Clock;
	}
	
	
    public int payAmount( ) {
    	
         return (sitterTime.getHoursFromStartTimeToBedTime()*12) + 
        		(sitterTime.getHoursFromBedtimeToMidnight()*8) + 
        		(sitterTime.getHoursFromBedTimeToEndTime()*16);
        
        
    }




}