/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCInventory;

/**
 *
 * @author elisabethwolff
 */
public class MCVMainClass {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
      //fetch Item record based on his name from the database
      Item model  = retriveItem(); /// 
      //Create a view : to write Item details on console
      ItemView view = new ItemView();
      ItemController controller = new ItemController(model, view);
      controller.updateView();
      //update model data
      controller.setItemName("Zelda");
      controller.updateView();
    
    }
     private static Item retriveItem(){
      Name name = new Name();
      name.setName("TEST");
      Item.setNote("good one");
      return note;
    
    
}
