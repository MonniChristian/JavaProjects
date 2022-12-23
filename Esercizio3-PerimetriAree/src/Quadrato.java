import java.util.Scanner;

public class Quadrato {
    public static void main(String[] args) {

        System.out.println("Quadrato: ");

        //LATO
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci misura lato:");
        int lato = input.nextInt();


        System.out.println("Area:" + " " + lato * lato);
        System.out.println("Perimetro:" + " " + lato * 4);

    }
}
