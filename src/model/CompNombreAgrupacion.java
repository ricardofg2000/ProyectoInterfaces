package model;

import java.util.Comparator;

/**
 * Clase CompNombreAgrupacion se utiliza para ordenar Objetos del tipo
 * Agrupación según el nombre de la agrupación.
 *
 * @author Ricardo Fernández Guzmán
 * @version 3-2023
 */
public class CompNombreAgrupacion implements Comparator<Agrupacion> {

	/**
	 * Compara dos objetos del tipo Agrupación según el nombre.
	 *
	 * @param o1 <i>Primer Objeto Agrupación</i>
	 * @param o2 <i>Segundo Objeto Agrupación</i>
	 * @return int Resultado de la comparación
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
