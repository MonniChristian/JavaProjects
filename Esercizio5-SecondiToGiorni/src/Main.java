import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il totale di secondi:");

        int s = input.nextInt();

        int giorni = s / 86400;
        int RestoGiorni = s % 86400;

        int ore = RestoGiorni / 3600;
        int RestoOre = RestoGiorni % 3600;

        int minuti = RestoOre / 60;
        int RestoMinuti = RestoOre % 60;

        int secondi = RestoMinuti;

        System.out.println("giorni:" + giorni + " " + "ore:" + ore + " " + "minuti:" + minuti + " " + "secondi:" + secondi);



    }
}