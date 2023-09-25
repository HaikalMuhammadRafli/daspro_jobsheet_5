import java.util.Scanner;

public class PemilihanPercobaan2_14 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Nilai uas : ");
        float uas = input.nextFloat();
        System.out.print("Nilai uts : ");
        float uts = input.nextFloat();
        System.out.print("Nilai kuis : ");
        float kuis = input.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input.nextFloat();
        

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi";

        System.out.printf("Nilai akhir = %f Sehingga %s\n", total, message);

        input.close();
    }
}
