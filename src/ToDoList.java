import java.util.ArrayList;

public class ToDoList{
	public ArrayList<Item> itemList;
	
	public ToDoList(){
		itemList = new ArrayList<Item>();
	}
	
	public boolean addItem(Item itemOne){
		return itemList.add(itemOne);
	}
	
	public boolean removeItem(Item itemOne){
		return itemList.remove(itemOne);
	}
	
	public Item removeItemByIndex(int ind){
		return itemList.remove(ind);
	}
	
	public boolean isEmpty(){
		return itemList.isEmpty();
	}
	
	public int size(){
		return itemList.size();
	}
}