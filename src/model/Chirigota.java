package model;

/**
 * Clase Chirigota, se utiliza para crear y leer las Agrupaciones de este tipo, 
 * implementa la interfaz Callejera, hereda de la clase AgrupaciónOficial
 */
public class Chirigota extends AgrupacionOficial implements Callejera {
	
	/** Atributo número de cuplés de la Chirigota */
	private Integer cuples;

	/**
	 * Instancia una nueva Chirigota vacio
	 */
	public Chirigota() {
		super();
	}

	/**
	 * Instancia un nuevo Cuarteto
	 *
	 * @param nombre <i>Nombre del Cuarteto</i>
	 * @param autor <i>Nombre del autor</i>
	 * @param autorM <i>Nombre del autor de la música</i>
	 * @param autorL <i>Nombre del autor de la letra</i>
	 * @param tipo <i>Tipo de disfraz</i>
	 * @param puntos <i>Número de puntos</i>
	 * @param cuples <i>Número de cuplés</i>
	 */
	public Chirigota(String nombre, String autor, String autorM, String autorL, String tipo, Integer puntos,
			Integer cuples) {
		super(nombre, autor, autorM, autorL, tipo, puntos);
		setCuples(cuples);
	}

	/**
	 * Obtiene el valor del número de cuplés
	 *
	 * @return Número de miembros
	 */
	public Integer getCuples() {
		return cuples;
	}

	/**
	 * Cambia el valor del número de cuplés
	 *
	 * @param cuples <i>Nuevo número de cuplés</i>
	 */
	public void setCuples(Integer cuples) {
		this.cuples = cuples;
	}

	/**
	 * Genera un String compuesto por el texto para cantarPresentación 
	 * seguido del nombre de la Chirigota
	 *
	 * @return String cantarPresentación
	 */
	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación de la Chirigota de nombre" + super.getNombre();
	}

	/**
	 * Genera un String compuesto por el nombre de la Chirigota y el tipo de difraz
	 * 
	 * @return String tipoDisfraz
	 */
	@Override
	public String hacerTipo() {
		return "La chirigota " + super.getNombre() + " va de " + super.getTipo();
	}

	/**
	 * Genera un String para indicar que una Chirigota va camino de la falla
	 * 
	 * @return String caminitoDelFalla
	 */
	@Override
	public String caminitoDelFalla() {
		return "La chirigota " + super.getNombre() + " va caminito del Falla";
	}

	/**
	 * Genera un String compuesto por texto y el nombre de la Chirigota
	 *
	 * @return String amoAescucha
	 */
	@Override
	public String amoAescucha() {
		return "Amo a escuchá la Chirigota " + super.getNombre();
	}

	/**
	 * Constructor del método toString con los atributos de una Chirigota
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Chirigota " + super.toString() + ", cuples=" + cuples;
	}

}
