package com.curso.service;

import java.util.List;

import com.curso.model.Descuento;

public interface FacturaService {
	int descuentoProducto(String producto);
	List<Descuento> obtenerDescuentos();
}
