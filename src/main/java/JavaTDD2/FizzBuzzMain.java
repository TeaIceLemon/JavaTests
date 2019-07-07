package JavaTDD2;

import java.util.IllegalFormatException;
import java.util.Scanner;

public class FizzBuzzMain {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        try(Scanner in = new Scanner(System.in)) {
                System.out.println("How many numbers are you going to insert?");
                int n = in.nextInt();
                for(int i = 0; i< n; i++ ){
                    System.out.println("Podaj liczbe");
                    int z= in.nextInt();
                    System.out.println("Liczba: " + z + ", zwracam: " + fizzBuzz.changeNumber(z));
                }
            }catch(IllegalFormatException e){
            System.out.println(e.getMessage());

        }
    }
}
