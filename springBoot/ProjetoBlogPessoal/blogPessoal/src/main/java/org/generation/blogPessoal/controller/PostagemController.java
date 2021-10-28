package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //informa para o String que trata de uma classe controladora
@RequestMapping("/postagem") //informa qual a URI a classe será acessada
@CrossOrigin("*") //informar que a classe vai aceitar requisições de qualquer origem
public class PostagemController {

	@Autowired //garante que todos os serviços da inteface postagem repository, seja acessado a partir do controller
	private PostagemRepository repository; //injetando a classe repositorio dentro do controller e da o nome de repository

	@GetMapping //sempre que vir uma requisição externa, atraves da uri postagem, se for o metodo get, dispara esse metodo
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
}
