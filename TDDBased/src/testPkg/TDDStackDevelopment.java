package testPkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tddBasedStack.StackDev;

class TDDStackDevelopment {
	
	StackDev stack = new StackDev();
	@Test
	void testStackIsEmpty() {
		assertTrue(stack.isEmpty());
	}
	@Test
	void testStackIsFull() {
		assertTrue(!stack.isFull());
	}
	@Test
	void testStackPush() {
		assertEquals(1, stack.push(1));
		assertEquals(2, stack.push(2));
		assertEquals(3, stack.push(3));
		assertEquals(-1, stack.push(4));
	}
	@Test
	void testStackPick() {
		assertEquals(1, stack.push(1));
		assertEquals(2, stack.push(2));
		assertEquals(3, stack.push(3));
		assertEquals(3, stack.peek());
	}
	@Test
	void testStackPop() {
		assertEquals(1, stack.push(1));
		assertEquals(2, stack.push(2));
		assertEquals(3, stack.push(3));
		assertEquals(3, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(1, stack.pop());
		assertEquals(-1, stack.pop());
	}
}
