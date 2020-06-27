package com.proje.test;


import com.proje.repository.ProductRepository;
import com.proje.repositoryImp.ProductRepositoryImp;

public class Test {
	public static void main(String[] args) {
		
		ProductRepository productRepository=new ProductRepositoryImp();
		

		int i=productRepository.findCount();
		System.out.println(i);
		
		
	}

}
