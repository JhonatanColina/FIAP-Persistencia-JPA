package br.com.fiap.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	private static EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("ArtigoTecnico");
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}