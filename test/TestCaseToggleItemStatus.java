import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseToggleItemStatus {
	private ToDoList testList = new ToDoList();
	private Item item = new Item("Buy fruits");
	
	@Test
	public void testToggleItemStatus()
	{
		//// Assume list has items
		testList.addItem(item);
		
//		//// toggle an item
//		Boolean isToggled = testList.toggleItemStatus(item);
//		assertEquals(true, isToggled);
	}
}
