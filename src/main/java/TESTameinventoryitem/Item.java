package TESTameinventoryitem;

import java.util.Scanner;
//import java.util.ArrayList;
//import java.lang.String;

public class Item{
		String name;
                String notes;
                int year;
                int condition; // 1 = mint, 2 = good, 3 = not mint
                int loaned; // 1 = yes, 2 = no OR BOOLEAN???????
                int categorie; // 1 = console 2 = game?? or boolean???
    Scanner kb= new Scanner(System.in);
    //creating item using information input from ItemList
    
    public Item(String lname, String lnotes, int lyear, int lcondition, int lloaned, int lcategorie){
                name = lname;
                notes = lnotes;
                year = lyear;
                condition = lcondition;
                loaned = lloaned;
                categorie = lcategorie;
		
	}
    
                @Override
   public String toString(){ //what output looks like when you view list
		return name+ ", " +notes+ ", " +year+ ", " +condition+ ", " +loaned+ ", " +categorie+ "\n";
	}
	 
   public void setName(String lname){
       name = lname;
       //iteminfo.add(name) 
   }
    public String getName(){
        return name;
        
    }
    public int getYear() {
        return year;
    }

    public void setYear(int lyear) {
        this.year = lyear;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int lcondition) {
        this.condition = lcondition;
    }

    public int getLoaned() {
        return loaned;
    }

    public void setLoaned(int lloaned) {
        this.loaned = lloaned;
    }

    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int lcategorie) {
        this.categorie = lcategorie;
    }
} 













    //public Scanner getKb() {
        //return kb;
    //}

    //public void setKb(Scanner kb) {
       // this.kb = kb;
    //}

   
                

///////////                
		//int quantity;
		//double price;
		//int sold;
		//double profit;
		//String notes;
		//String location;
		//String type; // console or game??
	
	//Scanner kb= new Scanner(System.in);
		//creates item using information inputed from ItemList
	//public Item(String name, int quantity, double price, int isold, String inotes, String itype, String ilocation){
		//name = iname;
		//profit = calcProfit(isold, iquantity, iprice);
		//price = iprice;
		//sold = isold;
		//notes = inotes;
		//type = itype;
		//location = ilocation;
	//}
	
	
	//calculates profit
	//if user sells something, price = price sold for, sold = amount sold
	//if user buys something, price = -, sold = amount bought
	//if user gives something away for free, price = 0, sold = -(amount given away)
	//if user finds something, price = 0, sold = amount found
	/**public double calcProfit(int isold, int iquantity, double iprice){
		if (iprice < 0){
			profit = (iprice*isold);
			iquantity = (isold + iquantity);
			}
		else{
			if (iprice ==0){
				if (isold < 0){
					iquantity = (iquantity + isold);
				}
				else{
					iquantity = (quantity - isold);
				}
			}
			else{
				profit = (iprice*isold);
				iquantity = (iquantity-isold);
			}
		}
		return profit;
	}
}
*/ 