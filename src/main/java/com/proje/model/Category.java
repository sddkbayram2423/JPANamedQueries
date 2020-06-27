package com.proje.model;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
@Entity
@NamedQueries({
	@NamedQuery(name="Category.findCategoryById",query="SELECT c FROM Category c WHERE c.categoryId=:categoryId")
})
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int categoryId;
	
	private String categoryName;
	
	@OneToMany(mappedBy="category")
	private List<Product> products=new ArrayList<Product>();

	public Category() {	}

	public Category(String categoryName) {
		this.categoryName = categoryName;
	}
	public void addCategoryProduct(Product product) {
		this.products.add(product);

	}
	public void removeCategoryProduct(Product product) {
		this.products.remove(product);
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Category [categoryID=" + categoryId + ", categoryName=" + categoryName + ", products=" + products + "]";
	}

	

}
