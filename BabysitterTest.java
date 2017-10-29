package babysitter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BabysitterTest {
    
	Babysitter testSitter = new Babysitter();
	@Test
	public void shouldReturnStartTime() {
		assertEquals(17, testSitter.getStartTime());
	}

}
