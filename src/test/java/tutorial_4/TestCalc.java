package tutorial_4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestCalc {
	@Test
	public void addTest() {
		assertTrue((new Calc().add(10,5)) == 15);
	}
	
	@Test
	public void subtractTest() {
		assertTrue((new Calc().subtract(10,5)) == 5);
	}
}