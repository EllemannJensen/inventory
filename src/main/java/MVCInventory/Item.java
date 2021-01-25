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

///it is the MODEL //////////////////

public class Item {
   private String name;
   private String note;
   private int year;
   private int condition;
   private boolean loaned;
   private boolean categorie;

    public Item(String name, String note, int year, int condition, boolean loaned, boolean categorie) {
        this.name = name;
        this.note = note;
        this.year = year;
        this.condition = condition;
        this.loaned = loaned;
        this.categorie = categorie;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public boolean isLoaned() {
        return loaned;
    }

    public void setLoaned(boolean loaned) {
        this.loaned = loaned;
    }

    public boolean isCategorie() {
        return categorie;
    }

    public void setCategorie(boolean categorie) {
        this.categorie = categorie;
    }

}

   