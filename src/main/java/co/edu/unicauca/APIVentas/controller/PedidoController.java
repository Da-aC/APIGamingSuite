package co.edu.unicauca.APIVentas.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.APIVentas.model.pedido;
import co.edu.unicauca.APIVentas.service.IPedidoService;

@RestController
@RequestMapping("api/pedidos")
public class PedidoController {
	
	@Autowired
	private IPedidoService service;
	@CrossOrigin(origins="https://gaming-suite.herokuapp.com")
	@PostMapping
	public ResponseEntity<?> create (@RequestBody pedido pedido){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(pedido));
	}
	@CrossOrigin(origins="https://gaming-suite.herokuapp.com")
	@GetMapping("/id")
	public ResponseEntity<?> read (@PathVariable Integer id_pedido){
		Optional<pedido> aux= service.findById(id_pedido);
		if (aux.isPresent())
			return ResponseEntity.ok(aux);
		else
			return ResponseEntity.notFound().build();
	}
	@CrossOrigin(origins="https://gaming-suite.herokuapp.com")
	@GetMapping
	public ResponseEntity<?> listar(){
		Optional<Iterable<pedido>> aux = Optional.ofNullable(service.findAll());
		if (aux.isPresent())
			return ResponseEntity.ok(aux);
		else
			return ResponseEntity.notFound().build();
	}	
}
