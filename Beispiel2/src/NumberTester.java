import java.io.*;

public class NumberTester {
    public String fileName;
    public NumberTest oddTester;
    public NumberTest primeTester;
    public NumberTest palindromTester;


    public NumberTester(String fileName){
        this.fileName = fileName;
    }

    public void setOddTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }

    public void setPalindromTester(NumberTest palindromTester){
        this.palindromTester = palindromTester;
    }


    public void testFile(){
//-----------------------------------------------------
// Testing if x is a prime number
//-----------------------------------------------------
        primeTester = (x) -> {
            if(x > 2) {
                for (int i = 2; 2 * i < x; i++) {
                    if (x % i == 0) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        };
        setPrimeTester(primeTester);
//-----------------------------------------------------
// Testing if x is a palindrom
//-----------------------------------------------------
        palindromTester = (x) -> {
            String test = "" + x;
            String reversed  = "";
            char [] diggits = test.toCharArray();

            for (int i = test.length() - 1; i >= 0; i--) {
                reversed = reversed + diggits[i];
            }

            return reversed == test;
        };
        setPalindromTester(palindromTester);
//-----------------------------------------------------
// Testing if x is an odd number
//-----------------------------------------------------
        oddTester = (x) -> {
            return (x%2) == 0;
        };
        setOddTester(oddTester);

//-----------------------------------------------------
//Reading file, splitting read string and proofing the asked calculation
//-----------------------------------------------------
    try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName))))){
        int istCases = 0;
        int calcRequest;
        int sollCases = 0;
        int number;
        String line = br.readLine();

        while (line != null){
            if(istCases == 0)
               sollCases  = Integer.parseInt(line);

            //Leaves loop as soon as given amount of cases is reached.
            if(sollCases == istCases)
                System.exit(0);
            //Now we read the next line after the first one with the amount of cases is already read before entering
            //the loop. Every line we read from now on is gonna be either a calculation request + an Integer or a
            //line given to us in the wrong format which we need to sort out.

            line = br.readLine();
            String [] casesPlusInteger = line.split(" ");
            calcRequest = Integer.parseInt(casesPlusInteger[0]);
            number = Integer.parseInt(casesPlusInteger[1]);

            if(calcRequest == 1){
                if (oddTester.testNumber(number))
                    System.out.println("EVEN");
                else
                    System.out.println("UNEVEN");
            } else if(calcRequest == 2){
                if (primeTester.testNumber(number))
                    System.out.println("PRIME");
                else
                    System.out.println("NO PRIME");
            } else if(calcRequest == 3){
                if (palindromTester.testNumber(number))
                    System.out.println("PALINDROM");
                else
                    System.out.println("NO PALINDROM");
            } else System.out.println("You try to choose a non existing calculative operation or your file has a wrong format, pls check and try again!");
            istCases++;
        }

    } catch (FileNotFoundException e) {
        System.out.println("Angegebenes File nicht gefunden, bitte erneut versuchen.");
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
