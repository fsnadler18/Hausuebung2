import java.util.Scanner;

public class Bsp3Main {

    public static void main(String [] args){
        System.out.println("Bitte Dateipfad angeben:");
        Scanner scanner = new Scanner(System.in);
        String dateiPfad = scanner.nextLine();
        NumberTester nr = new NumberTester(dateiPfad);
        nr.testFile();
    }
}
