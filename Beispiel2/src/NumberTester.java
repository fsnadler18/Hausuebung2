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
            int original = x;
            int reversed = 0;

            //reversing number
            while(x != 0){
                int tmp = x - 0;
                reversed = reversed * 10 + tmp;
            }

            return reversed == original;
        };
        setPalindromTester(palindromTester);
//-----------------------------------------------------
// Testing if x is an odd number
//-----------------------------------------------------
        oddTester = (x) -> {
            if((x%2) == 0)
                return true;
            else
                return false;
        };
        setOddTester(oddTester);

        
    }
}
