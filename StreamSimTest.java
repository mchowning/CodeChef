import static org.junit.Assert.*;

import org.junit.Test;


public class StreamSimTest {

	@Test
	public void ioTest() {
		StreamSim ss = new StreamSim();
		ss.initializeOutput();
		ss.addToOutput("2");
		ss.addToOutput("CODECHEF");
		ss.addToOutput("DRINKEATCODE");
		ss.closeOutput();
		assertEquals(ss.readOutput(), "2");
		assertEquals(ss.readOutput(), "CODECHEF");
		assertEquals(ss.readOutput(), "DRINKEATCODE");
	}

}
