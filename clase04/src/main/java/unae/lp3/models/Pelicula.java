package unae.lp3.models;

public class Pelicula {
	private String titulo;
	private int duracion;
	private String clasificacion;
	private String genero;
	private String imagen;
	private String fechaEstreno;
	private String estatus="activa";
	private int id;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getFechaEstreno() {
		return fechaEstreno;
	}
	public void setFechaEstreno(String fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", duracion=" + duracion + ", Clasificacion=" + clasificacion
				+ ", genero=" + genero + ", imagen=" + imagen + ", fechaEstreno=" + fechaEstreno + ", estatus="
				+ estatus + ", id=" + id + "]";
	}
	public Pelicula(int id, String titulo, int duracion, String clasificacion, String genero, String imagen) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.duracion = duracion;
		this.clasificacion = clasificacion;
		this.genero = genero;
		this.imagen = imagen;
	}
	
}
