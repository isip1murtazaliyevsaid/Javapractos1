import javax.xml.stream.FactoryConfigurationError;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter chudu = new PrintWriter("recept-chudu.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Рецепт Даргинские чуду:");

        System.out.println("Ингридиенты:");
        System.out.println("говяжий фарш грамм:");
        int govadina = scanner.nextInt();
        System.out.println("карфотель грамм:");
        int kartofel = scanner.nextInt();
        System.out.println("лук белый грамм:");
        int lyk = scanner.nextInt();
        System.out.println("мука грамм:");
        int myka = scanner.nextInt();
        System.out.println("дрожжи сухие грамм:");
        int droji = scanner.nextInt();
        System.out.println("соль грамм:");
        int sol = scanner.nextInt();
        System.out.println("сахар грамм:");
        int saxar = scanner.nextInt();
        System.out.println("сливочное масло грамм: ");
        int maslo = scanner.nextInt();

        System.out.println("Инструкция по приготовление сочных, мощных и восточных даргинских чуду");
        scanner.nextLine();

        chudu.println("Как готовить:\n1. Говяжий фарш: " + govadina + " грамм\n2. Картофель: " + kartofel + " грамм\n3. Белый лук: " + lyk +" грамм\n4. Мука: " + myka + " грамм\n5. Дрожжи: " + droji + " грамм\n6. Соль: "+ sol + " грамм\n7. Сахар: " + saxar + " грамм\n8. Сливочное масло: " + maslo);

        String chududargin = scanner.nextLine();
        chudu.println("Инструкция по приготовлению хинкалов: " + chududargin);
        chudu.close();

        Scanner scanner2 = new Scanner(new File("recept-chudu.txt"));
        while (scanner2.hasNextLine()) {
            System.out.println(scanner2.nextLine());
        }
        scanner2.close();
    }
}

