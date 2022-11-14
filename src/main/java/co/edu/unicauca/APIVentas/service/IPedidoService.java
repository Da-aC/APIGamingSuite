package co.edu.unicauca.APIVentas.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.edu.unicauca.APIVentas.model.pedido;

public interface IPedidoService {
	public Iterable<pedido> findAll();
	public Page<pedido> findAll(Pageable pageable);
	public Optional<pedido> findById(Integer id_pedido);
	public pedido save(pedido pedido);
}
