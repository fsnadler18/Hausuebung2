public class NumberTester {
    public String fileName;
    public NumberTest oddTester;
    public NumberTest primeTester;
    public NumberTest palindromTester;


    public NumberTester(String fileName){
        this.fileName = fileName;
    }

    public void setOddEvenTester(NumberTest oddTest){
        this.oddTester = oddTest;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }

    public void setPalindromTester(NumberTest palindromTester){
        this.palindromTester = palindromTester;
    }

    public void testFile(){
        
    }
}
