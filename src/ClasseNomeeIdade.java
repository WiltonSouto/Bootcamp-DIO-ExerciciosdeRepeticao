import java.util.Scanner;

public class ClasseNomeeIdade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;

        //o while só fechou quando eu coloquei if

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Continue da qui...");
}}
