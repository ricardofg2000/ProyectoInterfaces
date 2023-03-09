package model;

/**
 * Clase Comparsa, se utiliza para crear y leer las Agrupaciones de este tipo
 */
public class Comparsa extends AgrupacionOficial {
	
	/** The empresa A. */
	private String empresaA;

	/**
	 * Instantiates a new comparsa.
	 */
	public Comparsa() {
		super();
	}

	/**
	 * Instancia una nueva Comparsa
	 *
	 * @param nombre <i>Nombre del Cuarteto</i>
	 * @param autor <i>Nombre del autor</i>
	 * @param autorM <i>Nombre del autor de la música</i>
	 * @param autorL <i>Nombre del autor de la letra</i>
	 * @param tipo <i>Tipo de disfraz</i>
	 * @param puntos <i>Número de puntos</i>
	 * @param empresaA <i>Nombre empresa atrezzo</i>
	 */
	public Comparsa(String nombre, String autor, String autorM, String autorL, String tipo, Integer puntos,
			String empresaA) {
		super(nombre, autor, autorM, autorL, tipo, puntos);
		setEmpresaA(empresaA);
	}

	/**
	 * Obtiene el valor del nombre de la empresa de atrezzo
	 *
	 * @return Nombre de la empresa de atrezzo
	 */
	public String getEmpresaA() {
		return empresaA;
	}

	/**
	 * Cambia el valor del nombre de la empresa de atrezzo
	 *
	 * @param miembros <i>Nuevo nombre de la empresa de atrezzo</i>
	 */
	public void setEmpresaA(String empresaA) {
		this.empresaA = empresaA;
	}

	/**
	 * Genera un String compuesto por el texto para cantarPresentación 
	 * seguido del nombre de la Comparsa
	 *
	 * @return String cantarPresentación
	 */
	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación de la Comparsa de nombre" + super.getNombre();
	}

	/**
	 * Genera un String compuesto por el nombre de la Comparsa y el tipo de difraz
	 * 
	 * @return String tipoDisfraz
	 */
	@Override
	public String hacerTipo() {
		return "La comparsa " + super.getNombre() + " va de " + super.getTipo();
	}

	/**
	 * Genera un String para indicar que una Comparsa va camino de la falla
	 * 
	 * @return String caminitoDelFalla
	 */
	@Override
	public String caminitoDelFalla() {
		return "La comparsa " + super.getNombre() + " va caminito del Falla";
	}

	/**
	 * Constructor del método toString con los atributos de una Comparsa
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Comparsa " + super.toString() + ", Empresa del atrezzo=" + empresaA;
	}
}
