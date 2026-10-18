public class CheckEvenOrOdd {
    // This method checks if a number is even or odd using the modulus operator
    // Time complexity is O(1)
    // Space complexity is O(1)
    
    public static void isEven(int n) {
        if(n%2==0){
            System.out.println("Even number");
            } else{
                System.out.println("Odd number");
            }
    }
    //Bitwise operators are extremely fast and efficient
    // because they operate directly at the binary level,
    //  making them significantly faster than arithmetic or 
    // logical operations.

    public static void isEvenUsingBitwise(int n) {
        if((n&1)==0){
            System.out.println("Even number");
        } else{
            System.out.println("Odd number");
        }
    }
    public static void main(String []args) {
        isEven(10);
        isEvenUsingBitwise(101);
    }
}
