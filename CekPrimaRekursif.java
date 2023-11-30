import java.util.Scanner;
public class CekPrimaRekursif {
    static boolean BilanganPrima(int n, int i) {
        if (n <= 1) {
            return false;
        } else if (i == 1) {
            return true;
        } else {
            if (n % i == 0) {
                return false;
            } else {
                return BilanganPrima(n, i - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();
        if (BilanganPrima(bilangan, bilangan / 2)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }

        sc.close();
    }

}