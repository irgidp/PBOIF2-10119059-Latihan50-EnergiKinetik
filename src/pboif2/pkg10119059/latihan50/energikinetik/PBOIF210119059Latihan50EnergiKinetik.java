/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan Energi Kinetik
 */
package pboif2.pkg10119059.latihan50.energikinetik;
/**
 *
 * @author Corazon
 */
import java.util.Scanner;
public class PBOIF210119059Latihan50EnergiKinetik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rumus rumus = new Rumus();
        
        System.out.print("\nMasukkan berat bola (kg) = ");
        rumus.setMassa(input.nextDouble());
        System.out.print("Masukkan kecepatan awal bola (m/s) = ");
        rumus.setKecepatan0(input.nextInt());
        System.out.print("Masukkan kecepatan akhir bola (m/s) = ");
        rumus.setKecepatan1(input.nextInt());
        System.out.println("\na. Energi Kinetik = 1/2mv^2");
        System.out.println("                  = " + rumus.hitungEK() + " Joule");
        System.out.println("b. Usaha = W = deltaEK");
        System.out.println("             = 1/2m(v1^2-v0^2)");
        System.out.println("             = " + rumus.hitungUsaha() + " Joule");
    }
    
}
