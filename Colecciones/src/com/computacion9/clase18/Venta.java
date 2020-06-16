package com.computacion9.clase18;

import java.time.LocalDateTime;

public class Venta {
	private int id;
	private LocalDateTime fecha;
	private int cliente_id;
	
	public Venta(int id, int cliente_id) {
		super();
		this.id = id;
		this.cliente_id = cliente_id;
		this.fecha = LocalDateTime.now();
	}

	public int getId() {
		return id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public int getCliente_id() {
		return cliente_id;
	}
	
}