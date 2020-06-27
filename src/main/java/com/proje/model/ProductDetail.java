package com.proje.model;

public class ProductDetail {
	
	private String productName;
	
	private double unitPrice;
	
	private int avaible;
	
	private String categoryName;
	
	private String barandName;
	
	public ProductDetail() {
	}

	public ProductDetail(String productName, double unitPrice, int avaible, String categoryName, String barandName) {
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.avaible = avaible;
		this.categoryName = categoryName;
		this.barandName = barandName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getAvaible() {
		return avaible;
	}

	public void setAvaible(int avaible) {
		this.avaible = avaible;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getBarandName() {
		return barandName;
	}

	public void setBarandName(String barandName) {
		this.barandName = barandName;
	}

	@Override
	public String toString() {
		return "ProductDetail [productName=" + productName + ", unitPrice=" + unitPrice + ", avaible=" + avaible
				+ ", categoryName=" + categoryName + ", barandName=" + barandName + "]";
	}
	
	
}
