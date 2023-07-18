
package Main;

import java.util.Scanner;

public class Main {

    public static void main (String...args){
        byte byteNumber = 120;
        int intNumber = 45853;
        double doubleNumber = 123123.1231;
        float floatNumber = 23123;
        char charNumber = '@';
        //сужение ...
        byteNumber = (byte)floatNumber;
        System.out.println( byteNumber);

        byteNumber = (byte)intNumber ;
        System.out.println( byteNumber);

        byteNumber = (byte)doubleNumber;
        System.out.println( byteNumber);

        byteNumber = (byte)charNumber;
        System.out.println(byteNumber);

        byte byteChtoto = 11;
        int intChtoto = 43434;
        double doubleChtoto = 1231.11;
        float floatChtoto = 23 ;
        char charChtoto = '@';
        //расширение
        intChtoto = byteChtoto;
        System.out.println(intChtoto);


        doubleChtoto = floatChtoto ;
        System.out.println(doubleChtoto);

        doubleChtoto = intChtoto;
        System.out.println(intChtoto);

        // это для интереса

        charChtoto = (char)byteChtoto;
        System.out.println(charChtoto);


        // 2е Задание
        Scanner Player = new Scanner(System.in);
        System.out.print(" С кем имею честь?");

        String name = Player.nextLine();
        System.out.println(" Приветики " + name + " Как дела? ");








    }
}
