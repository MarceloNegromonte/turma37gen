package org.generation.blogPessoal.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class BasicSegurityConfig extends WebSecurityConfigurerAdapter {

	//camada de configuração basica da segurança;
	
	@Autowired //injeção de dependencia
	private UserDetailsService userDetailService;
	
	@Override //sobreescrita 									//THROWS tratativa de erros 
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{ //pacote protegido do tipo vazio, recebe com parameto Authentication... nomeado como auth
		auth.userDetailsService(userDetailService); //chama o que recebemos, o auth, como parametro usamos o userdetailservice, e passamos o userdetailservice que injetamos.
	}
	
	@Bean //usar o @Bean em um método, e tornar a instância retornada pelo método como um objeto gerenciado pelo Spring (seja de uma classe própria ou de terceiros)
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(); //validação de login
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests() //serve para liberar caminhos dentro do controler, para que o client tenha acesso, sem precisar liberar chave token
		.antMatchers("/usuario/logar").permitAll() //libera endpoint para logar 
		.antMatchers("/usuario").permitAll() //libera endpoint para cadastrar
		.anyRequest().authenticated() //as demais requisições precisam de autenticação
		.and().httpBasic() //padrão basic para gerar chave token
		.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) //indica o tipo de sessão que iremos utilizar, STATELESS = não vai guardar sessão
		.and().cors() //para habilitar o cors(nao sei o que é)
		.and().csrf().disable(); //usado para desabilitar o csrf, configuração padrão e não personalizada.
	}
	
}
