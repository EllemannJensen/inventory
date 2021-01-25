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

// it is the controller

public class ItemController   {
    
    
    ////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////
    private Item model;
   private ItemView view;
   public ItemController(Item model, ItemView view){
      this.model = model;
      this.view = view;
      
      
   }
   ///////////////////
   
   public void setItemName(String name){
      model.setName(name);
   }
   public String getItemName(){
      return model.getName();
   }
   public void setItemNote(String note){
      model.setNote(note);
   }
   public String getItemNote(){
      return model.getNote();
   }
   
   ////und so weiter.....
   
   
   // TODO name = is fest und nicht veränderbar
   
   
   // updates the Item
   public void updateView(){
      view.printStudentDetails(model.getName(), model.getNote());
   }
    //// und so weiter ist das richtig???
}
