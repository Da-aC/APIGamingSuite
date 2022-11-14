package co.edu.unicauca.APIVentas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.edu.unicauca.APIVentas.Repository.IPedidoRepository;
import co.edu.unicauca.APIVentas.model.pedido;

@Service
public class PedidoServiceImpl implements IPedidoService{
	
	@Autowired
	private IPedidoRepository pedidoRepo;
	
	@Override
	public Iterable<pedido> findAll() {
		return pedidoRepo.findAll();
	}

	@Override
	public Page<pedido> findAll(Pageable pageable) {
		return pedidoRepo.findAll(pageable);
	}

	@Override
	public Optional<pedido> findById(Integer id_pedido) {
		return pedidoRepo.findById(id_pedido);
	}

	@Override
	public pedido save(pedido pedido) {
		return pedidoRepo.save(pedido);
	}

}
