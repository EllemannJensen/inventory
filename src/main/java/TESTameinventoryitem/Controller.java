/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TESTameinventoryitem;

/**
 *
 * @author elisabethwolff
 */
interface Item { //model = Item = consols and games
    public void setName(String name);
}

interface View { // view = view = change to the interfacesclassname where you can edit the games/ consols
    public String prompt(String prompt);
}

class Controller { //where all the logik is the gameController

    private final Item item;
    private final View view;

    public Controller(Item item, View view) {
        this.item = item;
        this.view = view;
    }

    public void run() {
        String name;

        while ((name = view.prompt("\nInventory> ")) != null) {
            item.setName(name);
        }
    }
}


//Main is just for adding everything together