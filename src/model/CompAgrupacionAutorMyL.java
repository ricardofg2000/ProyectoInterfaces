package model;

import java.util.Comparator;

/**
 * Clase CompAgrupacionAutorMyL se utiliza para ordenar Objetos del tipo
 * Agrupación según el nombre del autor de la musica y del nombre del 
 * autor de la letra
 */
public class CompAgrupacionAutorMyL implements Comparator<Agrupacion> {

	/**
	 * Compara dos objetos del tipo Agrupación según el nombre 
	 * del autor de la musica y del nombre del 
	 * autor de la letra
	 *
	 * @param o1 <i>Primer Objeto Agrupación</i>
	 * @param o2 <i>Segundo Objeto Agrupación</i>
	 * @return int Resultado de la comparación
	 */
	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int comp = 0;
		if (o1 != null && o2 != null) {
			comp = o1.getAutorM().compareTo(o2.getAutorM());
			if (comp == 0) {
				comp = o1.getAutorL().compareTo(o2.getAutorL());
			}
		}
		return comp;
	}

}
