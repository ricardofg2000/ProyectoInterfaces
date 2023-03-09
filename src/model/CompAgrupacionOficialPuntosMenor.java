package model;

import java.util.Comparator;

/**
 * Clase CompNombreAgrupacion se utiliza para comparar Objetos del tipo
 * AgrupaciónOficial según el número de puntos de la AgrupaciónOficial
 */
public class CompAgrupacionOficialPuntosMenor implements Comparator<AgrupacionOficial>{

	/**
	 * Compara dos objetos del tipo AgrupaciónOfical según el número puntos
	 *
	 * @param o1 <i>Primer Objeto Agrupación</i>
	 * @param o2 <i>Segundo Objeto Agrupación</i>
	 * @return int Resultado de la comparación
	 */
	@Override
	public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
		int comp = 0;
		if (o1 != null && o2 != null) {
			comp = o1.getPuntos().compareTo(o2.getPuntos());
		}
		return comp;
	}
}
