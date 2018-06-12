package br.com.bicicletariojb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bicicletariojb.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
