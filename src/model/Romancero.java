package model;


/**
 * Clase Romancero, se utiliza para crear y leer las Agrupaciones de este tipo, 
 * implementa la interfaz Callejera, hereda de la clase Agrupación
 * 
 * @version 3-2023
 * @author Ricardo Fernández Guzmán
 */
public class Romancero extends Agrupacion implements Callejera {
	
	/** Atributo temática del cartelón */
	private String tematicaC;

	/**
	 * Instancia un nuevo Romancero vacio
	 */
	public Romancero() {
		super();
	}

	/**
	 * Instancia un nuevo Romancero 
	 *
	 * @param nombre <i>Nombre del Romancero</i>
	 * @param autor <i>Nombre del autor</i>
	 * @param autorM <i>Nombre del autor de la música</i>
	 * @param autorL <i>Nombre del autor de la letra</i>
	 * @param tipo <i>Tipo de disfraz</i>
	 * @param tematicaC <i>Temática del cartelón</i>
	 */
	public Romancero(String nombre, String autor, String autorM, String autorL, String tipo, String tematicaC) {
		super(nombre, autor, autorM, autorL, tipo);
		setTematicaC(tematicaC);
	}

	/**
	 * Obtiene el valor de la temática del cartelón
	 *
	 * @return Temática del cartelón
	 */
	public String getTematicaC() {
		return tematicaC;
	}

	/**
	 * Cambia el valor de la temática del cartelón
	 *
	 * @param tematicaC <i>Nueva temática del cartelón</i>
	 */
	public void setTematicaC(String tematicaC) {
		this.tematicaC = tematicaC;
	}

	/**
	 * Genera un String compuesto por el texto para cantarPresentación 
	 * seguido del nombre del Romancero
	 *
	 * @return String cantarPresentación
	 */
	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del Romancero de nombre" + super.getNombre();
	}

	/**
	 * Genera un String compuesto por el nombre del Romancero y el tipo de difraz
	 * 
	 * @return String tipoDisfraz
	 */
	@Override
	public String hacerTipo() {
		return "El romancero " + super.getNombre() + " va de " + super.getTipo();
	}

	/**
	 * Genera un String compuesto por texto y el nombre del Romancero
	 *
	 * @return String amoAescucha
	 */
	@Override
	public String amoAescucha() {
		return "Amo a escuchá el Romancero " + super.getNombre();
	}

	/**
	 * Constructor del método toString con los atributos de un Romancero
	 *
	 * @return Cadena de texto con los atributos del Romancero
	 */
	@Override
	public String toString() {
		return "Romancero " + super.toString() + ", Temática del cartelón=" + tematicaC;
	}
}
