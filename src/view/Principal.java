package view;

import java.util.Arrays;
import java.util.Iterator;

import controller.COAC;
import model.*;


public class Principal {
	
	static COAC coac = new COAC(20, 10);
	/**
	 * Método principal del programa
	 */
	public static void main(String[] args) {

		inicializacion();
		gestionPrograma();
	}

	/**
	 * Crea una serie de objetos y los incorpora al objeto de la clase COAC
	 */
	private static void inicializacion() {
		Chirigota ag1 = new Chirigota("los perros", "carlos", "ricardo", "pablo", "policias", 30, 4);
		coac.inscribir_agrupacion(ag1);
		Comparsa ag2 = new Comparsa("bna-Attack", "miguel", "andrés", "dad", "enfermeros", 90, "Nauto");
		coac.inscribir_agrupacion(ag2);
		Coro ag3 = new Coro("conguitos", "julio", "pedro", "enrique", "boxeadores", 10, 5, 8);
		coac.inscribir_agrupacion(ag3);
		Integrante in1 = new Integrante("Juan", 32, "Gines");
		coac.inscribir_integrante(in1);
		Integrante in2 = new Integrante("Gonzalo", 24, "Valladolid");
		coac.inscribir_integrante(in2);
		ag1.insertarIntegrante(in2);
		ag2.insertarIntegrante(in2);
		ag3.insertarIntegrante(in1);
		ag3.insertarIntegrante(in2);
	}

	/**
	 * Gestiona las opciones del menu principal
	 */
	private static void gestionPrograma() {
		int opc;
		do {
			mostrarMenuPrincipal();
			opc = Util.leerInt("Opción [0 - Salir] : ");
			switch (opc) {
			case 1 -> opcIntegrantes();
			case 2 -> addAgrupacion();
			case 3 -> opcDeleteAgrupacion();
			case 4 -> modAgrupacion();
			case 5 -> opcConcurso();
			case 6 -> listAll();
			case 7 -> listChirigotas();
			case 8 -> listCoros();
			case 9 -> listCuartetos();
			case 10 -> listComparsas();
			case 11 -> listRomanceros();
			case 12 -> sortAgrupName();
			case 13 -> sortAgrupAuthor();
			case 14 -> sortAgrupML();
			}
		} while (opc != 0);
		finDelPrograma();
	}

	/**
	 * Muestra el menu principal
	 */
	private static void mostrarMenuPrincipal() {
		Util.escribir("\n");
		Util.escribir("╔═══════════════════════════════════╗");
		Util.escribir("║      GESTION DE AGRUPACIONES      ║");
		Util.escribir("╚═══════════════════════════════════╝");
		Util.escribir("  1. Gestión de Participantes.");
		Util.escribir("  2. Añadir una agrupación.");
		Util.escribir("  3. Eliminar una agrupación.");
		Util.escribir("  4. Editar datos de una agrupación.");
		Util.escribir("  5. Gestión del Concurso.");
		Util.escribir("Listado de agrupaciones:");
		Util.escribir("  6. Listar todas.");
		Util.escribir("  7. Listar Chirigotas.");
		Util.escribir("  8. Listar Coros.");
		Util.escribir("  9. Listar Cuartetos.");
		Util.escribir(" 10. Listar Comparsas.");
		Util.escribir(" 11. Listar Romanceros.");
		Util.escribir("Ordenar el listado:");
		Util.escribir(" 12. Ordenar por el nombre.");
		Util.escribir(" 13. Ordenar por el autor.");
		Util.escribir(" 14. Ordenar por el autor de música/letra.");
	}

	/**
	 * Gestiona las opciones sobre la agregación de agrupaciones
	 */
	private static void addAgrupacion() {
		int opc;
		do {
			mostrarMenuAddAgrupaciones();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> addChirigota();
			case 2 -> addCoro();
			case 3 -> addComparsa();
			case 4 -> addCuarteto();
			case 5 -> addRomancero();
			}
		} while (opc != 0);
		gestionPrograma();
	}

	/**
	 * Muestra el menu para elegir el tipo de agrupacion que se quiere agregar.
	 */
	private static void mostrarMenuAddAgrupaciones() {
		Util.escribir("\n¿Que tipo de agrupación quieres añadir?");
		Util.escribir("\n 1. Chirigota");
		Util.escribir(" 2. Coro.");
		Util.escribir(" 3. Comparsa");
		Util.escribir(" 4. Cuartetos");
		Util.escribir(" 5. Romanceros");
	}

	/**
	 * Crea y agrega una agrupación del tipo Chirigota a la lista del controlador
	 */
	private static void addChirigota() {
		Chirigota ch = new Chirigota();
		String aux1;
		addDatosComunes(ch);
		addDatosOficiales(ch);
		aux1 = Util.leerString("Cuplés: ");
		if (aux1.length() > 0) {
			ch.setCuples(Integer.parseInt(aux1));
		}
		coac.inscribir_agrupacion(ch);

	}

	/**
	 * Crea y agrega una agrupación del tipo Coro a la lista del controlador
	 */
	private static void addCoro() {
		Coro co = new Coro();
		String aux1;
		addDatosComunes(co);
		addDatosOficiales(co);
		aux1 = Util.leerString("Número badurrias: ");
		if (aux1.length() > 0) {
			co.setBandurrias(Integer.parseInt(aux1));
		}
		aux1 = Util.leerString("Número guitarras: ");
		if (aux1.length() > 0) {
			co.setGuitarras(Integer.parseInt(aux1));
		}
		coac.inscribir_agrupacion(co);
	}

	/**
	 * Crea y agrega una agrupación del tipo Comparsa a la lista del controlador
	 */
	private static void addComparsa() {
		Comparsa com = new Comparsa();
		String aux1;
		addDatosComunes(com);
		addDatosOficiales(com);
		aux1 = Util.leerString("Empresa de atrezzo: ");
		if (aux1.length() > 0) {
			com.setEmpresaA(aux1);
		}
		coac.inscribir_agrupacion(com);
	}

	/**
	 * Crea y agrega una agrupación del tipo Cuarteto a la lista del controlador
	 */
	private static void addCuarteto() {
		Cuarteto cu = new Cuarteto();
		String aux1;
		addDatosComunes(cu);
		addDatosOficiales(cu);
		aux1 = Util.leerString("Miembros: ");
		if (aux1.toString().length() > 0) {
			cu.setMiembros(Integer.parseInt(aux1));
		}
		coac.inscribir_agrupacion(cu);
	}

	/**
	 * Crea y agrega una agrupación del tipo Romancero a la lista del controlador
	 */
	private static void addRomancero() {
		Romancero ro = new Romancero();
		String aux1;
		addDatosComunes(ro);
		aux1 = Util.leerString("Temática del cartelón: ");
		if (aux1.length() > 0) {
			ro.setTematicaC(aux1);
		}
		coac.inscribir_agrupacion(ro);
	}

	/**
	 * Método que agregar los datos comunes de una Agrupación
	 *
	 * @param agrupacion <i>Una Agrupación a la que se le añaden o modifican sus valores</i>
	 */
	private static void addDatosComunes(Agrupacion agrupacion) {
		String aux1;
		aux1 = Util.leerString("Nombre: ");
		if (aux1.length() > 0) {
			agrupacion.setNombre(aux1);
		}
		aux1 = Util.leerString("Autor: ");
		if (aux1.length() > 0) {
			agrupacion.setAutor(aux1);
		}
		aux1 = Util.leerString("Autor de la musica: ");
		if (aux1.length() > 0) {
			agrupacion.setAutorM(aux1);
		}
		aux1 = Util.leerString("Autor de la letra: ");
		if (aux1.length() > 0) {
			agrupacion.setAutorL(aux1);
		}
		aux1 = Util.leerString("Tipo de disfraz: ");
		if (aux1.length() > 0) {
			agrupacion.setTipo(aux1);
		}

	}

	/**
	 * Método que agregar los datos comunes de una AgrupaciónOficial
	 *
	 * @param agrupacion <i>Una Agrupación Oficial a la que se le añaden o modifican sus valores</i>
	 */
	private static void addDatosOficiales(AgrupacionOficial agrupacion) {
		String aux1;
		aux1 = Util.leerString("Puntos: ");
		if (aux1.length() > 0) {
			agrupacion.setPuntos(Integer.parseInt(aux1));
		}
	}

	/**
	 * Gestiona la elección y borrado de un objeto Agrupación que le dice el usuario
	 */
	private static void opcDeleteAgrupacion() {
		int opc;
		listAllNumber();
		opc = Util.leerInt("\n¿Qué agrupación quieres borrar? [0 - Volver] : ");
		if (opc != 0) {
			deleteAgrupacion(opc);
		}
	}

	/**
	 * Método que borra un objeto Agrupación
	 *
	 * @param opc <i>Selección de la lista de agrupaciones</i>
	 */
	private static void deleteAgrupacion(int opc) {
		for (int i = opc - 1; i < coac.getAgrupaciones().length; i++) {
			if (coac.getAgrupaciones(i) == null) {
				System.out.println("\nNo se ha podido realizar la operacion");
				String espera = Util.leerString("\n\nPulse Enter para continuar");
				break;
			} else {
				if (opc == coac.getAgrupaciones().length) {
					coac.setAgrupaciones(i, null);
				} else {
					coac.setAgrupaciones(i, coac.getAgrupaciones(i + 1));
				}
			}
		}
	}

	/**
	 * Muestra la lista de agrupaciones y espera a que el usuario seleccione una 
	 * de la lista y utiliza el método oportuno para la modificación de sus valores segun el tipo de Agrupación
	 */
	private static void modAgrupacion() {
		int opc;
		listAllNumber();
		opc = Util.leerInt("\nOpción [0 - Volver] : ");
		if (opc == 0) {
			gestionPrograma();
		} else {
			if (coac.getAgrupaciones(opc - 1) instanceof Chirigota) {
				modChirigota((Chirigota) coac.getAgrupaciones(opc - 1));
			} else {
				if (coac.getAgrupaciones(opc - 1) instanceof Coro) {
					modCoro((Coro) coac.getAgrupaciones(opc - 1));
				} else {
					if (coac.getAgrupaciones(opc - 1) instanceof Comparsa) {
						modComparsa((Comparsa) coac.getAgrupaciones(opc - 1));
					} else {
						if (coac.getAgrupaciones(opc - 1) instanceof Cuarteto) {
							modCuarteto((Cuarteto) coac.getAgrupaciones(opc - 1));
						} else {
							if (coac.getAgrupaciones(opc - 1) instanceof Romancero) {
								modRomancero((Romancero) coac.getAgrupaciones(opc - 1));
							}
						}
					}
				}
			}
			System.out.println("\nSe ha podido realizar la operacion con exito");
			String espera = Util.leerString("\n\nPulse Enter para continuar");
		}
	}

	/**
	 * Modifica un objeto del tipo Chirigota
	 *
	 * @param ch <i>Chirigota</i>
	 */
	private static void modChirigota(Chirigota ch) {
		String aux1;
		addDatosComunes(ch);
		addDatosOficiales(ch);
		aux1 = Util.leerString("Cuplés: ");
		if (aux1.length() > 0) {
			ch.setCuples(Integer.parseInt(aux1));
		}
	}

	/**
	 * Modifica un objeto del tipo Coro
	 *
	 * @param co <i>Coro</i>
	 */
	private static void modCoro(Coro co) {
		String aux1;
		addDatosComunes(co);
		addDatosOficiales(co);
		aux1 = Util.leerString("Número badurrias: ");
		if (aux1.length() > 0) {
			co.setBandurrias(Integer.parseInt(aux1));
		}
		aux1 = Util.leerString("Número guitarras: ");
		if (aux1.length() > 0) {
			co.setGuitarras(Integer.parseInt(aux1));
		}
	}

	/**
	 * Modifica un objeto del tipo Comparsa
	 *
	 * @param com <i>Comparsa</i>
	 */
	private static void modComparsa(Comparsa com) {
		String aux1;
		addDatosComunes(com);
		addDatosOficiales(com);
		aux1 = Util.leerString("Empresa de atrezzo: ");
		if (aux1.length() > 0) {
			com.setEmpresaA(aux1);
		}
	}

	/**
	 * Modifica un objeto del tipo Cuarteto
	 *
	 * @param cu <i>Cuarteto</i>
	 */
	private static void modCuarteto(Cuarteto cu) {
		String aux1;
		addDatosComunes(cu);
		addDatosOficiales(cu);
		aux1 = Util.leerString("Miembros: ");
		if (aux1.toString().length() > 0) {
			cu.setMiembros(Integer.parseInt(aux1));
		}
	}

	/**
	 * Modifica un objeto del tipo Cuarteto
	 *
	 * @param ro <i>Romancero</i>
	 */
	private static void modRomancero(Romancero ro) {
		String aux1;
		addDatosComunes(ro);
		aux1 = Util.leerString("Temática del cartelón: ");
		if (aux1.length() > 0) {
			ro.setTematicaC(aux1);
		}
	}

	/**
	 * Gestiona las opciones del menu concurso
	 */
	private static void opcConcurso() {
		int opc;
		do {
			mostrarMenuConcurso();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> falla();
			case 2 -> contestType();
			case 3 -> singPresentation();
			case 4 -> modPoints();
			case 5 -> listAllContest();
			case 6 -> listAllContestChirigotas();
			case 7 -> listAllContestCoros();
			case 8 -> listAllContestCuartetos();
			case 9 -> listAllContestComparsas();
			case 10 -> sortContestPoints();
			case 11 -> sortContestName();
			case 12 -> sortContestAuthor();
			case 13 -> sortContestAuthorMyL();
			}
		} while (opc != 0);
	}

	/**
	 * Muestra el menu del concurso
	 */
	private static void mostrarMenuConcurso() {
		Util.escribir("\n");
		Util.escribir("┌──────────────────────┐");
		Util.escribir("│ GESTION DEL CONCURSO │");
		Util.escribir("└──────────────────────┘");
		Util.escribir("Concurso:");
		Util.escribir("  1. Va camino del Falla.");
		Util.escribir("  2. Hacen el Tipo.");
		Util.escribir("  3. Canta la Presentación.");
		Util.escribir("  4. Asignar puntos.");
		Util.escribir("Listado de agrupaciones participantes:");
		Util.escribir("  5. Listar todos.");
		Util.escribir("  6. Listar Chirigotas.");
		Util.escribir("  7. Listar Coros.");
		Util.escribir("  8. Listar Cuartetos.");
		Util.escribir("  9. Listar Comparsas.");
		Util.escribir("Ordenación del listado:");
		Util.escribir(" 10. Ordenar por puntos.");
		Util.escribir(" 11. Ordenar por el nombre.");
		Util.escribir(" 12. Ordenar por el autor.");
		Util.escribir(" 13. Ordenar por autor de música/letra.");
	}

	/**
	 * Muestra por pantalla todas las Agrupaciones registradas
	 */
	private static void listAll() {
		Agrupacion[] aux = coac.getAgrupaciones();
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null) {
				System.out.print("\n" + aux[i]);
			}
		}
	}

	/**
	 * Muestra por pantalla todas las Agrupaciones registradas numerandolas
	 */
	private static void listAllNumber() {
		Agrupacion[] aux = coac.getAgrupaciones();
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null) {
				System.out.print("\n" + (i + 1) + ".-" + aux[i]);
			}
		}
	}

	/**
	 * Muestra por pantalla todas las AgrupacionesOficiales registradas
	 */
	private static void listAllContest() {
		Agrupacion[] aux = coac.getAgrupaciones();
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null && aux[i] instanceof AgrupacionOficial) {
				System.out.print("\n" + aux[i]);
			}
		}
	}

	/**
	 * Muestra por pantalla todas las AgrupacionesOficiales registradas numerandolas
	 */
	private static void listAllContestNumber() {
		Agrupacion[] aux = coac.getAgrupaciones();
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null && aux[i] instanceof AgrupacionOficial) {
				System.out.print("\n" + (i + 1) + ".-" + aux[i]);
			}
		}
	}

	/**
	 * Permite al Usuario elegir una AgrupacionOficial, que ejecutará el método "caminitoDelFalla"
	 */
	private static void falla() {
		listAllContestNumber();
		AgrupacionOficial[] aux = coac.getAgrupacionesConcurso();
		System.out.println(aux);
		int opc;
		opc = Util.leerInt("\nOpción [0 - Volver] : ");
		if (opc == 0) {
		} else {
			System.out.println(aux[opc - 1].caminitoDelFalla());
		}
	}

	/**
	 * Permite al Usuario elegir una AgrupacionOficial, que ejecutará el método "hacerTipo"
	 */
	private static void contestType() {
		listAllContestNumber();
		AgrupacionOficial[] aux = coac.getAgrupacionesConcurso();
		int opc;
		opc = Util.leerInt("\nOpción [0 - Volver] : ");
		if (opc == 0) {
		} else {
			System.out.println(aux[opc - 1].hacerTipo());
		}
	}

	/**
	 * Permite al Usuario elegir una AgrupacionOficial, que ejecutará el método "cantarPresentacion"
	 */
	private static void singPresentation() {
		listAllContestNumber();
		AgrupacionOficial[] aux = coac.getAgrupacionesConcurso();
		int opc;
		opc = Util.leerInt("\n\nOpción [0 - Volver] : ");
		if (opc == 0) {
		} else {
			System.out.println(aux[opc - 1].cantarPresentacion());
		}
	}

	/**
	 * Modifica los puntos de una AgrupaciónOficial
	 */
	private static void modPoints() {
		listAllContestNumber();
		AgrupacionOficial[] aux = coac.getAgrupacionesConcurso();
		int opc;
		opc = Util.leerInt("\n\n¿A qué agrupación vas a asignar puntos? [0 - Volver] : ");
		Integer puntos = Util.leerInt("\n¿Cuantos puntos? : ");
		if (opc == 0) {
		} else {
			coac.asignarPuntos((AgrupacionOficial) coac.getAgrupaciones(coac.buscarAgrupacion(aux[opc - 1])), puntos);
			System.out.println("\nSe ha podido realizar la operacion con exito");
			String espera = Util.leerString("\n\nPulse Enter para continuar");
		}
	}

	/**
	 * Muestra por pantalla todas las Chirigotas registradas
	 */
	private static void listAllContestChirigotas() {
		Agrupacion[] aux = coac.getAgrupaciones();
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null && aux[i] instanceof Chirigota) {
				System.out.print("\n" + aux[i]);
			}
		}
	}

	/**
	 * Muestra por pantalla todas las Coros registradas
	 */
	private static void listAllContestCoros() {
		Agrupacion[] aux = coac.getAgrupaciones();
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null && aux[i] instanceof Coro) {
				System.out.print("\n" + aux[i]);
			}
		}
	}

	/**
	 * Muestra por pantalla todas las Comparsas registradas
	 */
	private static void listAllContestComparsas() {
		Agrupacion[] aux = coac.getAgrupaciones();
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null && aux[i] instanceof Comparsa) {
				System.out.print("\n" + aux[i]);
			}
		}
	}

	/**
	 * Muestra por pantalla todas las Cuarteto registradas
	 */
	private static void listAllContestCuartetos() {
		Agrupacion[] aux = coac.getAgrupaciones();
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null && aux[i] instanceof Cuarteto) {
				System.out.print("\n" + aux[i]);
			}
		}
	}

	/**
	 * Ordena según la opción que introduce el usuario las AgrupacionesOficiales por la cantidad de puntos
	 */
	private static void sortContestPoints() {
		int opc;
		do {
			mostrarMenuComparadorPuntos();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> sortContestPointsHigher();
			case 2 -> sortContestPointsLower();

			}
		} while (opc != 0);
		mostrarMenuConcurso();
	}

	/**
	 * Muestra el menu para elegir el tipo de ordenación por puntos.
	 */
	private static void mostrarMenuComparadorPuntos() {
		Util.escribir("\n\n¿De que manera quieres ordenar?");
		Util.escribir("\n 1. Mayor a menor");
		Util.escribir(" 2. Menor a mayor");
	}

	/**
	 * Ordena y muestra por pantalla las AgrupacionesOficiales de menor a mayor
	 */
	private static void sortContestPointsLower() {
		AgrupacionOficial[] aux = coac.getAgrupacionesConcurso();
		coac.ordenar_por_puntos_menor(aux);
		listAllContest(aux);
		String espera = Util.leerString("\n\nPulse Enter para continuar");
	}

	/**
	 * Ordena y muestra por pantalla las AgrupacionesOficiales de mayor a menor
	 */
	private static void sortContestPointsHigher() {
		AgrupacionOficial[] aux = coac.getAgrupacionesConcurso();
		coac.ordenar_por_puntos_mayor(aux);
		listAllContest(aux);
		String espera = Util.leerString("\n\nPulse Enter para continuar");
	}

	/**
	 * Muestra por pantalla uno a uno todas los elementos de la AgrupaciónOficial
	 *
	 * @param aux <i>Array de AgrupacionesOficiales</i>
	 */
	private static void listAllContest(AgrupacionOficial[] aux) {
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null && aux[i] instanceof AgrupacionOficial) {
				System.out.print("\n" + aux[i]);
			}
		}
	}

	/**
	 * Ordena y muestra por pantalla las AgrupacionesOficiales según el nombre de la agrupación
	 */
	private static void sortContestName() {
		coac.ordenar_por_nombre();
		listAllContest();
		String espera = Util.leerString("\n\nPulse Enter para continuar");
	}

	/**
	 * Ordena y muestra por pantalla las AgrupacionesOficiales según el nombre del autor
	 */
	private static void sortContestAuthor() {
		coac.ordenar_por_autor();
		listAllContest();
		String espera = Util.leerString("\n\nPulse Enter para continuar");
	}

	/**
	 * Ordena y muestra por pantalla las AgrupacionesOficiales según el nombre del autor de la musica y de la letra
	 */
	private static void sortContestAuthorMyL() {
		coac.ordenar_por_autor_musica_letra();
		listAllContest();
		String espera = Util.leerString("\n\nPulse Enter para continuar");
	}

	/**
	 * Muestra por pantalla todas las Chirigotas
	 */
	private static void listChirigotas() {
		Agrupacion[] aux = coac.getAgrupaciones();
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null && aux[i] instanceof Chirigota) {
				System.out.print("\n" + aux[i]);
			}
		}
	}

	/**
	 * Muestra por pantalla todas los Coros
	 */
	private static void listCoros() {
		Agrupacion[] aux = coac.getAgrupaciones();
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null && aux[i] instanceof Coro) {
				System.out.print("\n" + aux[i]);
			}
		}
	}

	/**
	 * Muestra por pantalla todas las Comparsas
	 */
	private static void listComparsas() {
		Agrupacion[] aux = coac.getAgrupaciones();
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null && aux[i] instanceof Comparsa) {
				System.out.print("\n" + aux[i]);
			}
		}
	}

	/**
	 * Muestra por pantalla todas los Cuartetos
	 */
	private static void listCuartetos() {
		Agrupacion[] aux = coac.getAgrupaciones();
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null && aux[i] instanceof Cuarteto) {
				System.out.print("\n" + aux[i]);
			}
		}
	}

	/**
	 * Muestra por pantalla todas los Romanceros
	 */
	private static void listRomanceros() {
		Agrupacion[] aux = coac.getAgrupaciones();
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null && aux[i] instanceof Romancero) {
				System.out.print("\n" + aux[i]);
			}
		}
	}

	/**
	 * Gestiona las opciones del menu de los integrantes
	 */
	private static void opcIntegrantes() {
		int opc;
		do {
			mostrarMenuIntegrantes();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> addIntegrante();
			case 2 -> opcDeleteIntegrante();
			case 3 -> modIntegrante();
			case 4 -> listIntegrantes();
			case 5 -> listAgrupacionIntegrante();
			case 6 -> sortIntName();
			}
		} while (opc != 0);
		gestionPrograma();
	}

	/**
	 * Muestra el menu de los integrantes.
	 */
	private static void mostrarMenuIntegrantes() {
		Util.escribir("\n");
		Util.escribir("┌──────────────────────────┐");
		Util.escribir("│ GESTION DE PARTICIPANTES │");
		Util.escribir("└──────────────────────────┘");
		Util.escribir("  1. Añadir un participante.");
		Util.escribir("  2. Borrar un participante.");
		Util.escribir("  3. Editar los datos de un participante.");
		Util.escribir("  4. Listar todos los participantes.");
		Util.escribir("  5. Listar agrupaciones donde es integrante.");
		Util.escribir("  6. Ordenar por el nombre.");
	}

	/**
	 * Añade un objeto del tipo Intregrante a la lista del controlador
	 */
	private static void addIntegrante() {
		Integrante in = new Integrante();
		addDatosIntegrantes(in);
		coac.inscribir_integrante(in);
	}

	/**
	 * Añade o modifica datos del objeto del tipo integrante
	 *
	 * @param in <i>Integrante</i>
	 */
	private static void addDatosIntegrantes(Integrante in) {
		String aux1;
		aux1 = Util.leerString("Nombre: ");
		if (aux1.length() > 0) {
			in.setNombre(aux1);
		}
		aux1 = Util.leerString("Edad: ");
		if (aux1.length() > 0) {
			in.setEdad(Integer.parseInt(aux1));
		}
		aux1 = Util.leerString("Localidad: ");
		if (aux1.length() > 0) {
			in.setLocalidad(aux1);
		}
		listAllContestNumber();
		aux1 = Util.leerString("\n\n¿A que Agrupación Oficial pertenece? [Respuesta en blanco = Ninguna]: ");
		if (aux1.length() > 0) {
			AgrupacionOficial agAux;
			agAux = (AgrupacionOficial) coac.getAgrupaciones(Integer.parseInt(aux1));
			agAux.insertarIntegrante(in);
			aux1 = Util.leerString("\n¿Pertenece a alguna otra agrupación? [Y/N]: ");
			while (aux1.equalsIgnoreCase("y")) {
				listAllContestNumber();
				aux1 = Util.leerString("\n¿A que Agrupación Oficial pertenece? [Respuesta en blanco = Ninguna]: ");
				if (aux1.length() > 0) {
					agAux = (AgrupacionOficial) coac.getAgrupaciones(Integer.parseInt(aux1));
					agAux.insertarIntegrante(in);
				}
			}
		}
	}

	/**
	 * Gestiona la elección y borrado de un objeto Integrante que elije el usuario
	 */
	private static void opcDeleteIntegrante() {
		int opc;
		listIntegrantesNumber();
		opc = Util.leerInt("\n¿Qué integrante quieres borrar? [0 - Volver] : ");
		if (opc != 0) {
			deleteIntegrante(opc);
		}
	}

	/**
	 * Borra un integrante de la lista de integrantes
	 *
	 * @param opc <i>Selección de la lista de integrantes</i>
	 */
	private static void deleteIntegrante(int opc) {
		for (int i = opc - 1; i < coac.getAgrupaciones().length; i++) {
			if (coac.getIntegrantes(i) == null) {
				System.out.println("\nNo se ha podido realizar la operacion");
				String espera = Util.leerString("\n\nPulse Enter para continuar");
				break;
			} else {
				if (opc == coac.getIntegrantes().length) {
					coac.setIntegrantes(i, null);
				} else {
					coac.setIntegrantes(i, coac.getIntegrantes(i + 1));
				}
			}
		}
	}

	/**
	 * Modifica el valor del integrante que sea seleccionado por el usuario
	 */
	private static void modIntegrante() {
		listIntegrantesNumber();
		Integrante[] aux = coac.getIntegrantes();
		int opc;
		opc = Util.leerInt("\n¿A qué integrante quieres modificar los datos? [0 - Volver] : ");
		if (opc == 0) {
		} else {
			addDatosIntegrantes(coac.getIntegrantes(opc - 1));
			System.out.println("\nSe ha podido realizar la operacion con exito");
			String espera = Util.leerString("\n\nPulse Enter para continuar");
		}
	}

	/**
	 * Muestra por pantalla la información de todos los integrantes
	 */
	private static void listIntegrantes() {
		Integrante[] aux = coac.getIntegrantes();
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null) {
				System.out.print("\n" + aux[i]);
			}
		}
	}

	/**
	 * Muestra por pantalla de manera numerada la información de todos los integrantes
	 */
	private static void listIntegrantesNumber() {
		Integrante[] aux = coac.getIntegrantes();
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null) {
				System.out.print("\n" + (i + 1) + ".-" + aux[i]);
			}
		}
	}

	/**
	 * Muestra por pantalla la lista de las agrupaciones a las que pertenece un Integrante
	 */
	private static void listAgrupacionIntegrante() {
		listIntegrantesNumber();
		Integrante aux;
		AgrupacionOficial[] arrayAgConcurso;
		int opc;
		opc = Util.leerInt("\n\n¿De que integrante quieres ver las agrupaciones a las que pertenece? [0 - Volver] : ");
		if (opc == 0) {
		} else {
			aux = coac.getIntegrantes(opc - 1);
			arrayAgConcurso = coac.getAgrupacionesConcurso();
			System.out.println("\nEl integrante " + opc + " forma parte de las siguientes agrupaciones oficiales: \n");
			for (int i = 0; i < arrayAgConcurso.length; i++) {
				if (arrayAgConcurso[i] != null) {
					for (int j = 0; j < arrayAgConcurso[i].getIntegrantes().length; j++) {
						if (arrayAgConcurso[i].getIntegrantes(j) == aux) {
							System.out.print("\n" + arrayAgConcurso[i]);
						}
					}
				} else {
					break;
				}
			}
			String espera = Util.leerString("\n\nPulse Enter para continuar");
		}
	}

	/**
	 * Ordena y muestra por pantalla los Integrantes según el nombre del autor
	 */
	private static void sortIntName() {
		coac.sortIntegranteName();
		listIntegrantes();
		String espera = Util.leerString("\n\nPulse Enter para continuar");
	}

	/**
	 * Ordena y muestra por pantalla las AgrupacionesOficiales según el nombre del autor de la musica y de la letra
	 */
	private static void sortAgrupML() {
		coac.ordenar_por_autor_musica_letra();
		listAll();
		String espera = Util.leerString("\n\nPulse Enter para continuar");
	}

	/**
	 * Ordena y muestra por pantalla las AgrupacionesOficiales según el nombre del autor
	 */
	private static void sortAgrupAuthor() {
		coac.ordenar_por_autor();
		listAll();
		String espera = Util.leerString("\n\nPulse Enter para continuar");
	}

	/**
	 * Ordena y muestra por pantalla las Agrupaciones según el nombre de la agrupación
	 */
	private static void sortAgrupName() {
		coac.ordenar_por_nombre();
		listAll();
		String espera = Util.leerString("\n\nPulse Enter para continuar");
	}

	/**
	 * Finaliza el programa
	 */
	private static void finDelPrograma() {
		Util.escribir("\nFin del programa.");
		System.exit(0);
	}
}
