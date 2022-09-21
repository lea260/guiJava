package modelo;

import java.util.ArrayList;

import entidades.PersonaDto;
import persistencia.FakeRepositorioPersona;
import persistencia.IPersona;

public class Persona {
	private int id;
	private int edad;
	private String nombre;

	public Persona(int edad, String nombre) throws Exception {
		super();
		if (edad < 0) {
			throw new Exception("La edad no puede ser negativa");
		}

		this.edad = edad;
		this.nombre = nombre;

	}

	public Persona() throws Exception {
		this(0, "");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<PersonaDto> listar() {
		ArrayList<PersonaDto> lista = new ArrayList<PersonaDto>();
		IPersona rep = new FakeRepositorioPersona();
		lista = rep.listar();
		return lista;
	}

	public int crear() {
		// TODO Auto-generated method stub
		IPersona rep = new FakeRepositorioPersona();
		int id = rep.crear(this.getDto());
		return id;
	}

	private PersonaDto getDto() {
		// TODO Auto-generated method stub
		PersonaDto dto = new PersonaDto(this.id, edad, nombre);
		return dto;
	}

	public boolean actualizar() {
		// TODO Auto-generated method stub
		IPersona rep = new FakeRepositorioPersona();
		boolean resultado = rep.actualizar(this.getDto());
		return resultado;
	}

}
