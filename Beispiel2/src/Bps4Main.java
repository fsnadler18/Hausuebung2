import java.util.Scanner;

public class Bps4Main {
    public static void main(String [] args){
        Bps4Main b4m = new Bps4Main();
        RationalCalculator rc = new RationalCalculator();
        VectorCalculator vc = new VectorCalculator();
        ComplexCalculator cc = new ComplexCalculator();
        Scanner scanner = new Scanner(System.in);
        int calcKindChoise;
        int operationChoice;
        Number result = new Number();
        while (true){
            b4m.printMenu();

            Number a = new Number();
            Number b = new Number();

            try {
                calcKindChoise = Integer.parseInt(scanner.nextLine());
                if(calcKindChoise == 4)
                    System.exit(0);
                if (calcKindChoise < 1 || calcKindChoise > 4) {
                    System.out.println("Dies ist eine ungültige Eingabe.");
                    continue;
                }


            System.out.println("Enter number xa a>1");
            double xa = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter number xb b>1");
            double xb = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter number ya a>1");
            double ya = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter number yb b>1");
            double yb = Integer.parseInt(scanner.nextLine());

            a.setA(xa);
            a.setB(xb);


            b.setA(ya);
            b.setB(yb);



            b4m.printCalcOperations();
                operationChoice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException nfe){
                System.out.println("This was not a number, pls try again.");
                continue;
            }

            switch (calcKindChoise){
                case 1:
                    if(operationChoice == 1)
                        result = rc.add(a, b);
                    else if(operationChoice == 2)
                        result = rc.subtract(a, b);
                    else if(operationChoice == 3)
                        result = rc.multiply(a, b);
                    else if(operationChoice == 4)
                        result = rc.divide(a, b);
                    System.out.println("Solution:");
                    System.out.println("a = " + result.getA());
                    System.out.println("b = " + result.getB());
                    break;

                case 2:
                    if(operationChoice == 1)
                        result = vc.add(a, b);
                    else if(operationChoice == 2)
                        result = vc.subtract(a, b);
                    else if(operationChoice == 3)
                        result = vc.multiply(a, b);
                    else if(operationChoice == 4)
                        result =vc.divide(a, b);
                    System.out.println("Solution:");
                    System.out.println("a = " + result.getA());
                    System.out.println("b = " + result.getB());
                    break;

                case 3:
                    if(operationChoice == 1)
                        result = cc.add(a, b);
                    else if(operationChoice == 2)
                        result = cc.subtract(a, b);
                    else if(operationChoice == 3)
                        result = cc.multiply(a, b);
                    else if(operationChoice == 4)
                        result = cc.divide(a, b);
                    System.out.println("Solution:");
                    System.out.println("a = " + result.getA());
                    System.out.println("b = " + result.getB());
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
