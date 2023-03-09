package model;

import java.util.Comparator;

/**
 * Clase CompAgrupacionAutor se utiliza para ordenar Objetos del tipo
 * Agrupación según el nombre del autor
 */
public class CompAgrupacionAutor implements Comparator<Agrupacion> {

	/**
	 * Compara dos objetos del tipo Agrupación según el nombre del autor
	 *
	 * @param o1 <i>Primer Objeto Agrupación</i>
	 * @param o2 <i>Segundo Objeto Agrupación</i>
	 * @return int Resultado de la comparación
	 */
	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int comp = 0;
		if (o1 != null && o2 != null) {
			comp = o1.getAutor().compareTo(o2.getAutor());
		}
		return comp;
	}

}
