import java.util.Scanner;
public class fibonacci {
    static long pasanganMarmut(int bulan) {
        if (bulan == 1) {
            return 1; 
        }if (bulan == 2){
            return 1;
        }else{
            return pasanganMarmut(bulan - 1) + pasanganMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pasangan marmut bulan ke-12" +pasanganMarmut(12));
        System.out.println(pasanganMarmut(12)); 
        sc.close();
    }
}