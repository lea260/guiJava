package modelo;

import java.util.ArrayList;
import entidades.*;
import persistencia.FakeRepositorioPersona;
import persistencia.IPersona;

public class Persona {
	private int edad;
	private String nombre;

	private static int idsig = 1;

	public Persona(int edad, String nombre) throws Exception {
		super();
		if (edad < 0) {
			throw new Exception("La edad no puede ser negativa");
		}

		this.edad = edad;
		this.nombre = nombre;
		idsig++;
	}

	public Persona() throws Exception {
		this(0, "");
	}

	public ArrayList<PersonaDto> listar() {
		ArrayList<PersonaDto> lista = new ArrayList<PersonaDto>();
		IPersona rep = new FakeRepositorioPersona();
		lista = rep.listar();
		return lista;
	}

}
