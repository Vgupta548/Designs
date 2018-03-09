package GuitarApp.Test;

import GuitarApp.Models.Guitar;
import GuitarApp.Services.Inventory;

public class GuitarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory inventory = new Inventory();
		inventory.add("v001", "AKS", "GUI001", "ELECTRIC", "highStrngth", "loow", 2000.00);
		inventory.add("v002", "AKS", "GUI002", "non-ELECTRIC", "highStrngth", "loow", 1000.00);
		inventory.add("v003", "AKS", "GUI011", "ELECTRIC", "highStrngth", "loow", 2000.00);
		inventory.add("v004", "AKS", "GUI012", "nonELECTRIC", "highStrngth", "loow", 6000.00);
		
		Guitar searchGuitar = new Guitar(null, "AKS", "GUI002", "non-ELECTRIC", "highStrngth", "loow", null);
		Guitar guitar = inventory.search(searchGuitar);
		if(guitar != null){
			System.out.println("we found your guitar");
			System.out.println("your guitar is:-\n builderName: "+guitar.getBuilderName() + 
					" \n Model: "+guitar.getModel() + 
					" \n Type: "+guitar.getType() + 
					" \n BackWoodenType: "+guitar.getBackWoodenType() + 
					" \n FrontWoodenType: "+guitar.getFrontWoodenType() + 
					" \n Price: "+guitar.getPrice() );
		}else{
			System.out.println("Sorry! your guitar is not present");
		}
		
		searchGuitar = new Guitar(null, "AKS1", "GUI002", "non-ELECTRIC", "highStrngth", "loow", null);
		Guitar guitar1 = inventory.search(searchGuitar);
		if(guitar1 != null){
			System.out.println("we found your guitar");
			System.out.println("your guitar is:-\n builderName: "+guitar1.getBuilderName() + 
					" \n Model: "+guitar1.getModel() + 
					" \n Type: "+guitar1.getType() + 
					" \n BackWoodenType: "+guitar1.getBackWoodenType() + 
					" \n FrontWoodenType: "+guitar1.getFrontWoodenType() + 
					" \n Price: "+guitar1.getPrice() );
		}else{
			System.out.println("Sorry! your guitar is not present");
		}
		inventory.search(guitar1);
	}

}
