package numberGuessGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int random = rand.nextInt(100)+1;
        int tmp;
        System.out.print("Zgadnij wylosowana liczbe: ");
        while(true){
            tmp = scan.nextInt();
            if(tmp == random){
                System.out.println("Brawo gades. Szukana liczba to "+random);
                return ;
            }else if(tmp > random){
                System.out.print("Podana liczba jest za duza. Zgadnuj jeszcze: ");

            }else{
                System.out.print("Podana liczba jest za mala. Zgadnuj jeszcze: ");
            }
        }
    }
}
