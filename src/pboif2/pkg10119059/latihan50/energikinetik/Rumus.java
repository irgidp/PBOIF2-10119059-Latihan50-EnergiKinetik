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
public class Rumus {
    private double massa;
    private int kecepatan0;
    private int kecepatan1;
    
    public double getMassa(){
        return massa;
    }
    
    public void setMassa(double massa){
        this.massa = massa;
    }
    
    public int getKecepatan0(){
        return kecepatan0;
    }
    
    public void setKecepatan0(int kecepatan0){
        this.kecepatan0 = kecepatan0;
    }
    
    public int getKecepatan1(){
    return kecepatan1;
    }
    
    public void setKecepatan1(int kecepatan1){
        this.kecepatan1 = kecepatan1;
    }
    
    public double hitungEK(){
        return 0.5 * getMassa() * Math.pow(getKecepatan1(),2);
    }
        
    public double hitungUsaha(){
        return  0.5 * getMassa() * (Math.pow(getKecepatan1(),2) - Math.pow(getKecepatan0(),2));
    }
}
