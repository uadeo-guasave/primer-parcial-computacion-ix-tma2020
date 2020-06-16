package com.computacion9.clase18;

public class VentaProducto {
	private int venta_id;
	private int producto_id;
	private int cantidad;
	private double precio;
	private double total;
	
	public VentaProducto(int venta_id, int producto_id, int cantidad, double precio) {
		super();
		this.venta_id = venta_id;
		this.producto_id = producto_id;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = this.cantidad * this.precio;
	}

	public int getVenta_id() {
		return venta_id;
	}

	public int getProducto_id() {
		return producto_id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public double getTotal() {
		return total;
	}
	
}
