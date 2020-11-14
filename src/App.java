/**
 * @author Nim : 10116430 Nama : Wisnu Bayu Aji Kelas: IF-2
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("======Massa Jenis Kubus======");
        Kubus rumus = new Kubus();
        rumus.setSisi(5);
        System.out.println("Sisi : "+rumus.getSisi());
        rumus.setMassa(250);
        System.out.println("Massa : "+rumus.getMassa());
        System.out.println("");
        
        System.out.println("======Hasil Perhitungan======");
        rumus.hitungVolume(0);
        System.out.println("Volume : "+rumus.hitungVolume(0));
        rumus.hitungMassaJenis(0, 0);
        System.out.println("Massa Jenis : "+rumus.hitungMassaJenis(0, 0));
    }
}
