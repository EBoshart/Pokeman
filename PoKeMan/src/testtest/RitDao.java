package testtest;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author reindert
 *
 * Deze class implementeert data-operaties voor de Rit entiteit
 */
public abstract class RitDao {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("highscores");
	
	/**
	 * Maak een nieuwe Rit aan en sla die op in de database
	 */
	public static highscore create(String naam, String start){
		highscore rit = new highscore();
		rit.setNaam(naam);
		rit.setStart(start);
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist( rit );
		t.commit();
		em.close();
		 
		return rit;
	}
	
	/**
	 * Verwijder een rit uit de database
	 */
/*	public static void remove(Long id){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		Rit rit = em.find(Rit.class, id);
		if(rit != null){
			em.remove( rit );
		}
		t.commit();
		em.close();
	}*/
	
	/**
	 * Haal een rit op a.d.h.v. zijn id
	 */
	public static highscore find(Long id){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		highscore rit = em.find(highscore.class, id);
		t.commit();
		em.close();
		return rit;
	}
	
	/**
	 * Haal alle ritten op uit de database
	 */
	public static List<highscore> all(){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		List<highscore> ritten = em.createQuery("from highscore", highscore.class).getResultList();
		t.commit();
		em.close();
		return ritten;
	}
}
