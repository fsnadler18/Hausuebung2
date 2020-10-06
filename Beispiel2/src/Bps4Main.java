import java.util.Scanner;

public class Bps4Main {
    public static void main(String [] args){
        Bps4Main b4m = new Bps4Main();
        RationalCalculator rc;
        VectorCalculator vc;
        ComplexCalculator cc;
        Scanner scanner = new Scanner(System.in);
        while (true){
            b4m.printMenu();
            int calcKindChoise = Integer.parseInt(scanner.nextLine());
            if(calcKindChoise < 1 || calcKindChoise > 4){
                System.out.println("Bitte lernen sie Lesen und versuchen sie es anchsließend erneut.");
                System.out.println("Funktioniert es immer noch nicht würde ich nochmal die Volkschule besuchen \n um schreiben zu lernen.");
                continue;
            }
            b4m.printCalcOperations();
            int operationChoice = Integer.parseInt(scanner.nextLine());

            switch (calcKindChoise){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4: System.exit(0);
                    break;
                default:
                    System.out.println("Ungültige Eingabe, bitte erneut eingeben:");
                    break;

            }
        }
    }

    public void printMenu() {
        System.out.println("Choose calculator: ");
        System.out.println("1 - Rational calculator");
        System.out.println("2 - Vector calculator");
        System.out.println("3 - Complex calculator");
        System.out.println("4 - Exit program");
    }

    public void printCalcOperations() {
        System.out.println("Choose operation: ");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - enter numbers again");
    }

}
