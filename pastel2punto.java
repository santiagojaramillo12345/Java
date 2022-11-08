/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJERCICIO_2.java."

import java.io.*;

public class ejercicio_2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int contador;
		int contadora;
		int contadorb;
		int contadorc;
		double edad;
		int gaseosa;
		int id;
		double k;
		int n;
		double porcentaje;
		double promedio;
		double recidencia;
		double recidente;
		double recidete;
		int residencia;
		int sexo;
		double suma;
		// 2. Se tiene una cantidad N de personas y por cada una de ellas se maneja Identificación , sexo , edad , bebida preferida y ciudad donde reside 
		// . Hacer un algoritmo que calcule e imprima los siguientes datos : Cantidad de personas que viven en Medellín y toman Coca Cola Los nombres de los 
		// hombres , mayores de edad que toman Pepsi Cola y viven en Cali Cantidad de personas encuestadas - Porcentaje de personas que toman Manzana y viven
		// en Bogota en relación a todas las personas encuestadas //-Promedio de edad de las mujeres que toman// Naranjada y viven en Cartagena
		System.out.println("digite la cantiadad de personas");
		n = Integer.parseInt(bufEntrada.readLine());
		contador = 0;
		contadora = 0;
		contadorb = 0;
		contadorc = 0;
		for (k=1;k<=n;k++) {
			System.out.println(" digite si identificacion");
			id = Integer.parseInt(bufEntrada.readLine());
			System.out.println("digite su sexo");
			System.out.println("1 masculino");
			System.out.println("2 femenino");
			sexo = Integer.parseInt(bufEntrada.readLine());
			System.out.println("digite su edad");
			edad = bufEntrada.readLine();
			System.out.println("digite su gaseosa preferida ");
			System.out.println("1 cocacola");
			System.out.println("2 pesicola");
			System.out.println("3 manzana ");
			System.out.println("4 naranjada ");
			System.out.println("otra");
			gaseosa = Integer.parseInt(bufEntrada.readLine());
			System.out.println("digite su lugar de recidencia actual  ");
			System.out.println("1 medellin");
			System.out.println("2 cali");
			System.out.println("3 bogota");
			System.out.println("4 cartajena");
			System.out.println("5 otro");
			recidencia = bufEntrada.readLine();
			if (gaseosa==1 && residencia==1) {
				contador = contador+1;
			} else {
				if (gaseosa==2 && recidencia==2 && edad>17 && sexo==1) {
					contadora = contadora+1;
				} else {
					if (gaseosa==3 && recidente==3) {
						contadorb = contadorb+1;
					} else {
						if (gaseosa==4 && recidete==4) {
							contadorc = contadorc+1;
						}
					}
				}
			}
		}
		System.out.println("la cantidad de personas que toman gaseosa son "+contador);
		System.out.println("la cantiada de personas que toman pesicola y son de cali son de "+contadora);
		suma = contador+contadorc+contadora+contadorb;
		promedio = suma*contadorc/100;
		porcentaje = (contadorc*n)/100;
		System.out.println("El porcentaje de personas que toman Manzana y viven Bogota son de el "+porcentaje);
		System.out.println("el promedio de mujeres que toma narajanda y son de cartajena son de "+promedio);
	}


}

