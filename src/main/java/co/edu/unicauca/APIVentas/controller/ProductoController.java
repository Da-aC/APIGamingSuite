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

import co.edu.unicauca.APIVentas.model.producto;
import co.edu.unicauca.APIVentas.service.IProductoService;

@RestController
@RequestMapping("api/productos")
public class ProductoController {
	@Autowired
	private IProductoService service;
	@CrossOrigin(origins="https://gaming-suite.herokuapp.com")
	@PostMapping
	public ResponseEntity<?> create (@RequestBody producto prod){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(prod));
	}
	@CrossOrigin(origins="https://gaming-suite.herokuapp.com")
	@GetMapping("/{id}")
	public ResponseEntity<?> read (@PathVariable Integer id){
		Optional<producto> aux= service.findById(id);
		if (aux.isPresent())
			return ResponseEntity.ok(aux);
		else
			return ResponseEntity.notFound().build();
	}
	@CrossOrigin(origins="https://gaming-suite.herokuapp.com")
	@GetMapping
	public ResponseEntity<?> listar(){
		return ResponseEntity.ok(service.findAll());
	}
}
