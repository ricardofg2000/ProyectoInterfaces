package model;

import java.util.Comparator;

/**
 * Clase CompIntegranteNombre se utiliza para comparar Objetos del tipo
 * Integrante según el nombre del Integrante
 */
public class CompIntegranteNombre implements Comparator<Integrante> {

	/**
	 * Compara dos objetos del tipo Integrante según el nombre
	 *
	 * @param o1 <i>Primer Objeto Integrante</i>
	 * @param o2 <i>Segundo Objeto Integrante</i>
	 * @return int Resultado de la comparación
	 */
	@Override
	public int compare(Integrante o1, Integrante o2) {
		int comp = 0;
		if (o1 != null && o2 != null) {
			comp = o1.getNombre().compareTo(o2.getNombre());
		}
		return comp;
	}

}
