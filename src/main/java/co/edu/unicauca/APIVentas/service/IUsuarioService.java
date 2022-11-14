package co.edu.unicauca.APIVentas.service;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.edu.unicauca.APIVentas.model.usuario;

public interface IUsuarioService {
	public Iterable<usuario> findAll();
	public Page<usuario> findAll(Pageable pageable);
	public Optional<usuario> findById(String usuarioNick);
	public usuario save(usuario user);
	public void deleteById(String UsuarioNick);
}
