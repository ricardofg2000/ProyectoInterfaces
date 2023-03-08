package model;

/**
 * Clase Integrante, se utiliza para crear y leer integrantes de las Agrupaciones
 */
public class Integrante {
	
	/** Atributo numero del participante */
	private Integer numeroParticipante;
	
	/** Atributo nombre del  */
	private String nombre;
	
	/** The edad. */
	private Integer edad;
	
	/** The localidad. */
	private String localidad;
	
	/** The cont. */
	private static Integer cont = 1;

	/**
	 * Instantiates a new integrante.
	 */
	public Integrante() {
		setNumeroParticipante(cont++);
	}

	/**
	 * Instantiates a new integrante.
	 *
	 * @param nombre the nombre
	 * @param edad the edad
	 * @param localidad the localidad
	 */
	public Integrante(String nombre, Integer edad, String localidad) {
		setNumeroParticipante(cont++);
		setNombre(nombre);
		setEdad(edad);
		setLocalidad(localidad);
	}

	/**
	 * Gets the numero participante.
	 *
	 * @return the numero participante
	 */
	public Integer getNumeroParticipante() {
		return numeroParticipante;
	}

	/**
	 * Sets the numero participante.
	 *
	 * @param numeroParticipante the new numero participante
	 */
	private void setNumeroParticipante(Integer numeroParticipante) {
		this.numeroParticipante = numeroParticipante;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the edad.
	 *
	 * @return the edad
	 */
	public Integer getEdad() {
		return edad;
	}

	/**
	 * Sets the edad.
	 *
	 * @param edad the new edad
	 */
	public void setEdad(Integer edad) {
		if (edad >= 18) {
			this.edad = edad;
		}

	}

	/**
	 * Gets the localidad.
	 *
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * Sets the localidad.
	 *
	 * @param localidad the new localidad
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Integrante " + numeroParticipante + " Nombre=" + nombre + " Edad=" + edad + " Localidad=" + localidad;
	}

}
