package pe.edu.upeu.aa01.dao;

import java.util.List;

import pe.edu.upeu.aa01.entity.Usuario;

public interface UsuarioDao {
	
	//List<Map<String,Object>> readAll();
	List<Usuario> readAll();
	int create(Usuario user);
	int edit(Usuario user);
	int delete(int id);
	Usuario read(int id);
	
}
