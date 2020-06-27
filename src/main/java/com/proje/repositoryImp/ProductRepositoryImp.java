package com.proje.repositoryImp;

import java.util.List;


import javax.persistence.EntityManager;

import javax.persistence.TypedQuery;

import com.proje.factory.JpaFactory;
import com.proje.factoryImp.JpaFactoryImp;
import com.proje.model.Product;
import com.proje.model.ProductDetail;
import com.proje.repository.ProductRepository;

public class ProductRepositoryImp implements ProductRepository{
	private JpaFactory factory=new JpaFactoryImp();
	private EntityManager entityManager=factory.getEntityManager();

	@Override
	public List<Product> findProducts() {
		//TEST BAÞARILI
		TypedQuery<Product> typedQuery=this.entityManager.createNamedQuery("Product.findProducts",Product.class);
		List<Product> products=typedQuery.getResultList();

		return products;
	}

	@Override
	public List<Product> findProductByCategoryName(String categoryName) {
		//TEST BAÞARILI
		TypedQuery<Product> typedQuery=this.entityManager.createNamedQuery("Product.findProductByCategoryName",Product.class);
		typedQuery.setParameter("categoryName", categoryName);
		List<Product> products=typedQuery.getResultList();

		return products;
	}

	@Override
	public Product findProductById(int productId) {
		//test baþarýlý
		TypedQuery<Product> typedQuery=this.entityManager.createNamedQuery("Product.findProductById",Product.class);
		typedQuery.setParameter("productId", productId);
		Product product=typedQuery.getSingleResult();
		return product;
	}

	@Override
	public int findCount() {
		TypedQuery<Long> typedQuery=this.entityManager.createNamedQuery("Product.findCount", Long.class);
		Long count=typedQuery.getSingleResult();
		return count.intValue();
	}

	@Override
	public List<ProductDetail> findProductDetail() {
		//TEST BAÞARILI
		TypedQuery<ProductDetail> typedQuery=this.entityManager.createNamedQuery("Product.findProductDetails", ProductDetail.class);
		List<ProductDetail> productDetails=typedQuery.getResultList();
		return productDetails;
	}

	@Override
	public List<Product> finProductEntities(int firstResult, int maxResult) {
		//TEST BAÞARILI
		TypedQuery<Product> typedQuery=this.entityManager.createNamedQuery("Product.findProducts",Product.class);
		typedQuery.setFirstResult(firstResult);
		typedQuery.setMaxResults(maxResult);
		List<Product> products=typedQuery.getResultList();

		return products;
	}
	
	//Kullanýlamayan ÖRNEK
		//SORGU @NamedQuery(name="Product.findAddDateLater",
		//				query="Select p from product p where p.addDate>:addDate")
		
		/*
		 	
		public List<Product> findAddDateLater(Date date){
		
		TypedQuery<Product> query=this.entityManager.createNamedQuery("Product.findAddDateLater", Product.class);
		query.setParameter("Product.findAddDateLater", date.TemporalType.TIMESTAMP);
		List<Product> details=query.getResultList();
		
		}

		 */

}
