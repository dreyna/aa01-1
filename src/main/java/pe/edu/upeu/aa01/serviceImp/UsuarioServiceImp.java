package pe.edu.upeu.aa01.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.aa01.dao.UsuarioDao;
import pe.edu.upeu.aa01.entity.Usuario;
import pe.edu.upeu.aa01.service.UsuarioService;
@Service
public class UsuarioServiceImp implements UsuarioService{
	@Autowired
	private UsuarioDao usuarioDao;
	@Override
	public List<Usuario>readAll() {
		// TODO Auto-generated method stub
		return usuarioDao.readAll();
	}
	@Override
	public int create(Usuario user) {
		// TODO Auto-generated method stub
		return usuarioDao.create(user);
	}
	@Override
	public int edit(Usuario user) {
		// TODO Auto-generated method stub
		return usuarioDao.edit(user);
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.delete(id);
	}
	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.read(id);
	}
	
}
