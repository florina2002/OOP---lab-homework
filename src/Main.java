import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Size:");
        n = input.nextInt();
        Matrix a = new Matrix(n);
        Matrix b = new Matrix(n);
        a.Citire();
        b.Citire();
        a.Suma(b);
        b.Diferenta(a);
        a.Diferenta(b);
        a.Inmultire(b);
    }
}