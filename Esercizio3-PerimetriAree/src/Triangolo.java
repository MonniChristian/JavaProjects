import java.util.Scanner;

public class Triangolo {
    public static void main(String[] args) {

        System.out.println("Triangolo: ");

        //BASE - Lato 1
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci misura Base - Lato 1:");
        int Base = input.nextInt();

        //LATO 2
        Scanner input2 = new Scanner(System.in);
        System.out.println("Inserisci misura Lato 2:");
        int Lato2 = input2.nextInt();


        //LATO 3
        Scanner input3 = new Scanner(System.in);
        System.out.println("Inserisci misura Lato 3:");
        int Lato3 = input3.nextInt();

        //ALTEZZA
        Scanner input4 = new Scanner(System.in);
        System.out.println("Inserisci misura Altezza");
        int Altezza = input4.nextInt();



        System.out.println("Area:" + " " + (Base * Altezza / 2));
        System.out.print("Perimetro:" + " " + (Base + Lato2 + Lato3));
    }
}
