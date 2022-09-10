
package persistencia;

import java.util.ArrayList;

import entidades.PersonaDto;

public interface IPersona {
	ArrayList<PersonaDto> listar();

	int crear();

	int eliminar();

	int actualizar();

}
