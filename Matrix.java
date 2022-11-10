import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Size:");
        n = input.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = input.nextInt();
            }
        }

        int[][] c = new int[n][n];
        int[][] d = new int[n][n];
        int[][] e = new int[n][n];
        int[][] f = new int[n][n];

        System.out.println("Suma matricilor: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Diferenta matricilor (a-b): ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                d[i][j] = a[i][j] - b[i][j];
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Diferenta matricilor (b-a): ");
        for (
                int i = 0;
                i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                e[i][j] = b[i][j] - a[i][j];
                System.out.print(e[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Inmultirea matricilor: ");
        for (
                int i = 0;
                i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    f[i][j] = f[i][j] + a[i][k] * b[k][j];
                }
                System.out.print(f[i][j] + " ");
            }
            System.out.println();
        }
    }
}
