import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseAddItem {
	private ToDoList testList = new ToDoList();
	
	@Test
	public void testAddNewItem()
	{
		bool isAdded = testList.addItem("Buy fruits");
		assertEquals(true, isAdded);
	}
	
	@Test
	public void testAddExistingItem()
	{
		bool isAdded = testList.addItem("Buy fruits");
		assertEquals(false, isAdded);
	}
	
	@Test
	public void testAddEmptyItem()
	{
		bool isAdded = testList.addItem("");
		assertEquals(true, isAdded);
	}
}
