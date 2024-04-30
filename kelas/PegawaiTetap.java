package kelas;
import java.util.*;

public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKtp, double inputUpah){
        super(nama,noKtp);
        setUpah(inputUpah);
    }

    public void setUpah(double inputUpah){
        this.upah = inputUpah;
    }

    public double getUpah(){
        return this.upah;
    }

    public double earnings(){
        return getUpah();
    }

    public String toString(){
        return String.format(
            "\nPegawai Tetap     :" + super.toString() +
            "\nUpah              : " + getUpah() +
            "\nPendapatan        : Rp " + (int) earnings()
        );
    }
}
