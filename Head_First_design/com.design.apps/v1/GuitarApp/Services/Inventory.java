package v1.GuitarApp.Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import v1.GuitarApp.Models.Guitar;

public class Inventory {
	
	List<Guitar> inventory = new ArrayList<Guitar>();
	
	void add(String serialNumber,String builderName,String model,String type,String backWoodenType,String frontWoodenType,Double price ){
		Guitar guitar = new Guitar(serialNumber, builderName, model, type, backWoodenType, frontWoodenType, price);
		inventory.add(guitar);
	};
	
	Guitar search(Guitar guitar){ 
		Iterator<Guitar> it = inventory.iterator();
		while(it.hasNext()){
			Guitar inventoryGuitar = it.next();
			if(guitar != null){
				String model = guitar.getModel();
				if(model == null && model == "" || model.toLowerCase() != inventoryGuitar.getModel().toLowerCase())
					continue;
				
				String builderName = guitar.getBuilderName();
				if(builderName == null && builderName == "" || builderName.toLowerCase() != inventoryGuitar.getModel().toLowerCase())
					continue;
				
				String type = guitar.getType();
				if(type == null && type == "" || type.toLowerCase() != inventoryGuitar.getModel().toLowerCase())
					continue;
				
				String backWoodenType = guitar.getBackWoodenType();
				if(backWoodenType == null && backWoodenType == "" || backWoodenType.toLowerCase() != inventoryGuitar.getModel().toLowerCase())
					continue;
				
				String frontWoodenType = guitar.getFrontWoodenType();
				if(frontWoodenType == null && frontWoodenType == "" || frontWoodenType.toLowerCase() != inventoryGuitar.getModel().toLowerCase())
					continue;
				return inventoryGuitar;
			}
		}
		return null;
	};
	
	

}
