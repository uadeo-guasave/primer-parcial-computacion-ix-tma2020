package com.computacion9.clase21;

import com.computacion9.clase18.*;

public class VentasMap {

	public static void main(String[] args) {
//		Venta ID: 9876, Fecha: 23/06/2020, Cliente: Bidkar
//		Producto: Audifonos Sony WX, Cantidad: 1, Precio: 3000, Subtotal: 3000
//		Producto: Audifonos Sony MDR, Cantidad: 1, Precio: 600, Subtotal: 600
//		SUBTOTAL: $3600.00, IVA: $576.00, TOTAL: $4176.00
//
//		Venta ID: 4523, Fecha: 25/06/2020, Cliente: Alfredo
//		Producto: Audifonos Sony WX, Cantidad: 1, Precio: 3000, Subtotal: 3000
//		Producto: Audifonos Sony MDR, Cantidad: 1, Precio: 600, Subtotal: 600
//		SUBTOTAL: $3600.00, IVA: $576.00, TOTAL: $4176.00
//		
//		Ventas
//			Clientes
//			Ventas_Productos
//				Productos
//					Categoria
//
//		HashMap<Venta, Cliente>
//		HashMap<Venta, HashSet<VentaProducto>>
//		HashMap<
		
//		Clientes
		Cliente cliente1 = new Cliente(1, "Jose Eduardo");
		Cliente cliente2 = new Cliente(2, "Westreberto");
		
//		Categorias
		Categoria ratones = new Categoria(1, "Mouse/Ratones");
		Categoria almacenamiento = new Categoria(2, "Almacenamiento");
		
//		Productos
		Producto raton1 = new Producto(1, "Mouse Logitech m185", 199.00d, 1);
		Producto raton2 = new Producto(2, "Mouse Microsoft Mobile 1850", 249.00d, 1);
		Producto ssd1 = new Producto(3, "Kingston A400 480GB 2.5\"", 1599.00, 2);
		Producto ssd2 = new Producto(4, "ADATA SU650 240GB 2.5\"", 999.00, 2);

//		Ventas
		Venta venta1 = new Venta(1, 1);
		Venta venta2 = new Venta(2, 2);
		
//		Ventas-Productos
		VentaProducto ventaProducto1 = new VentaProducto(1, 1, 2, 199.00d);
		VentaProducto ventaProducto2 = new VentaProducto(1, 4, 1, 999.00d);
		VentaProducto ventaProducto3 = new VentaProducto(2, 2, 1, 249.00d);
		VentaProducto ventaProducto4 = new VentaProducto(2, 3, 2, 1599.00d);
		
		
		
	}

}
