package model;

/**
 * Clase AgrupaciónOficial, se utiliza para leer y trabajar con los objetos del tipo
 * AgrupacionOficial hereda de la clase Agrupación
 * 
 * @version 3-2023
 * @author Ricardo Fernández Guzmán
 */
public abstract class AgrupacionOficial extends Agrupacion {
	
	/** Atributo número máximo de Objetos de tipo AgrupaciónOficial
	 *  que vamos a guardar en el array
	 */
	private final Integer MAX_INT = 10;
	
	/** Atributo número de puntos de la AgrupaciónOficial */
	private Integer puntos;
	
	/** Atributo array de miembros integrantes de la AgrupaciónOficial */
	private Integrante[] integrantes;
	
	/** Atributo auxiliar para contar el numero de objetos dentro del 
	 *  array Integrantes 
	 */
	private Integer contIntegrantes = 0;

	/**
	 * Instancia una nueva AgrupacionOficial vacia
	 */
	public AgrupacionOficial() {
		super();
		integrantes = new Integrante[MAX_INT];
	}

	/**
	 * Instancia una nueva AgrupacionOficial
	 *
	 * @param nombre <i>Nombre del Cuarteto</i>
	 * @param autor <i>Nombre del autor</i>
	 * @param autorM <i>Nombre del autor de la música</i>
	 * @param autorL <i>Nombre del autor de la letra</i>
	 * @param tipo <i>Tipo de disfraz</i>
	 * @param puntos <i>Número de puntos</i>
	 */
	public AgrupacionOficial(String nombre, String autor, String autorM, String autorL, String tipo, Integer puntos) {
		super(nombre, autor, autorM, autorL, tipo);
		setPuntos(puntos);
		integrantes = new Integrante[MAX_INT];
	}

	/**
	 * Obtiene el valor del número de integrantes de la AgrupaciónOficial
	 *
	 * @return Número de integrantes
	 */
	public Integer getContIntegrantes() {
		return contIntegrantes;
	}

	private void setContIntegrantes(Integer contIntegrantes) {
		this.contIntegrantes = contIntegrantes;
	}

	/**
	 * Obtiene el valor del número de puntos de una AgrupaciónOficial
	 *
	 * @return Número de puntos de la AgrupaciónOficial
	 */
	public Integer getPuntos() {
		return puntos;
	}

	/**
	 * Cambia el valor del número del número de puntos de la AgrupaciónOficial
	 *
	 * @param puntos <i>Nuevo número de puntos de la AgrupaciónOficial</i>
	 */
	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	/**
	 * Obtiene el valor del array de integrantes entero
	 *
	 * @return array de integrantes
	 */
	public Integrante[] getIntegrantes() {
		return integrantes;
	}
	
	/**
	 * Obtiene el valor del Integrante de una posición concreta del array
	 *
	 * @param i <i>Posición del array</i>
	 * @return un Integrante del array
	 */
	public Integrante getIntegrantes(Integer i) {
		return integrantes[i];
	}

	/**
	 * Cambia el valor del array de Integrante
	 *
	 * @param integrantes <i>Nuevo array de Integrante</i>
	 */
	public void setIntegrantes(Integrante[] integrantes) {
		this.integrantes = integrantes;
	}

	/**
	 * Obtiene el valor de la máxima cantidad de objetos AgrupacionOficial
	 * que se pueden crear
	 *
	 * @return the max int
	 */
	public Integer getMAX_INT() {
		return MAX_INT;
	}

	/**
	 * Añade un Integrante al array integrantes
	 *
	 * @param i <i>Posición del array</i>
	 * @return true, si se ha podido añadir con exito
	 * @return false, si no se ha podido añadir con exito
	 */
	public boolean insertarIntegrante(Integrante i) {
		boolean isOK = false;
		boolean noEX = true;
		if (i != null) {
			for (Integrante integrante : integrantes) {
				if (i == integrante) {
					noEX = false;
					break;
				}
			}
		}
		if (noEX) {
			for (int j = 0; j < integrantes.length; j++) {
				if (integrantes[j] == null) {
					integrantes[j] = i;
					isOK = true;
					break;
				}
			}
		}
		return isOK;
	}

	/**
	 * Borra un integrante del array integrantes
	 *
	 * @param i <i>Posición del array</i>
	 * @return true, si se ha podido añadir con exito
	 * @return false, si no se ha podido añadir con exito
	 */
	boolean eliminarIntegrante(Integrante i) {
		boolean isOK = false;
		for (int j = 0; j < integrantes.length; j++) {
			if (integrantes[j] == i) {
				integrantes[j] = null;
				isOK = true;
				break;
			}
		}
		return isOK;
	}
	
	/**
	 * Devuelve un listado con todos los objetos Integrante no nulos dentro
	 * del array integrantes
	 *
	 * @return listado de Integrante
	 */
	public String listadoIntegrante() {
		String texto = "";
		for (Integrante integrante : integrantes) {
			if (integrante != null) {
				texto += integrante;
			}
		}
		return texto;
	}

	/**
	 * Genera un String compuesto por el texto para cantarPresentación 
	 * seguido del nombre de la AgrupaciónOficial 
	 *
	 * @return String cantarPresentación
	 */
	public abstract String caminitoDelFalla();

	/**
	 * Constructor del método toString con los atributos de una AgrupacionOficial
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return super.toString() + ", Puntos=" + puntos + ", integrantes=" + listadoIntegrante();
	}

}
