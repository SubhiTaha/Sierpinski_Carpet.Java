import java.util.*;
public class Calculator
{

        static boolean isOperator(char ch)
        {
                if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
                        return true;

                return false;
        }

        static void evaluatePostfix(String exp)
        {
                Stack<Integer> postFix = new Stack<>();    // Create postfix stack
                int n = exp.length();

                for(int i=0;i<n;i++)
                {
                        if(isOperator(exp.charAt(i)))
                        {
                                // pop top 2 operands.
                                int op1 = postFix.pop();
                                int op2 = postFix.pop();

                                // evaluate in reverse order i.e. op2 operator op1.
                                switch (exp.charAt(i)) {
                                        case '+' -> postFix.push(op2 + op1);
                                        case '-' -> postFix.push(op2 - op1);
                                        case '*' -> postFix.push(op2 * op1);
                                        case '/' -> postFix.push(op2 / op1);
                                }

                        }

                        // Current Char is Operand simple push into stack
                        else
                        {
                                // convert to integer
                                int operand = exp.charAt(i) - '0';
                                postFix.push(operand);
                        }
                }

                // Stack at End will contain result.
                System.out.println(postFix.pop());
        }

        public static void main(String args[])
        {
                String exp = "4 5 + 1 2 * - 5 / ";
                System.out.print("The PostFix Evaluation for the Given Expression "+exp+" is: ");
                evaluatePostfix(exp);
        }

}
/*
use the simple parser for the first point

 */