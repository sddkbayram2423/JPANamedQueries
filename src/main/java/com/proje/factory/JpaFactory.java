package com.proje.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public interface JpaFactory {
	
	public EntityManager getEntityManager();
	
	public EntityTransaction getEntityTransaction();

}
