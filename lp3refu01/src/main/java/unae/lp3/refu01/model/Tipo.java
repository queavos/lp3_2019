package unae.lp3.refu01.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tipo {
	@Id
	private int id ;
	private String nombre;
	private int active;
}
