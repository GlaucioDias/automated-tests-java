package br.com.erudio.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ListTest {
	
	
	@Test
	void testMockingList_When_SizeIsCalled_ShouldReturn10() {
		List<?> list = mock(List.class);
		
		when(list.size()).thenReturn(10);
		
		assertEquals(10,  list.size());
		assertEquals(10,  list.size());
		assertEquals(10,  list.size());
	}
	@Test
	void testMockingList_When_SizeIsCalled_ShouldReturnMultipleValues() {
		List<?> list = mock(List.class);
		
		when(list.size()).thenReturn(10).thenReturn(20);
		
		assertEquals(10,  list.size());
		assertEquals(20,  list.size());
		assertEquals(20,  list.size());
	}
	@Test
	void testMockingList_When_SizeIsCalled_ShouldReturnErudio() {
		var list = mock(List.class);
		
		when(list.get(0)).thenReturn("Erudio");
		
		assertEquals("Erudio",  list.get(0));
		assertNull(list.get(1));
	}
	@Test
	void testMockingList_When_GetIsCalledWithArgumentMatchers_ShouldReturnErudio() {
		var list = mock(List.class);
		
		// If you are using argument matchers, all arguments
		// have to be provided by matchers.
		when(list.get(anyInt())).thenReturn("Erudio");
		
		assertEquals("Erudio",  list.get(anyInt()));
		assertEquals("Erudio",  list.get(anyInt()));

	}
}
