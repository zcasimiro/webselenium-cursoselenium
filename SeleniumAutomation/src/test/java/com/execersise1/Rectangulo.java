package com.execersise1;

public class Rectangulo extends Poligono{
	private double lado1,lado2,lado3,lado4;
	private double base1,altura1;

	
	//Constructor Default
	public Rectangulo(){
}
	
	//Constructor Perimetro
	
	public Rectangulo (double lado1, double lado2, double lado3,double lado4) {
		super(4);
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
		this.lado4=lado4;
		}
	
	//Constructor Area
	
	public Rectangulo (double base,double altura) {
		super(4);
		this.base1=base;
		this.altura1=altura;
	}
	
	//Encapsulacion
	public void setlado1(double lado1) {
		this.lado1=lado1;
	}
	
	public double getlado1() {
		return lado1;
	}
	
	public void setlado2(double lado2) {
		this.lado2=lado2;
	}
	
	public double getlado2() {
		return lado2;
	}
	
	public void setlado3(double lado3) {
		this.lado3=lado3;
	}
	
	public double getlado3() {
		return lado3;
	}
	
	public void setlado4(double lado4) {
		this.lado4=lado4;
	}
	
	public double getlado4() {
		return lado4;
	}
	
	
	public String toString() {
		String message = "\n RECTANGULO " + super.toString() +
                "\n LADO 1= "+lado1+" LADO 2= "+lado2+" LADO 3= "+lado3+" LADO 4= "+lado4;
		return message;
	}
	
	
	@Override
	public double area() {
		return base1* altura1;
	}
	
	@Override
	public double perimetro() {
		return lado1+lado2+lado3+lado4;
	}
	
}
	
