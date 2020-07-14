package pe.edu.upeu.aa01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.aa01.entity.Usuario;
import pe.edu.upeu.aa01.service.UsuarioService;

@RestController
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/usuarios")
	public List<Usuario> readLis(){
		return usuarioService.readAll();
	}
	@GetMapping("/usuarios/{id}")
	public Usuario read(@PathVariable int id){
		return usuarioService.read(id);
	}
	@PostMapping("/usuario")
	public int create(@RequestBody Usuario user){
		return usuarioService.create(user);
	}
	@DeleteMapping("/delete/{id}")
	public int del(@PathVariable int id){
		return usuarioService.delete(id);
	}
	@PutMapping("/usuario/{id}")
	public int edit(@RequestBody Usuario user, @PathVariable int id){
		return usuarioService.edit(user);
	}
}
