package pr01;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int numero;
	private List<Producto> productos;
	private EstadoPedido estado;

	public Pedido(int numero) {// constructor pedido
		this.numero = numero;
		this.productos = new ArrayList<>();
		this.estado = EstadoPedido.PENDIENTE;
	}

	public void agregarProducto(Producto p) {
		this.productos.add(p);
	}

	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < this.productos.size(); i++) {
			Producto p = this.productos.get(i);
			total += p.getPrecio();
		}

		return total;
	}

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
