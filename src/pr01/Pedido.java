package pr01;

import java.util.List;

public class Pedido {
	private int numero;
	private List<Producto> productos;
	private EstadoPedido estado;

	public Pedido(int numero) {
		this.numero = numero;
	}

	public void agregarProducto(List<Producto> productos) {

	}

	/*
	 * public double calcularTotal() {
	 * 
	 * }
	 */
	public int getNumero() {
		return this.numero;
	}

	public EstadoPedido getEstado() {
		return this.estado;
	}

	public void setEstado(EstadoPedido estado) {
		this.estado = estado;
	}

}
