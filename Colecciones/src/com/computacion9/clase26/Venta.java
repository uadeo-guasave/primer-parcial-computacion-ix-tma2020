package com.computacion9.clase26;

import java.util.ArrayList;

import com.computacion9.clase18.*;

public class Venta extends com.computacion9.clase18.Venta {
	
	private Cliente cliente;
	private ArrayList<VentaProducto> ventaProductos = new ArrayList<VentaProducto>();

	public Venta(int id, int cliente_id) {
		super(id, cliente_id);
		
		for (Cliente cl : Colecciones.clientes) {
			if (this.getCliente_id() == cl.getId()) {
				this.cliente = cl;
				break;
			}
		}
		
		for (VentaProducto vp : Colecciones.ventaProductos) {
			if (this.getId() == vp.getVenta_id()) {
				this.ventaProductos.add(vp);
			}
		}
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public ArrayList<VentaProducto> getVentaProductos() {
		return this.ventaProductos;
	}
	
}
