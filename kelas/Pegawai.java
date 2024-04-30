package kelas;
import java.util.*;

public abstract class Pegawai {
    private String nama;
    private String noKtp;

    public Pegawai (String nama, String noKtp){
        this.nama = nama;
        this.noKtp = noKtp;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNoKtp(){
        return this.noKtp;
    }

    public String toString(){
        return String.format(
            " " + getNama() + 
            "\nNo. KTP           : " + getNoKtp()
            );
    }

    public abstract double earnings(); //pendapatn yang harus ada pada setiap jenis pegawai.
}