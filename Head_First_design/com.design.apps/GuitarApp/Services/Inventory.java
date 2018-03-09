package GuitarApp.Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import GuitarApp.Models.Guitar;

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
	public void add(String serialNumber,String builderName,String model,String type,String backWoodenType,String frontWoodenType,Double price ){
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
				
				String builderName = guitar.getBuilderName();
				if(builderName == null || builderName == "" || !builderName.toLowerCase().equals(inventoryGuitar.getBuilderName().toLowerCase()))
					continue;
				
				String type = guitar.getType();
				if(type == null || type == "" || !type.toLowerCase().equals(inventoryGuitar.getType().toLowerCase()))
					continue;
				
				String backWoodenType = guitar.getBackWoodenType();
				if(backWoodenType == null || backWoodenType == "" || !backWoodenType.toLowerCase().equals(inventoryGuitar.getBackWoodenType().toLowerCase()))
					continue;
				
				String frontWoodenType = guitar.getFrontWoodenType();
				if(frontWoodenType == null || frontWoodenType == "" || !frontWoodenType.toLowerCase().equals(inventoryGuitar.getFrontWoodenType().toLowerCase()))
					continue;
				return inventoryGuitar;
			}
		}
		return null;
	};
	
	

}
