package com.computacion9.clase26;

import java.util.ArrayList;
import java.util.HashSet;

import com.computacion9.clase18.*;

public class Colecciones {

	public static HashSet<Categoria> categorias = new HashSet<Categoria>();
	public static HashSet<Cliente> clientes = new HashSet<Cliente>();
	public static HashSet<Venta> ventas = new HashSet<Venta>();
	public static HashSet<Producto> productos = new HashSet<Producto>();
	public static ArrayList<VentaProducto> ventaProductos = new ArrayList<VentaProducto>();

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente(1, "Jose Eduardo");
		Cliente cliente2 = new Cliente(2, "Westreberto");

		clientes.add(cliente1);
		clientes.add(cliente2);

		Categoria ratones = new Categoria(1, "Mouse/Ratones");
		Categoria almacenamiento = new Categoria(2, "Almacenamiento");

		categorias.add(ratones);
		categorias.add(almacenamiento);

		Producto prod1 = new Producto(1, "Mouse Logitech m185", 199.00d, 1);
		Producto prod2 = new Producto(2, "Mouse Microsoft Mobile 1850", 249.00d, 1);
		Producto prod3 = new Producto(3, "Kingston A400 480GB 2.5\"", 1599.00, 2);
		Producto prod4 = new Producto(4, "ADATA SU650 240GB 2.5\"", 999.00, 2);

		productos.add(prod1);
		productos.add(prod2);
		productos.add(prod3);
		productos.add(prod4);

		VentaProducto vp1 = new VentaProducto(1, 1, 2, 199.00d);
		VentaProducto vp2 = new VentaProducto(1, 4, 1, 999.00d);
		VentaProducto vp3 = new VentaProducto(1, 2, 1, 249.00d);
		VentaProducto vp4 = new VentaProducto(2, 2, 1, 249.00d);
		VentaProducto vp5 = new VentaProducto(2, 3, 2, 1599.00d);

		ventaProductos.add(vp1);
		ventaProductos.add(vp2);
		ventaProductos.add(vp3);
		ventaProductos.add(vp4);
		ventaProductos.add(vp5);

		Venta venta1 = new Venta(1, 1);
		Venta venta2 = new Venta(2, 2);

		ventas.add(venta1);
		ventas.add(venta2);

//		Venta ID: 9876, Fecha: 23/06/2020, Cliente: Bidkar
//		Producto: Audifonos Sony WX, Cantidad: 1, Precio: 3000, Subtotal: 3000
//		Producto: Audifonos Sony MDR, Cantidad: 1, Precio: 600, Subtotal: 600
//		SUBTOTAL: $3600.00, IVA: $576.00, TOTAL: $4176.00

		for (Venta venta : Colecciones.ventas) {
			System.out.println("Venta ID: " + venta.getId() + ", Fecha: " + venta.getFecha() + ", Cliente: "
					+ venta.getCliente().getNombre());
			double subtotalVenta = 0d;
			for (VentaProducto vp : venta.getVentaProductos()) {
				System.out.println("Producto: " + vp.getProducto().getNombre()
						+ ", Cantidad: " + vp.getCantidad()
						+ ", Precio: " + vp.getPrecio()
						+ ", Subtotal: " + vp.getSubtotal());
				subtotalVenta += vp.getSubtotal();
			}
			double iva = subtotalVenta*.16;
			System.out.println("SUBTOTAL: $" + subtotalVenta + ", IVA: $" + iva + ", TOTAL: $" + (subtotalVenta + iva));
		}

	}

}
