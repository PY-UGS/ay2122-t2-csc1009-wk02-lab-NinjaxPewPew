import java.util.Scanner;

public class Zodiac {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        int x = 0;
        x = year % 12;
        if ( x == 0){
            System.out.print("Monkey");
        }
        else if (x == 1){
            System.out.print("Rooster");

        }
        else if (x == 2){
            System.out.print("Dog");

        }
        else if (x == 3){
            System.out.print("Pig");

        }
        else if (x == 4){
            System.out.print("Rat");

        }
        else if (x == 5){
            System.out.print("Ox");

        }
        else if (x == 6){
            System.out.print("Tiger");

        }
        else if (x == 7){
            System.out.print("Rabbit");

        }
        else if (x == 8){
            System.out.print("Dragon");

        }
        else if (x == 9){
            System.out.print("Snake");

        }
        else if (x == 10){
            System.out.print("Horse");

        }
        else if (x == 11){
            System.out.print("Sheep");

        }

        

        
        
     }
}
