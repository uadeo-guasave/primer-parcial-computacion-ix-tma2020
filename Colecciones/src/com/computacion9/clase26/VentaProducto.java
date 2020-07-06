package com.computacion9.clase26;


public class VentaProducto extends com.computacion9.clase18.VentaProducto {
	
	private Producto producto;

	public VentaProducto(int venta_id, int producto_id, int cantidad, double precio) {
		super(venta_id, producto_id, cantidad, precio);
		
		for (Producto prod : Colecciones.productos) {
			if (producto_id == prod.getId()) {
				this.producto = prod;
				break;
			}
		}
		
	}
	
	public Producto getProducto() {
		return this.producto;
	}

}
