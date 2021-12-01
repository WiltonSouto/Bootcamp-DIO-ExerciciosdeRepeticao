import java.sql.SQLOutput;
import java.util.Scanner;

public class ClassePareImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int quantPares = 0;
        int quantImpares = 0;


        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();
        int numero;
        int count = 0;

        do {

        System.out.println("Número: ");
        numero = scan.nextInt();
        if (numero % 2 == 0 ) quantPares++;
        else quantImpares++;

        count++;

        }  while(count < quantNumeros);
        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpares);

    }

}
