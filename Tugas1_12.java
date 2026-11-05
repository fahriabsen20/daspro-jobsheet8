import java.util.Scanner;
public class Tugas1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int total = 0;

        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total angka tercetak: " + total);
        
        sc.close();
    }
}