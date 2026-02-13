package test.CICD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalciTest {
	@Test
	void addTest() {
		Calci obj = new Calci();
		assertEquals(10, obj.add(8, 2));
	}
	
	@Test
	void multliplyTest() {
		Calci obj = new Calci();
		assertEquals(15, obj.multiply(3, 5));
	}
}
