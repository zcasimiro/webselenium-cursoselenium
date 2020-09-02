package com.javabasic;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int velocidad =50;
		int limiteVelocidad=70;
		
////		if(velocidad >limiteVelocidad) {
////			System.out.println("Multa");
////		}
//		//IF ELSE
//		if(velocidad>limiteVelocidad) {
//			System.out.println("Multa!!");
//		}else {
//			System.out.println("Vamos a una velocidad adecuada");
//		}
 //    //IF ANIDADO
//		boolean highway=true;
//		if (highway==true) {
//			System.out.println("vamos en la highway");
//			if(velocidad > limiteVelocidad) {
//				System.out.println("Multa!!");
//				
//				limiteVelocidad=100;
//			}else {
//				System.out.println("Vamos a una velocidad adecuada");
//			}
//		}
		
		//IF ELSE IF
		 //IF ANIDADO
//		boolean highway=false;
//		if (highway==true) {
//			System.out.println("vamos en la highway");
//			if(velocidad > limiteVelocidad) {
//				System.out.println("Multa!!");
//				
//				
//				limiteVelocidad=100;
//			}else {
//				System.out.println("Vamos a una velocidad adecuada");
//			}
//	}
//		else if(velocidad>limiteVelocidad){
//			System.out.println("vas en una calle y a acceso de velocidad MULTA !!");
//			}else {
//				System.out.println("vas en una calle y a una velocidad adecuada");
//			}
//		}
//		SWITCH CASE
		int temperatura=30;
		switch (temperatura) {
		case 10:
			System.out.println("frio");
			break;
		case 20:
			System.out.println("Agradable");
			break;
		case 30:
			System.out.println("calor");
			break;
		case 40:
			System.out.println("estamos en el desierto");
			break;
		default:	
			System.out.println("da igual");
			break;
		}
	}
}
