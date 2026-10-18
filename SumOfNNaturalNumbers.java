public class SumOfNNaturalNumbers {
    // 1. naive approach, Time Complexity: O(n), Space Complexity: O(1)
    public static int sumOfNaturalNumbers(int n) {
            int sum = 0;
           for(int i=1; i<=n; i++) {
                sum += i;
           }
           return sum;
          }
    // 2. recursive approach, Time Complexity: O(n), Space Complexity: O(n)
    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }      
        return n + sum(n-1);
    }
    //3. Expected Mathematical approach, Time Complexity: O(1), Space Complexity: O(1)
       public static int sumOfNaturalNumbersUsingFormula(int n) {
        return (n * (n + 1)) / 2;
       } 

       public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first " + n + " natural numbers (naive approach): " + sumOfNaturalNumbers(n));
        System.out.println("Sum of first " + n + " natural numbers (recursive approach): " + sum(n));
        System.out.println("Sum of first " + n + " natural numbers (mathematical formula): " + sumOfNaturalNumbersUsingFormula(n));
}
