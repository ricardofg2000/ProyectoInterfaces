package model;

/**
 * Clase Coro, se utiliza para crear y leer las Agrupaciones de este tipo, 
 * implementa la interfaz Callejera, hereda de la clase AgrupaciónOficial.
 *
 * @author Ricardo Fernández Guzmán
 * @version 3-2023
 */
public class Coro extends AgrupacionOficial {
	
	/**  Atributo número de bandurrias del Coro. */
	private Integer bandurrias;
	
	/**  Atributo número de guitarras del Coro. */
	private Integer guitarras;

	/**
	 * Instancia un nuevo Coro vacio.
	 */
	public Coro() {
		super();
	}

	/**
	 * Instantiates a new coro.
	 *
	 * @param nombre <i>Nombre del Cuarteto</i>
	 * @param autor <i>Nombre del autor</i>
	 * @param autorM <i>Nombre del autor de la música</i>
	 * @param autorL <i>Nombre del autor de la letra</i>
	 * @param tipo <i>Tipo de disfraz</i>
	 * @param puntos <i>Número de puntos</i>
	 * @param bandurrias <i>Número de bandurrias</i>
	 * @param guitarras <i>Número de guitarras</i>
	 */
	public Coro(String nombre, String autor, String autorM, String autorL, String tipo, Integer puntos,
			Integer bandurrias, Integer guitarras) {
		super(nombre, autor, autorM, autorL, tipo, puntos);
		setBandurrias(bandurrias);
		setGuitarras(guitarras);
	}

	/**
	 * Obtiene el valor del número de bandurrias.
	 *
	 * @return Número de bandurrias
	 */
	public Integer getBandurrias() {
		return bandurrias;
	}

	/**
	 * Cambia el valor del número de bandurrias.
	 *
	 * @param bandurrias <i>Nuevo número de bandurrias</i>
	 */
	public void setBandurrias(Integer bandurrias) {
		this.bandurrias = bandurrias;
	}

	/**
	 * Obtiene el valor del número de guitarras.
	 *
	 * @return Número de guitarras
	 */
	public Integer getGuitarras() {
		return guitarras;
	}

	/**
	 * Cambia el valor del número de guitarras.
	 *
	 * @param guitarras <i>Nuevo número de guitarras</i>
	 */
	public void setGuitarras(Integer guitarras) {
		this.guitarras = guitarras;
	}

	/**
	 * Genera un String compuesto por el texto para cantarPresentación 
	 * seguido del nombre del Coro.
	 *
	 * @return String cantarPresentación
	 */
	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del Coro de nombre" + super.getNombre();
	}

	/**
	 * Genera un String compuesto por el nombre del Coro y el tipo de difraz.
	 *
	 * @return String tipoDisfraz
	 */
	@Override
	public String hacerTipo() {
		return "El coro " + super.getNombre() + " va de " + super.getTipo();
	}

	/**
	 * Genera un String para indicar que un Coro va camino de la falla.
	 *
	 * @return String caminitoDelFalla
	 */
	@Override
	public String caminitoDelFalla() {
		return "El coro " + super.getNombre() + " va caminito del Falla";
	}

	/**
	 * Constructor del método toString con los atributos de un Coro.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Coro " + super.toString() + ", Número bandurrias=" + bandurrias + ", Número guitarras=" + guitarras;
	}
}
