import java.util.Scanner;
public class PennjumlahanRekursif {
    static int nilaiN( int n){
        if (n == 1){
            return (1);
        } else{
        return (n + nilaiN(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai n :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i <n) {
                System.out.print("+");
            }
        }
        System.out.print(" = " + nilaiN(n));
        sc.close();

    }
}
