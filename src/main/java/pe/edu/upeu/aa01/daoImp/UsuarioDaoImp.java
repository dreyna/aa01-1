package pe.edu.upeu.aa01.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.aa01.dao.UsuarioDao;
import pe.edu.upeu.aa01.entity.Usuario;

@Repository
public class UsuarioDaoImp implements UsuarioDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select *from usuario", BeanPropertyRowMapper.newInstance(Usuario.class));
	}

	@Override
	public int create(Usuario user) {
		String sql = "INSERT INTO usuario (nomuser, clave) VALUES (?, ?)";
		return jdbcTemplate.update(sql, new Object[] {user.getNomuser(), user.getClave()});
	}

	@Override
	public int edit(Usuario user) {
		String sql = "UPDATE usuario SET nomuser = ?, clave=? WHERE (idusuario = ?);";
		return jdbcTemplate.update(sql, user.getNomuser(),user.getClave(),user.getIdusuario());
	}

	@Override
	public int delete(int id) {
		String sql = "DELETE FROM usuario WHERE (idusuario = ?)";
		return jdbcTemplate.update(sql, new Object[] {id});
	}

	@Override
	public Usuario read(int id) {
			String sql = "select *from usuario where idusuario=?";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, BeanPropertyRowMapper.newInstance(Usuario.class));
	}
	
}
