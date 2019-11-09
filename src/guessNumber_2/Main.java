package guessNumber_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        answer();
    }
    static void answer() {
        int min=0,max=1001,ans=((max-min)/2+min);
        Scanner scanner = new Scanner(System.in);
        System.out.println("odpowiadaj tylko : zgadles, tak i nie");
        System.out.println("Twoja liczba to "+ ans+ " Zgadlem?");
        String answe =scanner.nextLine();
        while (!answe.equals("zgadles")) {
            if ("nie".equals(answe)) {
                System.out.println("za duzo?");
                answe = scanner.nextLine();
                if("tak".equals(answe)){
                    max=ans;
                }else if("nie".equals(answe)){
                    min=ans;
                    System.out.println("Za malo?");
                    answe = scanner.nextLine();
                    if("tak".equals(answe)){
                        min=ans;
                    }else if("nie".equals(answe)){
                        System.out.println("Nie oszukuj");
                    }
                }
            }
            ans = ((max-min)/2+min);
            System.out.println("Twoja liczba to "+ ans+ " Zgadlem?");
            answe = scanner.nextLine();
        }
        System.out.println("Super!!! Twoja liczba to "+ ans);
    }
}


