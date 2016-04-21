package testtest;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author reindert
 *
 * Een entiteit voor het vastleggen van mijn kilometerregistratie voor autoritten.
 */
@Entity
public class highscore {

	private Long id;
	private String naam;
	private String start;


	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public Long getId() {
	    return id;
	}
	
	
	public highscore(){}
	
	public void setId(Long id){
		this.id = id;
	}
	
	
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}


	@Override
	public String toString(){
		return this.naam;
	}
}
