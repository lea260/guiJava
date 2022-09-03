package persistencia;

import java.util.ArrayList;

import entidades.PerosonaDto;

public class Singleton {
	private static Singleton instancia = null;
	private ArrayList<PerosonaDto> listaP;

	private Singleton() {

	}

	public static Singleton getInstancia() {
		if (instancia == null) {
			instancia = new Singleton();
			instancia.listaP = new ArrayList<PerosonaDto>();
			instancia.listaP.add(new PerosonaDto(1, 25, "Juan"));
			instancia.listaP.add(new PerosonaDto(2, 66, "Pedro"));
			instancia.listaP.add(new PerosonaDto(1, 25, "Maria"));
			instancia.listaP.add(new PerosonaDto(1, 25, "Sofia"));

		}
		return instancia;
	}

}
