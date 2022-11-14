package co.edu.unicauca.APIVentas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.edu.unicauca.APIVentas.Repository.IProductoRepository;
import co.edu.unicauca.APIVentas.model.producto;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepository productoRepo;
	
	@Override
	public Iterable<producto> findAll() {
		return productoRepo.findAll();
	}

	@Override
	public Page<producto> findAll(Pageable pageable) {
		return productoRepo.findAll(pageable);
	}

	@Override
	public Optional<producto> findById(int id) {
		return productoRepo.findById(id);
	}

	@Override
	public producto save(producto prod) {
		return productoRepo.save(prod);
	}

	@Override
	public void deleteById(int id) {
		productoRepo.deleteById(id);
	}

}
