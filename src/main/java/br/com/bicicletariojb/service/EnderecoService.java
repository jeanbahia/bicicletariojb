package br.com.bicicletariojb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bicicletariojb.model.Endereco;
import br.com.bicicletariojb.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	public Endereco save(Endereco endereco) {

		endereco.setId(null);

		enderecoRepository.save(endereco);

		return endereco;
	}
}
