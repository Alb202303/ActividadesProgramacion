package com.compra;

import com.primero.Coche;

public class Comprar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche coche1= new Coche (1, "Audi", 16000f);
		Coche coche2= new Coche (2, "Skoda", 17000f);
		Coche coche3= new Coche (3, "Nissan", 18000f);
		Coche coche4= new Coche (4, "Toyota", 19000f);
		
		float precio3= coche3.getPrecio();
		
		System.out.println("El precio del tercer coche es "+precio3);

	}

}
