
/**
 * PemilihanPercobaan1_14
 */

import java.util.Scanner;

public class PemilihanPercobaan1_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.printf("Angka %d adalah bilangan genap!\n", angka);
        } else {
            System.out.printf("Angka %d adalah bilangan ganjil!\n", angka);
        }

        input.close();
    }
}