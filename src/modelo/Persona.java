package modelo;

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

}
