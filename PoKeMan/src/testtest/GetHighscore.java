

package testtest;


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
public abstract class GetHighscore {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("highscores");
	
	/**
	 * Maak een nieuwe Rit aan en sla die op in de database
	 */


	public static List<highscore> getHighscore(){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		List<highscore> scores = em.createQuery("from highscore order by start ", highscore.class).setMaxResults(1).getResultList();
		t.commit();
		em.close();
		return scores;
	}
}
