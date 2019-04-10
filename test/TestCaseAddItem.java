import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseAddItem {
	private ToDoList testList = new ToDoList();
	private Item item = new Item("Buy fruits");
	
	
	@Test
	public void testAddNewItem()
	{
		Boolean isAdded = testList.addItem(item);
		assertEquals(true, isAdded);
	}
	
	@Test
	public void testAddExistingItem()
	{
		testList.addItem(item);
		Boolean isAdded = testList.addItem(item);
		assertEquals(false, isAdded);
	}
	
	@Test
	public void testAddEmptyItem()
	{
		Boolean isAdded = testList.addItem(new Item(""));
		assertEquals(false, isAdded);
	}
}
