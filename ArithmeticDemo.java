public class ArithmeticDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        double num3 = 3.0;

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        int expressionResult = num1 + num2 * 2 - (num1 / num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Expression Result: " + expressionResult); /* Order of Operations is based on order of Precedences of Logical Operations, 
                                                                     where Parenthesis > Multiplicative (*, /, %) > additive (+, -) > shift ( <<, >>, >>>), etc. 
                                                                     
                                                                     in order of precedence: 
                                                                     1. num1 + num2 *2 - (num1 / num2) --> (num1 / num2) = 2
                                                                     2.  num1 + num2 * 2 - 2 --> num2 * 2 = 10
                                                                     3. num1 + 10 - 2 --> num1 + 10 = 20
                                                                     4. 20 - 2 = 18     */
    }
}


