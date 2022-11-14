package co.edu.unicauca.APIVentas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unicauca.APIVentas.model.pedido;
@Repository
public interface IPedidoRepository extends JpaRepository<pedido, Integer >{

}
