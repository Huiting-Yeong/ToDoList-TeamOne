import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseRemoveItem {
	private ToDoList testList = new ToDoList();
	private Item item = new Item("Buy fruits");
	
	@Test
	public void testRemoveItem()
	{
		//// Assume list has items
		testList.addItem(item);
		
		//// Remove an item
		Boolean isremoved = testList.removeItem(item);
		assertEquals(true, isremoved);
	}
	
	@Test
	public void testRemoveExistingItem()
	{
		Boolean isremoved = testList.removeItem(item);
		assertEquals(false, isremoved);
	}
	
	@Test
	public void testRemoveEmptyItem()
	{
		Boolean isremoved = testList.removeItem(new Item(""));
		assertEquals(false, isremoved);
	}
}
