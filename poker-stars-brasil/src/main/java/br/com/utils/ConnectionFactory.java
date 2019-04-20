package br.com.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("poker-brasil");

	public EntityManager getConnction() {
		return emf.createEntityManager();
	}

}
