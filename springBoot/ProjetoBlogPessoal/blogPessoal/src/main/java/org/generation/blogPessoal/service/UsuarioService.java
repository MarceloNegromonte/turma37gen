package org.generation.blogPessoal.service;
//Usuario Repository é a camada que ja existia no projeto de ecommerce, porem dentro dela fizemos um
//findByusuario, atravé deste Method Query podemos implementar a consulta do login.
import java.nio.charset.Charset;
import java.util.Optional;
import org.apache.commons.codec.binary.Base64;

import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service //trata-se de um serviço
public class UsuarioService {

	@Autowired //injetando
	private UsuarioRepository repository;

	public Usuario cadastrarUsuario(Usuario usuario) { //metodo para cadastrar usuario
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); //criar um objeto encoder(exatamento o tipo que colocamos na classe de configuração)
	
		//regra de negocio referente a cadastrar usuario
		String senhaEnconder = encoder.encode(usuario.getSenha()); //criar uma variavel de senha, do tipo encoder, que vai receber a senha do usuario
		usuario.setSenha(senhaEnconder); //salva a senha encoder(encripitada) e salva
	
		return repository.save(usuario); //salva no repositorio
	}
	
	//regra de negocio para logar
	public Optional<UserLogin> logar(Optional<UserLogin> user) { //vai retornar para o usuario o user, nome, senha e token
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); //criar um objeto encoder
		Optional<Usuario> usuario = repository.findByUsuario(user.get().getUsuario()); //fazer a pesquisa pelo nome do usario
		
		if(usuario.isPresent()) {//se tiver algo dentro do objeto usuario, vai comparar a senha dada pela senha que tem
			if(encoder.matches(user.get().getSenha(), usuario.get().getSenha())) { //se for igual uma senha com a outra, vai entrar nesse if
				
				String auth = user.get().getUsuario() + ":" + user.get().getSenha(); //variavel tipo string nome auth, vai concatenar 2 informações, usuario e senha com : entre elas
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII"))); //array de byte, pega o encode codificado em base64 e dentro desse code ele receber a string auth e dentro da string tem o formato byte no formato USACCI
				String authHeader = "Basic " + new String(encodedAuth); //criando string de no autenticação head, e dentro dela passamos o prefixo basic e concatena com instacia de novo String recebendo (encodeAuth)
			
				user.get().setToken(authHeader); //pega o user. get e colocar a informação do authHeader
				user.get().setNome(usuario.get().getNome()); //acessa o user e colocar  que veio no usarName;;
			
				return user; //retorna o user
			}
		}
		return null; //se não entrar no if retorna um nulo
	}
}
