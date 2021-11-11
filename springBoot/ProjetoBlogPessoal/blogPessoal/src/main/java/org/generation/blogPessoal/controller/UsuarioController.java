package org.generation.blogPessoal.controller;

import java.util.Optional;

import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin(origins = "*", allowedHeaders = "*") //2 parametros, as origins todas e alloheadss é pra dizer que dentro do hears iremos aceitas qualquer informação
public class UsuarioController {

	
	@Autowired
	private UsuarioService usuarioService; //diferente das outas, essa classe injeta o usuario servico e não repository

	@PostMapping("/logar") //criação para logar
	public ResponseEntity<UserLogin> Autentication(@RequestBody Optional<UserLogin> user){ //optinal, pode vir como nao pode vir nada
		return usuarioService.logar(user).map(resp -> ResponseEntity.ok(resp)) //retorna usarioService 
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()); //se não tiver autorização retorna um httpstatus de sem autorização
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> post(@RequestBody Usuario usuario){ //recebe do tipo usuario pq tá cadastrando
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.cadastrarUsuario(usuario)); //criar e retorna par ao cliente o status criado e cadastra 
	}
}
