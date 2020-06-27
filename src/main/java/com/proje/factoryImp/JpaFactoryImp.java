package com.proje.factoryImp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.factory.JpaFactory;

public class JpaFactoryImp implements JpaFactory{
	private EntityManager entitiyManager;
	@Override
	public EntityManager getEntityManager() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("persistence-unit");
		entitiyManager=factory.createEntityManager();
		return entitiyManager;
	}

	@Override
	public EntityTransaction getEntityTransaction() {
	EntityTransaction entityTransaction=entitiyManager.getTransaction();
		return entityTransaction;
	}

}
