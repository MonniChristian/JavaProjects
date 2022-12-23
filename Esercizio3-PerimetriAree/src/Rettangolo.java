import java.util.Scanner;

public class Rettangolo {
    public static void main(String[] args) {

        System.out.println("Rettangolo: ");

        //BASE
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci misura Base:");
        int Base = input.nextInt();

        //ALTEZZA
        Scanner input2 = new Scanner(System.in);
        System.out.println("Inserisci misura Altezza:");
        int Altezza = input2.nextInt();


        System.out.println("Area:" + " " + Base * Altezza);
        System.out.print("Perimetro:" + " " + (Base * 2 + Altezza * 2));
    }
}
