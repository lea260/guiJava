package modelo;

public class Persona {
	private int id;
	private int edad;
	private String nombre;

	public Persona(int id, int edad, String nombre) throws Exception {
		super();
		if (edad < 0) {
			throw new Exception("La edad no puede ser negativa");
		}
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
	}

}
