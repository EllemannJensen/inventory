package TESTameinventoryitem;

import java.util.Scanner;
import java.util.ArrayList;


public class ItemList extends ArrayList<Item>{        //Array
    ArrayList<Item> Output = new ArrayList<>();
    Scanner kb= new Scanner(System.in);
    //String sort;
    
    
    
    public void addItem(){ //creates new item and adds to array
       
        String lname;
        String lnotes;
        int lyear;
        int lcondition;
        int lloaned;
        int lcategorie;

        System.out.println("Enter name:");
        lname = kb.nextLine();
        System.out.println();
        
        System.out.println("Enter notes:");
        lnotes = kb.nextLine();
        System.out.println();
        
        System.out.println("Enter year: format:2012");
        lyear = Integer.parseInt(kb.nextLine());
        System.out.println();

        System.out.println("Enter condition: 1 = g 2=m 3=s");
        lcondition = Integer.parseInt(kb.nextLine());
        System.out.println();
        
        System.out.println("Enter loaned: y = 1 no = 2");
        lloaned = Integer.parseInt(kb.nextLine());
        System.out.println();
        
        System.out.println("Enter categorie: game = 1 consloe = 2");
        lcategorie = Integer.parseInt(kb.nextLine());
        System.out.println();
      
        Item i = new Item(lname, lnotes, lyear, lcondition, lloaned, lcategorie);
        add(i);
        Output.add(i);
    }
/// TODO display the added Item when added... on the screen
    
    public void deleteItem (){  //delete an item from the arraylist
        System.out.println("Type name to delete.");
        String deleteName = kb.nextLine();
        int input = indexOf(deleteName);
        remove(input);
        System.out.println("Item removed");
    }

    public void update(){ //user inputs for notes year condition loaned for a certain item, updates both variables
        System.out.println("Which item would you like to update?");
        String name = kb.nextLine();
        int input = indexOf(name);
       
    }
}
        //get(i) Imput und i??? above
        
//SEARCH OPTION!!!!!
// Check if an ArrayList contains a given element
        //System.out.println("Does names array contain \"Item\"? : " + Item.contains("Item"));
 
///aber muss es ja uch noch irgendwo sichern???

//////HIER HIER////////

        /**System.out.println("Please enter the updated notes:");
        lnotes = kb.nextLine();
        set(input, lnotes);
        System.out.println();
         

        System.out.println("Please enter the updated year:(like 2018)");
        lyear = kb.nextInt();
        System.out.println();
        
        System.out.println("Please enter the updated condition 1 = topp, 2 = good, 3 = bad:");
        lcondition = kb.nextInt();
        System.out.println();
        
        System.out.println("Please enter if it is loaned 1 = yes, 2 = no:");
        lloaned = kb.nextInt();
        System.out.println();
        
    }
}

*/
        
        //////////////HIER HIER
// todo: ausnahmen programmieren wenn falsche eingabe dann invalide und try again...Integer.parseInt.... if then exception
























    
        /**public void search(){//search the list 
        String find(String word) {
    word = in.next();
    for (OurExtendedWord extWord : list) {
        if (word.equals(extWord.getWord())){
            return extWord.getWord();
        }

    }
    return null;
}

    }*/


   /** public void sortBy(){ //sort the items in list
        System.out.println("How would you like to sort it? (----)");
        char g = 'g';
        g = kb.nextLine().toLowerCase().charAt(0);	

        if (g == 'l'){ //sort location by alphabetical order
            ArrayList<Item> temp = new ArrayList<Item>();
            while(size()>0){
                int currentIndex= 0;
                String first = get(0).getName();
                for(int i =0; i < size(); i++){
                    if (get(i).getName().compareTo(first)<0){
                        currentIndex = i;
                        temp.add(get(i));
                        remove(i);
                    }	
                }		
            }
            addAll(temp);
        }

        else if (g == 'p'){ //sort price lowest to highest
            ArrayList<Item> temp = new ArrayList<Item>();
            while(size()>0){
                int currentIndex= 0;
                double lowestPrice = get(0).getPrice();
                for(int i =0; i < size(); i++){
                    if (get(i).getPrice() <lowestPrice){
                        currentIndex = i;
                        temp.add(get(i));
                        remove(i);
                    }	
                }		
            }
            addAll(temp);
        }

	
        else if (g == 't'){ //sort type by alphabetical order
            ArrayList<Item> temp = new ArrayList<Item>();
            while(size()>0){
                int currentIndex= 0;
                String first = get(0).getName();
                for(int i =0; i < size(); i++){
                    if (get(i).getName().compareTo(first)<0){
                        currentIndex = i;
                        temp.add(get(i));
                        remove(i);
                    }	
                }		
            }
            addAll(temp);
        }
    }

}
*/

   /**public void search(){ 
    System.out.println("Enter Items name:");
    String lname = in.next();
    boolean found = false;
    String[] foundArray;
for(String[] staffArray: staffArrayString){
     for(String str : staffArray){
          if(str.equals(staffName)){
           foundArray = staffArray;
           found = true;
           break;
          }
     }  
}
if (found == true) {
    System.out.print(foundArray + " ");
} 
*/