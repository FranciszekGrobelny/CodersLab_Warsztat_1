package lottoSimulator;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int i=0;
        int[] arr = new int[6];
        int[] lotto= new int[6];

        while(i<6){
            System.out.print("Podaj "+ (i+1) +" liczbe LOTTO: ");
            arr[i]=scanner.nextInt();
            for(int j=0;j<i;j++){
                while(arr[i]==arr[j]){
                    System.out.print("Ta liczba juz sie powtorzyla, podaj nowa: ");
                    arr[i]=scanner.nextInt();
                }
            }
            i++;
        }
        Arrays.sort(arr);
        System.out.println('\n'+"To twoje liczby " + Arrays.toString(arr));

        for(int j=0; j<6;j++){
            for(int k=0;k<j;k++){
                lotto[j]=r.nextInt(48)+1;
                while(lotto[k]==lotto[j]){
                    lotto[j]=r.nextInt(48)+1;
                }
            }

        }
        System.out.println( "Oto wylosowane liczby: "+Arrays.toString(lotto));
        int counter =0;
        for(int j=0;j<6;j++){
            for(int k=0;k<6;k++){
                if(arr[j]==lotto[k]){
                    counter++;
                }
            }
        }
        System.out.println('\n'+"Trafiles "+ counter);

    }
}
