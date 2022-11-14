package co.edu.unicauca.APIVentas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unicauca.APIVentas.model.producto;

@Repository
public interface IProductoRepository extends JpaRepository<producto, Integer>{

}
