import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        double radiuse = scan.nextDouble();

        double area = Curcle.area(radiuse);
        double circumference = Curcle.circumference(radiuse);

        System.out.println("Площадь: " + area);
        System.out.println("Округ: " + circumference);
    }
}



