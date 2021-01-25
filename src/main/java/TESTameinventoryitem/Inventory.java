package TESTameinventoryitem;

import java.util.*;

public class Inventory{
	public static void main(String[] args){ //main class
		ItemList il = new ItemList();
		Scanner kb = new Scanner(System.in);
		//int answer = 1,2,3,4;
                //////////
                
                  //public static void main(String [] args){
        
       // Scanner in = new Scanner(System.in);
        // Display the menu
        System.out.println("****MENUE****");
        System.out.println("1\t add");
        System.out.println("2\t update");
        System.out.println("3\t delete");
        System.out.println("4\t search");
        System.out.println("5\t quit");

        System.out.println("Please enter your choice:");
        
        //Get user's choice
        int choice=kb.nextInt();
         
        //Display the title of the chosen module
        switch (choice) {
            case 1:
                //add item
                il.addItem();
                System.out.println();
                break;
            case 2:
                //update item
                il.update();
                System.out.println();
                break;
            case 3:
                //delete item
                il.deleteItem();
                System.out.println();
                break; 
            // muss ich noch programmieren in ItemList
            //case 4:
                //search item
                //il.searchItem();
               // System.out.println();
               // break;
            case 5:
                System.out.println("Program closed");
                break;
            
            
            default: System.out.println("Invalid choice");
        }//end of switch
    }//end of the main method
}//end of class
                
               