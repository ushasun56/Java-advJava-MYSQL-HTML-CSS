import java.util.Stack;
public class Expression{


 public static int applyOp(char op,
                           int b, int a)
    {
        switch (op)
        {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if (b == 0)
                throw new
                UnsupportedOperationException(
                      "Cannot divide by zero");
            return a / b;
        }
        return 0;
    }
 
    
    public static void main(String[] args)
    {
        System.out.println(EvaluateString.
                        evaluate("10 + 2 * 6"));
        System.out.println(EvaluateString.
                      evaluate("100 * 2 + 12"));
        System.out.println(EvaluateString.
                   evaluate("100 * ( 2 + 12 )"));
        System.out.println(EvaluateString.
             evaluate("100 * ( 2 + 12 ) / 14"));
    }
}