package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSquare {
	
	@Test
	public void testOpen() {
		Square s = new Square();
		s.open();
		boolean isOpen = s.getIsOpen();
		assertEquals(true, isOpen);
	}
	
	@Test
	public void testBomba() {
		Square s = new Square();
		s.setBomb();
		boolean isBomb = s.getIsBomb();
		assertEquals(true, isBomb);
		
	}
	
}
