package co.edu.unicauca.APIVentas.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")	
public class pedido implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pedido;
	@OneToOne
	@JoinColumn(name = "usuario_nick", referencedColumnName = "usuario_nick")
	private usuario usuario;
	
	@ManyToMany
	@JoinTable(name = "pedidos_productos",
			  joinColumns = @JoinColumn(name = "id_pedido", referencedColumnName = "id_pedido"),
			  inverseJoinColumns = @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
			)
	private List<producto> id_producto;
	
	private Long cantidad;

	public Integer getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(Integer id_pedido) {
		this.id_pedido = id_pedido;
	}


	public usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(usuario usuario) {
		this.usuario = usuario;
	}

	public List<producto> getId_producto() {
		return id_producto;
	}

	public void setId_producto(List<producto> id_producto) {
		this.id_producto = id_producto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

}
