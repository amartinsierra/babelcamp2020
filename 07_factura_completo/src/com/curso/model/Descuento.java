package com.curso.model;

public class Descuento {
	private int idDescuento;
	private String producto;
	private int descuento;
	public Descuento(int idDescuento, String producto, int descuento) {
		super();
		this.idDescuento = idDescuento;
		this.producto = producto;
		this.descuento = descuento;
	}
	public int getIdDescuento() {
		return idDescuento;
	}
	public void setIdDescuento(int idDescuento) {
		this.idDescuento = idDescuento;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
}
