import java.util.Scanner;

/**
 * @author El Baron 15.02.2023
 */
public class Main {
    public static void main(String[] args) {
        //Программа для преобразования температуры с градусов по Цельсию
        //в градусы по Фаренгейту по формуле (F = C * 1.8 + 32)
        /*System.out.println("Температура " + 32 + " градуса по Цельсию равна "
                + (32 * 1.8 + 32) + " градуса по Фаренгейту");*/
        System.out.println("Введите исходную температуру по Цельсию");
        double a = new Scanner(System.in).nextDouble();
        double result = a * 1.8 + 32;
        System.out.println("Температура " + a + " Цельсия равна " +
                result + " Фаренгейта");




    }
}
