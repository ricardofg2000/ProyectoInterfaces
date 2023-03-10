package controller;

import java.util.Arrays;

import model.Agrupacion;
import model.AgrupacionOficial;
import model.CompAgrupacionAutor;
import model.CompAgrupacionAutorMyL;
import model.CompAgrupacionOficialPuntosMayor;
import model.CompAgrupacionOficialPuntosMenor;
import model.CompIntegranteNombre;
import model.CompNombreAgrupacion;
import model.Integrante;

/**
 * Clase COAC, controla el programa y las interacciones entre el
 * el backend y fronted del programa.
 */
public class COAC {

	/** Atributo array de Agrupaciones */
	private Agrupacion[] agrupaciones;
	
	/** Atributo array de Integrante */
	private Integrante[] integrantes;

	/**
	 * Instancia una nuevo COAC
	 *
	 * @param n1 <i>Tamaño del array agrupaciones</i>
	 * @param n2 <i>Tamaño del array integrantes</i>
	 */
	public COAC(Integer n1, Integer n2) {
		agrupaciones = new Agrupacion[n1];
		integrantes = new Integrante[n2];
	}

	/**
	 * Obtiene el array completo agrupaciones
	 *
	 * @return array de Agrupaciones
	 */
	public Agrupacion[] getAgrupaciones() {
		return agrupaciones;
	}

	/**
	 * Obtiene un elemento del array agrupaciones
	 *
	 * @param n <i>Posición del array</i>
	 * @return Agrupacion en la posición n
	 */
	public Agrupacion getAgrupaciones(Integer n) {
		return agrupaciones[n];
	}

	/**
	 * Cambia el array completo agrupaciones
	 *
	 * @param agrupaciones <i>Nuevo array de Agrupacion</i>
	 */
	public void setAgrupaciones(Agrupacion[] agrupaciones) {
		this.agrupaciones = agrupaciones;
	}

	/**
	 * Cambia un elemento del array agrupaciones
	 *
	 * @param n1 <i>Posición del array</i>
	 * @param agrupaciones <i>Nueva Agrupacion</i>
	 */
	public void setAgrupaciones(Integer n1, Agrupacion agrupaciones) {
		this.agrupaciones[n1] = agrupaciones;
	}

	/**
	 * Obtiene el array completo integrantes
	 *
	 * @return array de Integrante
	 */
	public Integrante[] getIntegrantes() {
		return integrantes;
	}

	/**
	 * Obtiene un elemento del array integrantes
	 *
	 * @param n <i>Posición del array</i>
	 * @return Integrante en la posición n
	 */
	public Integrante getIntegrantes(Integer n) {
		return integrantes[n];
	}

	/**
	 * Cambia el array completo agrupaciones
	 *
	 * @param integrantes <i>Nuevo array de Integrante</i>
	 */
	public void setIntegrantes(Integrante[] integrantes) {
		this.integrantes = integrantes;
	}

	/**
	 * Cambia un elemento del array integrantes
	 *
	 * @param n1 <i>Posición del array</i>
	 * @param integrantes <i>Nuevo Integrante</i>
	 */
	public void setIntegrantes(Integer n1, Integrante integrantes) {
		this.integrantes[n1] = integrantes;
	}

	/**
	 * Añade un elemento Agrupacion al array agrupaciones
	 *
	 * @param i <i>Posición del array</i>
	 * @return <ul>
	 * <li> true: si se ha podido añadir la Agrupacion con exito</li>
	 * <li> false: si no se ha podido añadir la Agrupacion con exito </li>
	 * </ul>
	 */
	public boolean inscribir_agrupacion(Agrupacion i) {
		boolean isOK = false;
		boolean noEX = true;
		if (i != null) {
			for (Agrupacion agrupacione : agrupaciones) {
				if (i == agrupacione) {
					noEX = false;
					break;
				}
			}
		}
		if (noEX) {
			for (int j = 0; j < agrupaciones.length; j++) {
				if (agrupaciones[j] == null) {
					agrupaciones[j] = i;
					isOK = true;
					break;
				}
			}
		}
		return isOK;
	}

	/**
	 * Añade un Integrante al array integrantes
	 *
	 * @param i <i>Posición del array</i>
	 * @return <ul>
	 * <li> true: si se ha podido añadir Integrante con exito</li>
	 * <li> false: si no se ha podido añadir el Integrante con exito </li>
	 * </ul>
	 */
	public boolean inscribir_integrante(Integrante i) {
		boolean isOK = false;
		boolean noEX = true;
		if (i != null) {
			for (Integrante integrante : integrantes) {
				if (i == integrante) {
					noEX = false;
					break;
				}
			}
		}
		if (noEX) {
			for (int j = 0; j < integrantes.length; j++) {
				if (integrantes[j] == null) {
					integrantes[j] = i;
					isOK = true;
					break;
				}
			}
		}
		return isOK;
	}

	/**
	 * Borra una Agrupacion del array agrupaciones
	 *
	 * @param i <i>Posición del array</i>
	 * @return <ul>
	 * <li> true: si se ha podido boorar la Agrupacion con exito</li>
	 * <li> false: si no se ha podido borrar la Agrupacion con exito </li>
	 * </ul>
	 */
	public boolean eliminar_agrupacion(Agrupacion i) {
		boolean isOK = false;
		for (int j = 0; j < agrupaciones.length; j++) {
			if (agrupaciones[j] == i) {
				agrupaciones[j] = null;
				isOK = true;
				break;
			}
		}
		return isOK;
	}

	/**
	 * Borra un Integrante del array integrantes
	 *
	 * @param i <i>Posición del array</i>
	 * @return <ul>
	 * <li> true: si se ha podido borrar el Integrante con exito</li>
	 * <li> false: si no se ha podido borrar el Integrante con exito </li>
	 * </ul>
	 */
	public boolean eliminar_integrante(Integrante i) {
		boolean isOK = false;
		for (int j = 0; j < integrantes.length; j++) {
			if (integrantes[j] == i) {
				integrantes[j] = null;
				isOK = true;
				break;
			}
		}
		return isOK;
	}

	/**
	 * Ordenan las agrupaciones oficiales por puntos menor a mayor.
	 *
	 * @param agO <i>Array de AgrupacionOficial</i>
	 */
	public void ordenar_por_puntos_menor(AgrupacionOficial[] agO) {
		Arrays.sort(agO, new CompAgrupacionOficialPuntosMenor());
	}

	/**
	 * Ordenan las agrupaciones oficiales por puntos de mayor a menor.
	 *
	 * @param agO <i>Array de AgrupacionOficial</i>
	 */
	public void ordenar_por_puntos_mayor(AgrupacionOficial[] agO) {
		Arrays.sort(agO, new CompAgrupacionOficialPuntosMayor());
	}

	/**
	 * Ordena los objetos Integrante del array integrantes por nombre
	 */
	public void sortIntegranteName() {
		Arrays.sort(integrantes, new CompIntegranteNombre());
	}

	/**
	 * Ordena los objetos Agrupaciones del array agrupaciones por nombre
	 */
	public void ordenar_por_nombre() {
		Arrays.sort(agrupaciones, new CompNombreAgrupacion());
	}

	/**
	 * Ordena los objetos Agrupaciones del array agrupaciones por
	 * el nombre del autor
	 */
	public void ordenar_por_autor() {
		Arrays.sort(agrupaciones, new CompAgrupacionAutor());
	}

	/**
	 * Ordena los objetos Agrupaciones del array agrupaciones por
	 * el nombre del autor de la musica y el autor de la letra
	 */
	public void ordenar_por_autor_musica_letra() {
		Arrays.sort(agrupaciones, new CompAgrupacionAutorMyL());
	}

	/**
	 * Modifica el valor de los puntos de una AgrupacionOficial
	 *
	 * @param i <i>Posición del array</i>
	 * @param puntos <i>Nueva cantidad de puntos</i>
	 */
	public void asignarPuntos(AgrupacionOficial i, Integer puntos) {
		i.setPuntos(puntos);
	}

	/**
	 * Busca la posición una Agrupacion concreta del array agrupaciones, 
	 * en caso de no existir devuelve un null
	 *
	 * @param agrup <i>Agrupacion que buscar</i>
	 * @return posición en el array agrupaciones de la Agrupacion buscada
	 */
	public int buscarAgrupacion(Agrupacion agrup) {
		Integer ubi = null;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] == agrup) {
				ubi = i;
				break;
			}
		}
		return ubi;
	}

	/**
	 * Lista las agrupaciones del concurso dentro del array agrupaciones,
	 * siendo estas las que son instancias de AgrupacionOficial 
	 *
	 * @return array de AgrupacionOficial
	 */
	public AgrupacionOficial[] getAgrupacionesConcurso() {
		AgrupacionOficial[] aux = new AgrupacionOficial[agrupaciones.length];
		int contAux = 0;
		for (int i = 0; i < aux.length; i++) {
			if (agrupaciones[i] != null && agrupaciones[i] instanceof AgrupacionOficial) {
				aux[contAux++] = (AgrupacionOficial) agrupaciones[i];
			}
		}
		return aux;
	}

	/**
	 * Constructor del método toString con los atributos de COAC
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "\nCOAC " + Arrays.toString(agrupaciones);
	}
}
