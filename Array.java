import java.util.Locale;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o número de alturas desejado: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        System.out.println("Digite as alturas: ");
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }
        double alturaMedia = soma / n;

        System.out.printf("Altura média: %.2f", alturaMedia);

        sc.close();
    }
}
