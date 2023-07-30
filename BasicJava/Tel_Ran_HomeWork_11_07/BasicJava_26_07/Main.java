import java.util.Scanner;

public class Main {
    public static void main(String...args){
       //Задание 1 .
       Scanner scanner = new Scanner(System.in);
       System.out.print(" Введи число от 0 до 329");
       int Ciferka = scanner.nextInt();
       System.out.print("не поленись , введи еще одно!");
       int Chiselko = scanner.nextInt();
       Ciferka = Chiselko + Ciferka;
       Chiselko = Ciferka - Chiselko;
       Ciferka = Ciferka - Chiselko;
       System.out.println("первым был " + Ciferka + "?" + ", а второй скорее всего " + Chiselko + "?");
       System.out.println( " Кажется тебя развели ) , Не хочешь отыграться? ))");
       // Задание 2 .

       WordState wordState = new WordState(false , false);

       System.out.println(wordState.isWorldNegativly);
        System.out.println(wordState.isWorldPositivly);
    }
}
