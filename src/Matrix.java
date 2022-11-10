import java.util.Scanner;

public class Matrix {
    int[][] a;
    int n;

    public Matrix(int n) {
        this.n = n;
    }

    public void Citire() {
        a = new int[n][n];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = input.nextInt();
            }
        }
    }

    public void Suma(Matrix b){
        int[][] c = new int[n][n];
        System.out.println("Suma matricilor: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = a[i][j] + b.a[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void Diferenta(Matrix b){
        int[][] d = new int[n][n];
        System.out.println("Diferenta matricilor: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                d[i][j] = a[i][j] - b.a[i][j];
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void Inmultire(Matrix b){
        int[][] f = new int[n][n];
        System.out.println("Inmultirea matricilor: ");
        for (
                int i = 0;
                i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    f[i][j] = f[i][j] + a[i][k] * b.a[k][j];
                }
                System.out.print(f[i][j] + " ");
            }
            System.out.println();
        }
    }
}
