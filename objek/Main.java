package objek;
import kelas.*;

public class Main {
    public static void main(String[] args) {
        PegawaiTetap pegawaiTetap1 = new PegawaiTetap("Bayu", "21345618268372", 2000000.0);
        PegawaiTetap pegawaiTetap2 = new PegawaiTetap("Jhon", "72357857857938", 3000000.0);
        PegawaiTetap pegawaiTetap3 = new PegawaiTetap("Pricil", "65453786476374", 5000000.0);

        PegawaiHarian pegawaiHarian1 = new PegawaiHarian("Karen", "371267463863", 8500.0, 40);
        PegawaiHarian pegawaiHarian2 = new PegawaiHarian("Sisil", "371267463863", 8500.0, 40);
        PegawaiHarian pegawaiHarian3 = new PegawaiHarian("Clara", "371267463863", 8500.0, 40);

        Sales sales1 = new Sales("Tika", "2637865286528", 50, 50000.0);
        Sales sales2 = new Sales("Akmal", "2637865286528", 50, 50000.0);
        Sales sales3 = new Sales("Maul", "2637865286528", 50, 50000.0);
        
        System.out.println("\n==================================");
        System.out.println(pegawaiTetap1.toString());
        // System.out.println(pegawaiTetap2.toString());
        // System.out.println(pegawaiTetap3.toString());

        System.out.println("====================================");
        System.out.println(pegawaiHarian1.toString());
        // System.out.println(pegawaiHarian2.toString());
        // System.out.println(pegawaiHarian3.toString());

        System.out.println("====================================");
        System.out.println(sales1.toString());
        // System.out.println(sales2.toString());
        // System.out.println(sales3.toString());
        System.out.println("=====================================");
    }
}
