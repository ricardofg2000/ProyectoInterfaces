package model;

/**
 * Clase Agrupación, se utiliza para leer y trabajar con los objetos del tipo
 * Agrupacion hereda implementa Comparable
 * 
 * @version 3-2023
 * @author Ricardo Fernández Guzmán
 */
public abstract class Agrupacion implements Comparable<Agrupacion> {

	/** Atributo nombre de la Agrupación */
	private String nombre;
	
	/** Atributo autor de la Agrupación */
	private String autor;
	
	/** Atributo autor de la musica de la Agrupación */
	private String autorM;
	
	/** Atributo autor de la letra de la Agrupación */
	private String autorL;
	
	/** Atributo tipo de disfraz de la Agrupación */
	private String tipo;
	
	/** Atributo numero objetos del tipo Agrupacion */
	private Integer agrupacionesTotales;
	
	/** Atributo auxiliar contador */
	private static Integer cont = 1;

	/**
	 * Instancia una nueva Agrupacion vacia
	 */
	public Agrupacion() {
		setAgrupacionesTotales(cont++);
	}

	/**
	 * Instancia una nueva Agrupacion
	 *
	 * @param nombre <i>Nombre del Cuarteto</i>
	 * @param autor <i>Nombre del autor</i>
	 * @param autorM <i>Nombre del autor de la música</i>
	 * @param autorL <i>Nombre del autor de la letra</i>
	 * @param tipo <i>Tipo de disfraz</i>
	 */
	public Agrupacion(String nombre, String autor, String autorM, String autorL, String tipo) {
		setAgrupacionesTotales(cont++);
		setNombre(nombre);
		setAutor(autor);
		setAutorM(autorM);
		setAutorL(autorL);
		setTipo(tipo);
	}

	/**
	 * Obtiene el nombre de la Agrupacion
	 *
	 * @return nombre de la Agrupacion
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambia el nombre de la Agrupacion
	 *
	 * @param nombre <i>Nuevo nombre de la Agrupacion</i>
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el nombre del autor de la Agrupacion
	 *
	 * @return nombre del autor de la Agrupacion
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Cambia el nombre del autor de la Agrupacion
	 *
	 * @param autor <i>Nuevo nombre del autor de la Agrupacion</i>
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Obtiene el nombre del autor de la musica de la Agrupacion
	 *
	 * @return nombre del autor de la musica de la Agrupacion
	 */
	public String getAutorM() {
		return autorM;
	}

	/**
	 * Cambia el nombre del autor de la musica de la Agrupacion
	 *
	 * @param autorM <i>Nuevo nombre del autor de la musica de la Agrupacion</i>
	 */
	public void setAutorM(String autorM) {
		this.autorM = autorM;
	}

	/**
	 * Obtiene el nombre del autor de la letra de la Agrupacion
	 *
	 * @return nombre del autor de la letra de la Agrupacion
	 */
	public String getAutorL() {
		return autorL;
	}

	/**
	 * Cambia el nombre del autor de la letra de la Agrupacion
	 *
	 * @param autorL <i>Nuevo nombre del autor de la letra de la Agrupacion</i>
	 */
	public void setAutorL(String autorL) {
		this.autorL = autorL;
	}

	/**
	 * Obtiene el valor del tipo de disfraz de la Agrupacion
	 *
	 * @return tipo de disfraz de la Agrupacion
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Cambia el valor del tipo de disfraz de la Agrupacion
	 *
	 * @param tipo <i>Nuevo tipo de disfraz de la Agrupacion</i>
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Obtiene la cantidad de Agrupaciones creadas
	 *
	 * @return cantidad de Agrupaciones
	 */
	public Integer getAgrupacionesTotales() {
		return agrupacionesTotales;
	}


	private void setAgrupacionesTotales(Integer agrupacionesTotales) {
		this.agrupacionesTotales = agrupacionesTotales;
	}

	/**
	 * Obtiene el valor del contador auxiliar
	 *
	 * @return contador auxiliar
	 */
	public static Integer getCont() {
		return cont;
	}

	private static void setCont(Integer cont) {
		Agrupacion.cont = cont;
	}

	/**
	 * Genera un String compuesto por el texto para cantarPresentación 
	 * seguido del nombre de la Agrupación
	 *
	 * @return String cantarPresentación
	 */
	public abstract String cantarPresentacion();

	/**
	 * Genera un String compuesto por el texto para hacerTipo 
	 * cogiendo datos de los atributos de Agrupación
	 *
	 * @return String hacerTipo
	 */
	public abstract String hacerTipo();

	/**
	 * Compara la Agrupacion con otro objeto del tipo Agrupacion
	 * según el nombre
	 *
	 * @param a2 <i>Agrupacion a comparar</i>
	 * @return resultado de la comparación
	 */
	@Override
	public int compareTo(Agrupacion a2) {
		return this.getNombre().compareTo(a2.getNombre());
	}

	/**
	 * Constructor del método toString con los atributos de una Agrupacion
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Nombre=" + nombre + ", Autor=" + autor + ", AutorM=" + autorM + ", AutorL=" + autorL + ", Tipo=" + tipo;
	}

}
