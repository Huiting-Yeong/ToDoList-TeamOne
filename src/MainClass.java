import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	static ToDoList myList ;
	
	public static void main(String[] args){
		boolean exit = false;
		myList = new ToDoList();
		do {			
			showMenu();
			int input = readInput();
			if (input == 9) exit=true;
		} while (!exit);
	}
	
	public static void showMenu(){
		System.out.println("Welcome to To Do List Application");
		showCurrentList();
		System.out.println("Menu: ");
		System.out.println("1. List all to do list");
		System.out.println("2. Add new item");
		System.out.println("3. Delete an item");
		System.out.println("4. Mark an item as complete");
		System.out.println("9. Quit");
		System.out.print("Enter your choice: ");
	}
	
	public static String addUserItem(){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Item inputItem = new Item(input);
		myList.addItem(inputItem);
		return input;
	}
	
	public static int removeUserItem(){
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if (!myList.isEmpty() && (input-1 <= myList.size())) myList.removeItemByIndex(input-1);
		return input;
	}
	
	public static int toggleItem(){
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		Item toToggle = myList.itemList.get(input-1);
		toToggle.toggleStatus();
		return input;
	}
	
	public static int readInput(){
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();	
		
		switch(input){
		case 1:
			System.out.println("1");
			break;
			
		case 2:
			System.out.println("2");
			System.out.println("Task to be added:");
			addUserItem();
			break;
			
		case 3:
			System.out.println("3");
			System.out.println("Enter the item number you want to remove. ");
			removeUserItem();
			System.out.print("Current size is now:" + myList.size());
			break;
			
		case 4:
			System.out.println("4");
			System.out.println("Enter the item number that you want to toggle.");
			toggleItem();
			break;
			
		case 9:

			break;
		default:
			System.out.println("Invalid choice");
		}
		
		
		return input;
	}
	
	public static void showCurrentList(){
		int count = 0;
		for (Item s : myList.itemList){
			count++;
			if (s.done){
				System.out.println(count + ".  "+ "X  " + s.desc);
			}
			else {
				System.out.println(count + ".  "+ "O  " + s.desc);
			}
			
		}
		
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("Fix bug no 1");
//		list.add("Fix bug no 2");
//		list.add("Fix bug no 3");
//		
//		for (String s : list){
//			System.out.println(s);
//		}
		
	}
}