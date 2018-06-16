package br.com.bicicletariojb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bicicletariojb.model.Bicicleta;
import br.com.bicicletariojb.model.dto.BicicletaDTO;
import br.com.bicicletariojb.repository.BicicletaRepository;

@Service
public class BicicletaService {

	@Autowired
	private BicicletaRepository bicicletaRespository;

	public BicicletaDTO find(Long id) {
		
		Optional<Bicicleta> bicicleta = bicicletaRespository.findById(id);
		
		return new BicicletaDTO(bicicleta.orElse(null));
	}

}
