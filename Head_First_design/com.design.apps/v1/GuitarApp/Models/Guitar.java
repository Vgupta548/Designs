package v1.GuitarApp.Models;


public class Guitar {

	
	String serialNumber;
	String builderName;
	String model;
	String type;
	String backWoodenType;
	String frontWoodenType;
	Double price;
	
	public Guitar(String serialNumber, String builderName, String model,
			String type, String backWoodenType, String frontWoodenType,
			Double price) {
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
	public String getBuilderName() {
		return builderName;
	}
	public void setBuilderName(String builderName) {
		this.builderName = builderName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBackWoodenType() {
		return backWoodenType;
	}
	public void setBackWoodenType(String backWoodenType) {
		this.backWoodenType = backWoodenType;
	}
	public String getFrontWoodenType() {
		return frontWoodenType;
	}
	public void setFrontWoodenType(String frontWoodenType) {
		this.frontWoodenType = frontWoodenType;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
