package co.edu.unicauca.APIVentas.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class usuario {
	@Id
	private String usuario_nick;
	
	@OneToOne(optional=true)
	@JoinColumn(name = "id_pedido", referencedColumnName = "id_pedido")
	private pedido pedido;
	
	private String pass;
	private String rol;
	private String nombre;

	public usuario(String usuario_nick, String pass, String rol, String nombre) {
		this.usuario_nick = usuario_nick;
		this.pass = pass;
		this.rol = rol;
		this.nombre = nombre;
	}
	
	public usuario() {}


	public pedido getPedido() {
		return pedido;
	}

	public void setPedido(pedido pedido) {
		this.pedido = pedido;
	}

	public String getUsuario_nick() {
		return usuario_nick;
	}

	public void setUsuario_nick(String usuario_nick) {
		this.usuario_nick = usuario_nick;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



}
