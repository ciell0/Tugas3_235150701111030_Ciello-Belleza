package kelas;
import java.util.*;

public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKtp, double inputUpahPerJam, int inputTotalJam){
        super(nama,noKtp);
        setTotalJam(inputTotalJam);
        setUpahPerJam(inputUpahPerJam);

    }

    public double getUpahPerJam(){
        return upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setUpahPerJam(double inputUpahPerJam){
        this.upahPerJam = inputUpahPerJam;
    }

    public void setTotalJam(int inputTotalJam){
        this.totalJam = inputTotalJam;
    }

    public double earnings(){
        if (getTotalJam() >= 40){
            return (40 * getUpahPerJam()) + ((getTotalJam() - 40) * getUpahPerJam() * 1.5);
        } else {
            return getTotalJam() * getUpahPerJam();
        }
    }

    public String toString(){
        return String.format (
            "\nPegawai Harian    :" + super.toString() + 
            "\nUpah/jam          : " + getUpahPerJam()   + 
            "\nTotal jam kerja   : " + getTotalJam() +
            "\nPendapatan        : Rp " + (int) earnings());
    }

}
