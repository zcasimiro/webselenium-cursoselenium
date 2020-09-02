// EJERCICIO obtener otro constructor con argumento "Descuento".
package com.javabasic;

public class Tickets_Ejercicio {

	//*******************Objetos en vase a la clase Tickets*****************
		int precioAdulto,edad;
		double precioNino ,precioEstudiante;//Descuento
		boolean estudiante=false;
		String costo;
		int descuento;
		/**********************************CONSTRUCTORES********************/
		//*constructor es un método  especial de una calse que se llama automaticamente siempre que se declara 
		// un objeto de esa clase . Su h 
		
		public Tickets_Ejercicio (int precioNormal, int edadPersona,boolean credencialEstudiante) { //instancias 
			precioAdulto = precioNormal;
			precioNino= precioNormal *(.15);
			precioEstudiante= precioNormal *(.5);
			costo = "Precio Normal";
			edad = edadPersona;
			estudiante = credencialEstudiante;
		}
		
		public Tickets_Ejercicio (int precioNormal, int edadPersona,boolean credencialEstudiante, int descuento) { //instancias 
			precioAdulto = precioNormal - descuento;
			precioNino= (precioNormal *(.85))- descuento;
			precioEstudiante= (precioNormal *(.5))- descuento;
			costo = "Precio Normal con Descuento";
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
		
		/*****************************************************************SOBRECARGA*/
		
		
		
//		public double sumarTicket() {
//			double suma = precioAdulto + precioNino;
//			return suma;
//		}
//		public double sumarTicket(int descuento ) {
//			double suma= (precioAdulto + precioNino) - descuento;
//			System.out.println(suma);
//			return suma;
//		}
		   
		
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Tickets_Ejercicio tickets =new Tickets_Ejercicio (100,15,true,20); //objeto es Tickets 1.- referencia a un metodo
		
		//tickets.CostoDia();
		tickets.verificarcostoTicket();
		tickets.precioAdulto();
		tickets.precioNino();
		tickets.precioEstudiante();
		

		
		}

	}


