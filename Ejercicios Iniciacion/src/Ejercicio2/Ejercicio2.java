package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		/*float venta1;
		float venta2;
		float venta3;*/
		float comision1;
		float comision2;
		float comision3;
		//float venta;
		//float comision;
		final float sueldo = 1200;
		final float porcentaje=0.1f;
				
		System.out.println("Valor de la venta 1: ");
		//venta = teclado.nextFloat();
		comision1=teclado.nextFloat()*porcentaje;
		//comision1= venta *porcentaje;
		/*sueldo +=comision;
		System.out.println("Comision por la venta 1: "+comision);*/
			
		
		System.out.println("Valor de la venta 2: ");
		comision2=teclado.nextFloat()*porcentaje;
		//comision2= venta *porcentaje;
		//comision1= venta *porcentaje;
	/*	sueldo += comision;
		System.out.println("Comision por la venta 2: "+comision);*/
		
		
		System.out.println("Valor de la venta 3: ");
		comision3=teclado.nextFloat()*porcentaje;
		//comision3= venta *porcentaje;
		/*comision= venta *porcentaje;
		sueldo +=comision;*/
		//System.out.println("Comision por la venta 3: "+comision);
		
		System.out.println("Valor Comision 1: "+ comision1);
		System.out.println("Valor Comision 1: "+ comision2);
		System.out.println("Valor Comision 1: "+ comision3);
		System.out.println("Sueldo final: " +  (comision1+comision2+comision3+sueldo));
		//System.out.printf("Sueldo final: " + "%.2f %n" , comision1 + comision2 + comision3+sueldo);
		teclado.close();
	
	}

}
