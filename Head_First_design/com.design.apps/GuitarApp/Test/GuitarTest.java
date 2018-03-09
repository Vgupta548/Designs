package GuitarApp.Test;

import GuitarApp.Models.BackWoodenType;
import GuitarApp.Models.FrontWoodenType;
import GuitarApp.Models.Guitar;
import GuitarApp.Models.GuitarBuilder;
import GuitarApp.Models.GuitarType;
import GuitarApp.Services.Inventory;

public class GuitarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory inventory = new Inventory();
		inventory.add("v001", GuitarBuilder.BAILEY, "GUI001", GuitarType.Acoustic, BackWoodenType.ASDC, FrontWoodenType.ASEED, 2000.00);
		inventory.add("v001", GuitarBuilder.BAILEY, "GUI001", GuitarType.Archtop, BackWoodenType.ASSA, FrontWoodenType.GTDFS, 23000.00);
		inventory.add("v001", GuitarBuilder.DOOGMA, "GUI002", GuitarType.Bass, BackWoodenType.ASSA, FrontWoodenType.GTDFS, 1000.00);
		inventory.add("v001", GuitarBuilder.DOOGMA, "GUI033", GuitarType.Archtop, BackWoodenType.ASSA, FrontWoodenType.GTRFED, 22000.00);
		inventory.add("v001", GuitarBuilder.HALO, "GUI031", GuitarType.DoubleNeck, BackWoodenType.CDF, FrontWoodenType.CFRED, 8000.00);
		inventory.add("v001", GuitarBuilder.JACKSON, "GUI031", GuitarType.Archtop, BackWoodenType.CDF, FrontWoodenType.CFRED, 5000.00);
		
		Guitar searchGuitar = new Guitar(null, GuitarBuilder.BAILEY, "GUI001", GuitarType.Archtop, BackWoodenType.ASSA, FrontWoodenType.GTDFS, null);
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
		
		searchGuitar = new Guitar(null, GuitarBuilder.BAILEY, "GUI0012", GuitarType.Archtop, BackWoodenType.ASSA, FrontWoodenType.GTDFS, null);
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
