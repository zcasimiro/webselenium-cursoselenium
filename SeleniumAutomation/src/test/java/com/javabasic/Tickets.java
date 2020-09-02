// EJERCICIO obtener otro constructor con argumento "Descuento".

package com.javabasic;

public class Tickets {
	//*******************Objetos en vase a la clase Tickets*****************
	int precioAdulto,edad;
	double precioNino ,precioEstudiante;//Descuento
	boolean estudiante=false;
	String costo;
	/**********************************CONSTRUCTORES********************/
	//*constructor es un método  especial de una clase que se llama automaticamente siempre que se declara 
	// un objeto de esa clase . Su h 
	
	public Tickets (int precioNormal, int edadPersona,boolean credencialEstudiante) { //instancias 
		precioAdulto = precioNormal;
		precioNino= precioNormal *(.85);
		precioEstudiante= precioNormal *(.5);
		costo = "Precio Normal";
		edad = edadPersona;
		estudiante = credencialEstudiante;
	}
	
	
	
	
	
	/*************************************************METHODOS**********************/
	
	public void CostoDia() {
		System.out.println("El costo Ticket"+costo);
	}
	public void precioAdulto() {
		System.out.println("Ticket Adulto $"+precioAdulto);
	}
	public void precioNino() {
		System.out.println("Ticket Nino :$" +precioNino);
	}
	public void precioEstudiante() {
		System.out.println("Ticket Estudiante: $"+precioEstudiante);
	}
	public void verificarcostoTicket() {
		if(estudiante==true) {
			System.out.println("Eres un ESTUDIANTE el precio de tu Ticket es :$"+precioEstudiante);
		}else if (edad>18) {
			System.out.println("Eres un ADULTO el precio de tu ticket es:$ "+precioAdulto);
		}else {
			System.out.println("Eres un NINO el precio de tu ticket es:$ "+precioNino);
		}
	}
	
	/************************************************************SOBRECARGA DE METODOS**********/
	
	public double sumarTicket() {
		double suma = precioAdulto + precioNino;
		System.out.println(suma);
		return suma;
		
	}
	
	public double sumarTicket(int descuento, int descuentoExtra) {
		double suma = (precioAdulto + precioNino) -descuento -descuentoExtra;
		System.out.println(suma);
		return suma;
		
	}
	
	public double sumarTicket(boolean descuento,boolean descuentoExtra) {
		double suma = (precioAdulto + precioNino) -30 -30;
		System.out.println(suma);
		return suma;
		
	}
	
	public double sumarTicket(boolean descuento,int descuentoExtra) {
		double suma = (precioAdulto + precioNino) -30 -descuentoExtra;
		System.out.println(suma);
		return suma;
		
	}
		   
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Tickets tickets =new Tickets (120,19,false); //objeto es Tickets 1.- referencia a un metodo
	
	tickets.CostoDia();
	tickets.precioAdulto();
	tickets.precioNino();
	tickets.precioEstudiante();
	
	tickets.sumarTicket(true,40);

	
	}

}
