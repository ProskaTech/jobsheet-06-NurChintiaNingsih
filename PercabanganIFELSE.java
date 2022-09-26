/**
 * @author 21343011 - Nur Chintia Ningsih
 */
package JS6;

import java.util.Scanner;

public class PercabanganIFELSE {

	public static void main(String[] args) {
		double total_pembelian, diskon = 0;
		
		try (Scanner dataMasuk = new Scanner (System.in)) {
			System.out.print("Masukan Total Pembelian: Rp ");
			total_pembelian = dataMasuk.nextDouble();
		}
		if (total_pembelian >= 50000)
			diskon = 0.1 * total_pembelian;
		else
			diskon = 0.2 * total_pembelian;
		
		System.out.println("Besarnya diskon : Rp " + diskon);


	}

}
