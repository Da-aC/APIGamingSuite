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

import co.edu.unicauca.APIVentas.model.usuario;
import co.edu.unicauca.APIVentas.service.IUsuarioService;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService service;
	@CrossOrigin(origins="https://gaming-suite.herokuapp.com")
	@PostMapping
	public ResponseEntity<?> create (@RequestBody usuario user){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(user));
	}
	@CrossOrigin(origins="https://gaming-suite.herokuapp.com")
	@GetMapping("/{usuarioNick}")
	public ResponseEntity<?> read (@PathVariable String usuarioNick){
		Optional<usuario> aux= service.findById(usuarioNick);
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
