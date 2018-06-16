package br.com.bicicletariojb.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bicicletariojb.model.dto.BicicletaDTO;
import br.com.bicicletariojb.service.BicicletaService;

@RestController
@RequestMapping("/bicicletas")
public class BicicletaResource {

	@Autowired
	private BicicletaService bicicletaService;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<BicicletaDTO> find(@PathVariable Long id){
		return ResponseEntity.ok().body(bicicletaService.find(id));
	}
}
