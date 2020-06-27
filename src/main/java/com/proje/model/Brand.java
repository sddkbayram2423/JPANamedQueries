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
	@NamedQuery(name="Brand.findBrandById",query="SELECT b FROM Brand b WHERE b.brandId=:brandId")
	
})
public class Brand {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int brandId;
	
	private String brandName;
	
	@OneToMany(mappedBy="brand")
	private List<Product> products=new ArrayList<Product>();

	public Brand() {}

	public Brand(String brandName) {
		this.brandName = brandName;
	}
	
	public void addBrandProduct(Product product) {
		this.products.add(product);

	}
	public void removeBrandProduct(Product product) {
		this.products.remove(product);

	}
	
	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + ", products=" + products + "]";
	}
	
	

}
