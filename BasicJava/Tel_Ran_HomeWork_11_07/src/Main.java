import java.util.Scanner;

public class Main {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.print( "кто ты воин?");
        String answer = sc.nextLine();

        TextMessage message = new TextMessage(answer);
        System.out.println(message.answer);




    }
}
