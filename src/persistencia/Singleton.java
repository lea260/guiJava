package persistencia;

import java.util.ArrayList;

import entidades.PersonaDto;

public class Singleton {
	private static Singleton instancia = null;
	private ArrayList<PersonaDto> listaP;

	private Singleton() {

	}

	public static Singleton getInstancia() {
		if (instancia == null) {
			instancia = new Singleton();
			instancia.listaP = new ArrayList<PersonaDto>();
			instancia.listaP.add(new PersonaDto(1, 25, "Juan"));
			instancia.listaP.add(new PersonaDto(2, 66, "Pedro"));
			instancia.listaP.add(new PersonaDto(1, 25, "Maria"));
			instancia.listaP.add(new PersonaDto(1, 25, "Sofia"));
		}
		return instancia;
	}

}
