package oop1;

//PascalCase
public class Product {
	private String name;
	// camelCase
	private double unitPrice;
	private double discount;
	private String ImageUrl;
	private int unitStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return ImageUrl;
	}

	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}

	public int getUnitStock() {
		return unitStock;
	}

	public void setUnitStock(int unitStock) {
		this.unitStock = unitStock;
	}

}
