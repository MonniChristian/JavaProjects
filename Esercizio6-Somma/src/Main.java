import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //NUMERO 1
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il primo numero");
        int numero1 = input.nextInt();

        //NUMERO 2
        Scanner input2 = new Scanner(System.in);
        System.out.println("Inserisci il secondo numero");
        int numero2 = input2.nextInt();

        System.out.println("Risultato:" + " ");
        System.out.println(numero1 + numero2);
    }
}