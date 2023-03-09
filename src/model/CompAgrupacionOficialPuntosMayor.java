package model;

import java.util.Comparator;

/**
 * Clase CompAgrupacionOficialPuntosMayor se utiliza para ordenar Objetos del tipo
 * AgrupaciónOficial según el número de puntos de la AgrupaciónOficial 
 * de menor a mayor
 */
public class CompAgrupacionOficialPuntosMayor implements Comparator<AgrupacionOficial>{

	/**
	 * Compara dos objetos del tipo AgrupaciónOfical según el número puntos
	 *
	 * @param o1 <i>Primer Objeto AgrupaciónOficial</i>
	 * @param o2 <i>Segundo Objeto AgrupaciónOficial</i>
	 * @return int Resultado de la comparación
	 */
	@Override
	public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
		int comp = 0;
		if (o1 != null && o2 != null) {
			comp = o1.getPuntos().compareTo(o2.getPuntos());
		}
		return (comp*-1);
	}
}
