/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "SIN_TITULO.java."

import java.io.*;

public class pastel {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int ganaciaa;
		int ganaciab;
		int ganaciacole;
		double k;
		int nump;
		int pagoa;
		int pagoc;
		int pagozy;
		int placa;
		int tipodet;
		// Ejercicios propuestos 1. Un empresario del transporte cuenta con 30 veh�culos
		// entre buses , busetas y colectivos . Al final del d�a se elabora por cada
		// veh�culo un registro con la placa , el tipo ( 1 = bus , 2 = buseta ,
		// 3 = colectivo ) y el n�mero de pasajeros transportados . Elabore un diagrama
		// que imprima por cada veh�culo la placa , el dinero recolectado y el pago para
		// el conductor que es el 20 % del total recolectado . Tambi�n tenga en cuenta
		// que
		// el precio del pasaje en Bus es de $ 2300 , en Buseta es de $ 2400 y en
		// Colectivos es de $ 2500
		// @author santy
		for (k = 1; k <= 30; k++) {
			System.out.println("digite el tipo de transporte");
			System.out.println(" 1 = bus  ");
			System.out.println(" 2 = buseta ");
			System.out.println(" 3 = colectivo  ");
			tipodet = Integer.parseInt(bufEntrada.readLine());
			System.out.println("digite la placa del transporte ");
			placa = Integer.parseInt(bufEntrada.readLine());
			System.out.println("digite el numero de pasajeros ");
			nump = Integer.parseInt(bufEntrada.readLine());
			ganaciab = nump * 2300;
			pagoc = (ganaciab * 20) / 100;
			pagoa = nump * 2400;
			ganaciaa = (pagoa * 15) / 100;
			pagozy = nump * 2500;
			ganaciacole = (pagozy * 10) / 100;
			if (tipodet == 1) {
				System.out.println("el tipo de transporte es bus y lo generado por del bus es " + nump * 2300
						+ " y su placa es " + placa + " y la ganacia del conductor es " + pagoc);
			} else {
				if (tipodet == 2) {
					System.out.println("el tipo de transporte es buceta y lo generado por la buceta es " + nump * 2400
							+ " y su placa es " + placa + " y la ganacia del conductor es " + ganaciaa);
				} else {
					if (tipodet == 3) {
						System.out.println(
								"el tipo de transporte es colectivo y la ganacia por el colectivo  es  " + nump * 2500
										+ " y su placa es " + placa + " y la ganacia del conductor es " + ganaciacole);
					}
				}
			}
		}
	}

}
