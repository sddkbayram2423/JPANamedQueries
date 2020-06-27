package com.proje.repository;

import java.util.List;

import com.proje.model.Product;
import com.proje.model.ProductDetail;

public interface ProductRepository {
	
	List<Product> findProducts();

	List<Product> findProductByCategoryName(String categoryName);

	Product findProductById(int productId);

	int findCount();

	List<ProductDetail> findProductDetail();
	
	List<Product> finProductEntities(int firstResult,int maxResult);

}
