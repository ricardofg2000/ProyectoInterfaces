package model;

import java.util.Comparator;

/**
 * Clase CompNombreAgrupacion se utiliza para comparar Objetos del tipo
 * Agrupación según el nombre de la agrupación
 */
public class CompNombreAgrupacion implements Comparator<Agrupacion> {

	/**
	 * Compara dos objetos del tipo Agrupación segun el nombre
	 *
	 * @param o1 <i>Primer Objeto Agrupación</i>
	 * @param o2 <i>Segundo Objeto Agrupación</i>
	 * @return Resultado de la comparación
	 */
	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int comp = 0;
		if (o1 != null && o2 != null) {
			comp = o1.getNombre().compareTo(o2.getNombre());
		}
		return comp;
	}
}
