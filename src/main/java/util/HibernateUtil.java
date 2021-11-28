package util;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.hibernate.ogm.OgmSessionFactory;

public class HibernateUtil {
	private static HibernateUtil instance = null;
	
	private EntityManager entityManager;
	
	private HibernateUtil() {
		
		entityManager = Persistence
				.createEntityManagerFactory("DHKTPM15BTT_JPA_OGM_Socket")
				.createEntityManager();
	}
	
	public synchronized static HibernateUtil getInstance() {
		if(instance == null)
			instance = new HibernateUtil();
		
		return instance;
	}
	public OgmSessionFactory getSessionFactory() {
		return getSessionFactory();
	}
	
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
}
