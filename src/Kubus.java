/**
 * @author Nim : 10116430 Nama : Wisnu Bayu Aji Kelas: IF-2
 */

public class Kubus {
    private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int hitungVolume(int parSisi) {
        parSisi = sisi * sisi * sisi;
        return parSisi;
    }

    public int hitungMassaJenis(int parMassa, int volume) {
        volume = sisi * sisi * sisi;
        parMassa = massa / volume;
        return parMassa;
    }
}
