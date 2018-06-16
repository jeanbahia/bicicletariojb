package br.com.bicicletariojb;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.bicicletariojb.builder.EnderecoBuilder;
import br.com.bicicletariojb.builder.UsuarioBuilder;
import br.com.bicicletariojb.model.Endereco;
import br.com.bicicletariojb.model.Usuario;
import br.com.bicicletariojb.model.enums.PerfilEnum;
import br.com.bicicletariojb.repository.EnderecoRepository;
import br.com.bicicletariojb.repository.UsuarioRepository;

@SpringBootApplication
public class BicicletariojbApplication implements CommandLineRunner{
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(BicicletariojbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		EnderecoBuilder enderecoBuilder = new EnderecoBuilder();
		
		Endereco endereco1 = enderecoBuilder.bairro("Vila Nova").numero("65").rua("Rua da Amargura").uf("RJ").build();
				
		enderecoBuilder = new EnderecoBuilder();
		
		Endereco endereco2 = enderecoBuilder.bairro("Senador Dantas").numero("17").rua("Rua da Felicidade").uf("RJ").build();
		
		enderecoRepository.saveAll(Arrays.asList(endereco1, endereco2));
		
		UsuarioBuilder usuarioBuilder = new UsuarioBuilder();
		
		Usuario usuario1 = usuarioBuilder.nome("Cascao da Silva").cpf("27275363720").perfil(PerfilEnum.PERFIL_ADMINISTRADOR).endereco(endereco2).build();
	
		usuarioBuilder = new UsuarioBuilder();
		
		Usuario usuario2 = usuarioBuilder.nome("Cebolinha Pereira").cpf("24086764440").perfil(PerfilEnum.PERFIL_CLIENTE).endereco(endereco1).build();
	
		usuarioBuilder = new UsuarioBuilder();
		
		Usuario usuario3 = usuarioBuilder.nome("Magali Barbosa").cpf("39773368190").perfil(PerfilEnum.PERFIL_CLIENTE).endereco(endereco1).build();
	
		usuarioRepository.saveAll(Arrays.asList(usuario1, usuario2, usuario3));
	}
}
