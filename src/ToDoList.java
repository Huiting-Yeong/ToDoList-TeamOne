import java.util.ArrayList;

public class ToDoList {
	ArrayList<Item> itemList;
	
	public ToDoList(){
		itemList = new ArrayList<Item>();
	}
	
	public boolean addItem(Item itemOne){
		return itemList.add(itemOne);
	}
}