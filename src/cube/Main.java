package cube;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        cube();
    }
    static void cube(){
        Scanner scanner =  new Scanner(System.in);
        Random rand = new Random();
        int[] cubesSize = {3, 4, 6, 8 ,10, 12, 20, 100};
        int size=0, throwNumbers=0, mod=0,ans=0,j=0;

        System.out.print("Podaj kod rzutu koscia: ");
        try {
            String answer = scanner.nextLine();
            String[] elements = answer.split("D");
            if(elements[1].length()>3) {
                String[] el = elements[1].split("[+ -]");
                size = Integer.parseInt(el[0]);
                if(el[1].equals("")){
                    mod = 0 ;
                }else {
                    mod = Integer.parseInt(el[1]);
                }
            }else{
                mod =0;
                size = Integer.parseInt(elements[1]);
            }
            if(elements[0].equals("")){
                throwNumbers=1;
            }else {
                throwNumbers = Integer.parseInt(elements[0]);
            }

            while (size != cubesSize[j]) {
                if (j < cubesSize.length - 1) {
                    j++;
                } else {
                    System.out.print("Nie ma takiej kostki, podaj liczbe scianek jeszcze raz:");
                    size = scanner.nextInt();
                    j = 0;
                }
            }


            for (int i = 0; i < throwNumbers; i++) {
                ans = (rand.nextInt(size) + 1) + mod;
                System.out.println("Wynik " + (i + 1) + " rzutu: " + ans);
            }
        }catch(InputMismatchException e){
            System.out.println("Blad w podawanej wartosci");
        }
    }
}
