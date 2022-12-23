import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //NUMERO 1
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il primo numero:");
        float numero1 = input.nextFloat();

        //NUMERO 2
        System.out.println("Inserisci il secondo numero:");
        float numero2 = input.nextFloat();

        System.out.println("Somma:" + (numero1 + numero2));
        System.out.println("Sottrazione:" + (numero1 - numero2));
        System.out.println("Moltiplicazione:" + (numero1 * numero2));
        System.out.println("Divisione:" + (numero1 / numero2));




    }
}