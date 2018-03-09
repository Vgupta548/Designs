package GuitarApp.Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import GuitarApp.Models.BackWoodenType;
import GuitarApp.Models.FrontWoodenType;
import GuitarApp.Models.Guitar;
import GuitarApp.Models.GuitarBuilder;
import GuitarApp.Models.GuitarType;

/**
 * @author vgup92
 *
 */
public class Inventory {
	
	List<Guitar> inventory = new ArrayList<Guitar>();
	
	/**
	 * This method is used to add guitar in inventory
	 * @param serialNumber
	 * @param builderName
	 * @param model
	 * @param type
	 * @param backWoodenType
	 * @param frontWoodenType
	 * @param price
	 */
	public void add(String serialNumber, GuitarBuilder builderName, String model,
			GuitarType type, BackWoodenType backWoodenType,
			FrontWoodenType frontWoodenType, Double price ){
		Guitar guitar = new Guitar(serialNumber, builderName, model, type, backWoodenType, frontWoodenType, price);
		inventory.add(guitar);
	};
	
	
	/**
	 * This method is used to search for a guitar
	 * @param guitar
	 * @return
	 */
	public Guitar search(Guitar guitar){ 
		Iterator<Guitar> it = inventory.iterator();
		while(it.hasNext()){
			Guitar inventoryGuitar = it.next();
			if(guitar != null){
				String model = guitar.getModel();
				if(model == null || model == "" || !model.toLowerCase().equals(inventoryGuitar.getModel().toLowerCase()))
					continue;
				
				GuitarBuilder builderName = guitar.getBuilderName();
				if(builderName == null ||  builderName != inventoryGuitar.getBuilderName())
					continue;
				
				GuitarType type = guitar.getType();
				if(type == null || type != inventoryGuitar.getType())
					continue;
				
				BackWoodenType backWoodenType = guitar.getBackWoodenType();
				if(backWoodenType == null || backWoodenType != inventoryGuitar.getBackWoodenType())
					continue;
				
				FrontWoodenType frontWoodenType = guitar.getFrontWoodenType();
				if(frontWoodenType == null || frontWoodenType != inventoryGuitar.getFrontWoodenType())
					continue;
				return inventoryGuitar;
			}
		}
		return null;
	};
	
	

}
