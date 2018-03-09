package GuitarApp.Models;

public class Guitar {

	String serialNumber;
	GuitarBuilder builderName;
	String model;
	GuitarType type;
	BackWoodenType backWoodenType;
	FrontWoodenType frontWoodenType;
	Double price;
	
	public Guitar(String serialNumber, GuitarBuilder builderName, String model,
			GuitarType type, BackWoodenType backWoodenType,
			FrontWoodenType frontWoodenType, Double price) {
		super();
		this.serialNumber = serialNumber;
		this.builderName = builderName;
		this.model = model;
		this.type = type;
		this.backWoodenType = backWoodenType;
		this.frontWoodenType = frontWoodenType;
		this.price = price;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public GuitarBuilder getBuilderName() {
		return builderName;
	}
	public void setBuilderName(GuitarBuilder builderName) {
		this.builderName = builderName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public GuitarType getType() {
		return type;
	}
	public void setType(GuitarType type) {
		this.type = type;
	}
	public BackWoodenType getBackWoodenType() {
		return backWoodenType;
	}
	public void setBackWoodenType(BackWoodenType backWoodenType) {
		this.backWoodenType = backWoodenType;
	}
	public FrontWoodenType getFrontWoodenType() {
		return frontWoodenType;
	}
	public void setFrontWoodenType(FrontWoodenType frontWoodenType) {
		this.frontWoodenType = frontWoodenType;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
