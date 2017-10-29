package babysitter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BabysitterTest {
    
	Babysitter testSitter = new Babysitter();
	
	@Test
	public void shouldReturnStartTime() {
		assertEquals(17, testSitter.getStartTime());
	}
	
	@Test
	public void shouldReturnEndTime() {
		assertEquals(4, testSitter.getEndTime());
	}
	
	@Test
	public void shouldReturnBedTime() {
		assertEquals(10, testSitter.getBedTime());
	}

}
