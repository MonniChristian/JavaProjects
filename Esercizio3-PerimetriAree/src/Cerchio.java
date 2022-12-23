import java.util.Scanner;

public class Cerchio {

    public static void main(String[] args) {

        System.out.println("Cerchio: ");

        //RAGGIO
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci misura raggio:");

        int raggio = input.nextInt();
        System.out.println("Area:" + " " + ((raggio * raggio) *3.14));
        System.out.println("Perimetro:" + " " + ((2*raggio) * 3.1410));

    }

}