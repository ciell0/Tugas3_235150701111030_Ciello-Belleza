package kelas;
import java.util.*;

public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales (String nama, String noKtp, int inputPenjualan, double inputKomisi){
        super(nama,noKtp);
        setPenjualan(inputPenjualan);
        setKomisi(inputKomisi);
    }

    public int getPenjualan(){
        return penjualan;
    }

    public double getKomisi(){
        return komisi;
    }

    public void setPenjualan(int inputPenjualan){
        this.penjualan = inputPenjualan;
    }

    public void setKomisi(double inputKomisi){
        this.komisi = inputKomisi;
    }

    public double earnings(){
        return penjualan * komisi;
    }

    public String toString (){
        return String.format(
            "\nSales             :" + super.toString() + 
            "\nTotal penjualan   : " + getPenjualan() + 
            "\nBesaran Komisi    : " + getKomisi() + 
            "\nPendapatan        : Rp " + (int) earnings()
        );
    }
}
