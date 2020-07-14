package pe.edu.upeu.aa01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.aa01.dao.UsuarioDao;
import pe.edu.upeu.aa01.entity.Usuario;

@SpringBootTest
class Aa011ApplicationTests {
	@Autowired
	private UsuarioDao usuarioDao;
	@Test
	void contextLoads() {
		//usuarioDao.readAll();
		usuarioDao.edit(new Usuario(8,"Mijail3030","2000002"));
	}
	
	
}
