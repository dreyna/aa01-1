package pe.edu.upeu.aa01.service;

import java.util.List;

import pe.edu.upeu.aa01.entity.Usuario;


public interface UsuarioService {
	List<Usuario> readAll();
	int create(Usuario user);
	int edit(Usuario user);
	int delete(int id);
	Usuario read(int id);
	
}
