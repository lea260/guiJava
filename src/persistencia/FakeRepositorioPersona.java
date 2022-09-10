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
	public int crear() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualizar() {
		// TODO Auto-generated method stub
		return 0;
	}

}
