package br.com.bicicletariojb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bicicletariojb.model.Usuario;
import br.com.bicicletariojb.model.dto.UsuarioDTO;
import br.com.bicicletariojb.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private EnderecoService enderecoService;

	public UsuarioDTO find(Long id) {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		return new UsuarioDTO(usuario.orElse(null));
	}

	public Usuario save(Usuario usuario) {
		
		usuario.setId(null);
		
		enderecoService.save(usuario.getEndereco());
		usuarioRepository.save(usuario);
		
		return usuario;
	}
}
