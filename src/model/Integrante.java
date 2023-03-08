package model;

/**
 * Clase Integrante, se utiliza para crear y leer integrantes de las Agrupaciones
 */
public class Integrante {
	
	/** Atributo numero del participante del integrante */
	private Integer numeroParticipante;
	
	/** Atributo nombre del integrante */
	private String nombre;
	
	/** Atributo edad del integrante */
	private Integer edad;
	
	/** Atributo localidad del integrante */
	private String localidad;
	
	/** Atributo auxiliar contador de Objetos de la clase Integrante creados */
	private static Integer cont = 1;

	/**
	 * Instancia un nuevo Integrante vacio
	 */
	public Integrante() {
		setNumeroParticipante(cont++);
	}

	/**
	 * Instancia un nuevo Integrante con todos sus atributos
	 *
	 * @param nombre <i>Nombre del Integrante</i>
	 * @param edad <i>Edad del Integrante</i>
	 * @param localidad <i>Localidad del Integrante</i>
	 */
	public Integrante(String nombre, Integer edad, String localidad) {
		setNumeroParticipante(cont++);
		setNombre(nombre);
		setEdad(edad);
		setLocalidad(localidad);
	}

	/**
	 * Obtiene el valor del número del participante
	 *
	 * @return Número del participante
	 */
	public Integer getNumeroParticipante() {
		return numeroParticipante;
	}

	/**
	 * Cambia el valor del número del participante
	 *
	 * @param numeroParticipante <i>Nuevo número del participante</i>
	 */
	private void setNumeroParticipante(Integer numeroParticipante) {
		this.numeroParticipante = numeroParticipante;
	}

	/**
	 * Obtiene el valor del nombre del integrante
	 *
	 * @return nombre del integrante
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambia el valor del nombre del integrante
	 *
	 * @param nombre <i>Nuevo nombre del integrante</i>
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el valor de la edad del integrante
	 *
	 * @return edad del integrante
	 */
	public Integer getEdad() {
		return edad;
	}

	/**
	 * Cambia el valor de la edad del integrante
	 *
	 * @param edad <i>Nueva edad del integrante</i>
	 */
	public void setEdad(Integer edad) {
		if (edad >= 18) {
			this.edad = edad;
		}

	}

	/**
	 * Obtiene el valor de la localidad del integrante
	 *
	 * @return localidad del integrante
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * Sets the localidad.
	 *
	 * @param localidad <i>Nueva localidad del integrante</i>
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * Constructor del método toString con los atributos de un Integrante
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Integrante " + numeroParticipante + " Nombre=" + nombre + " Edad=" + edad + " Localidad=" + localidad;
	}

}
