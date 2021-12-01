import java.util.Scanner;

public class ClasseTabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.println("Tabuada: ");

        int tabuada = scan.nextInt();


        for(int i = 1; i <=10; i = i + 1) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }






    }
}
