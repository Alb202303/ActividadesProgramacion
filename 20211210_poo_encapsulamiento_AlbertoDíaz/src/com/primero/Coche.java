package com.primero;

public class Coche {
	private int id;
	private String coche;
	private float precio;
	public Coche(int id, String coche, float precio) {
		super();
		this.id = id;
		this.coche = coche;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCoche() {
		return coche;
	}
	public void setCoche(String coche) {
		this.coche = coche;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
