package persistencia;

import java.util.ArrayList;

import entidades.PersonaDto;

public class FakeRepositorioPersona implements IPersona {

	@Override
	public ArrayList<PersonaDto> listar() {
		// TODO Auto-generated method stub
		ArrayList<PersonaDto> lista = new ArrayList<PersonaDto>();
		Singleton sin = Singleton.getInstancia();
		lista = sin.listarP();
		return lista;
	}

	@Override
	public int crear(PersonaDto persona) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizar(PersonaDto persona) {
		// TODO Auto-generated method stub
		return false;
	}

}
