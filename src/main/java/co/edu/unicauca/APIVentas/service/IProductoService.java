package co.edu.unicauca.APIVentas.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.edu.unicauca.APIVentas.model.producto;

public interface IProductoService {
	public Iterable<producto> findAll();
	public Page<producto> findAll(Pageable pageable);
	public Optional<producto> findById(int id);
	public producto save(producto prod);
	public void deleteById(int id);
}
