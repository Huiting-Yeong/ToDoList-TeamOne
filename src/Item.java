public class Item {
	String desc;
	boolean done;

	public Item(String itemOneDesc){
		desc = itemOneDesc;
		done = false;
	}
	
	public void toggleStatus(){
		done = !done;
	}
	
}