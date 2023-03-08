package model;

/**
 * Clase Cuarteto, se utiliza para crear y leer las Agrupaciones de este tipo, 
 * implementa la interfaz Callejera
 */
public class Cuarteto extends AgrupacionOficial implements Callejera {
	
	/** Atributo número de miembros del Cuarteto */
	private Integer miembros;

	/**
	 * Instancia un nuevo Cuarteto vacio
	 */
	public Cuarteto() {
		super();
	}

	/**
	 * Instancia un nuevo Cuarteto vacio
	 *
	 * @param nombre <i>Nombre del Cuarteto</i>
	 * @param autor <i>Nombre del autor</i>
	 * @param autorM <i>Nombre del autor de la música</i>
	 * @param autorL <i>Nombre del autor de la letra</i>
	 * @param tipo <i>Tipo de disfraz</i>
	 * @param puntos <i>Número de puntos</i>
	 * @param miembros <i>Número de miembros</i>
	 */
	public Cuarteto(String nombre, String autor, String autorM, String autorL, String tipo, Integer puntos,
			Integer miembros) {
		super(nombre, autor, autorM, autorL, tipo, puntos);
		setMiembros(super.getContIntegrantes());
	}

	/**
	 * Obtiene el valor del número de miembros
	 *
	 * @return Número de miembros
	 */
	public Integer getMiembros() {
		return miembros;
	}

	/**
	 * Cambia el valor del número de miembros
	 *
	 * @param miembros <i>Nuevo número de miembros</i>
	 */
	public void setMiembros(Integer miembros) {
		this.miembros = miembros;
	}

	/**
	 * Genera un String compuesto por el texto para cantarPresentación 
	 * seguido del nombre del Cuarteto
	 *
	 * @return String cantarPresentación
	 */
	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del cuarteto de nombre" + super.getNombre();
	}

	/**
	 * Genera un String compuesto por el nombre del Cuarteto y el tipo de difraz
	 * 
	 * @return String tipoDisfraz
	 */
	@Override
	public String hacerTipo() {
		return "El cuarteto " + super.getNombre() + " va de " + super.getTipo();
	}

	/**
	 * Genera un String para indicar que un Cuarteto va camino de la falla
	 * 
	 * @return String caminitoDelFalla
	 */
	@Override
	public String caminitoDelFalla() {
		return "El cuarteto " + super.getNombre() + " va caminito del Falla";
	}

	/**
	 * Genera un String compuesto por texto y el nombre del Cuarteto
	 *
	 * @return String amoAescucha
	 */
	@Override
	public String amoAescucha() {
		return "Amo a escuchá la Chirigota " + super.getNombre();
	}

	/**
	 * Constructor del método toString con los atributos de un Cuarteto
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Cuarteto " + super.toString() + ", Número miembros=" + super.getContIntegrantes();
	}
}
