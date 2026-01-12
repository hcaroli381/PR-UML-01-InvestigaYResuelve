package pr01;

public class Main {
	public void main() {
		// declaracion de variables
		Pedido pedido1 = new Pedido(1);
		Producto teclado = new Producto("Teclado", 25.50);
		Producto raton = new Producto("Ratón", 15.00);

		// añadimos al pedido los productos
		pedido1.agregarProducto(teclado);
		pedido1.agregarProducto(raton);

		// mostramos por pantalla numero, estado y total
		System.out.printf("El numero de pedido es : %d\n", pedido1.getNumero());
		System.out.printf("El estado actual del pedido es : %s\n", pedido1.getEstado());
		System.out.printf("El total del pedido es : %.2f€\n", pedido1.calcularTotal());

		// cambiamos el pedido a enviado y mostramos por pantalla
		pedido1.setEstado(EstadoPedido.ENVIADO);
		System.out.printf("Ahora, el estado actual del pedido es : %s\n", pedido1.getEstado());
	}

	public static void main(String[] args) {
		new Main().main();
	}

}
