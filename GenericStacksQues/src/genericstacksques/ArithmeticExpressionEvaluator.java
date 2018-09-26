/*
Mathew Buck
CIS 27 Lab 1
Note: wite space doesn't matter in input.
//
 */
package genericstacksques;
import java.util.StringTokenizer;

//evaluates prefix and postfix expressions
public class ArithmeticExpressionEvaluator {

    //prints out infix: postfix: and final result of the expressions
    public void evaluateInfix(String infix) {
        System.out.println("Infix:   " + infix);
        System.out.println("Postfix: " + infixToPostfix(infix));
        System.out.println("Result:  " + evaluatePostfix(infix));
        System.out.println();
    }

    //algorithm creats a stack to store operands
    //scans the elements of an array 
    //if the element is a number, it gets pushed onto the stack
    //if the element is an operator, pops 2 numbers, perform the operation
    //and pushes the result backinto the stack
    //the last element on top of the stack is the result
    public double evaluatePostfix(String infix) {
        String postfix = infixToPostfix(infix);
        String[] postArr;
        StackLL<Double> stk = new StackLL();
        double val = 0;
        double tot = 0;
        double pop1 = 0;
        double pop2 = 0;

        //splits string at white space and loads into array
        postArr = postfix.split(" ");

        for (int i = 0; i < postArr.length; i++) {
            if (postArr[i].equals("-")) {
                pop2 = (Double) stk.pop();
                pop1 = (Double) stk.pop();
                tot = pop1 - pop2;
                stk.push(tot);
            } 
            else if (postArr[i].equals("+")) {
                pop2 = (Double) stk.pop();
                pop1 = (Double) stk.pop();
                tot = pop1 + pop2;
                stk.push(tot);
            } 
            else if (postArr[i].equals("/")) {
                pop2 = (Double) stk.pop();
                pop1 = (Double) stk.pop();
                tot = pop1 / pop2;
                stk.push(tot);
            } 
            else if (postArr[i].equals("*")) {
                pop2 = (Double) stk.pop();
                pop1 = (Double) stk.pop();
                tot = pop1 * pop2;
                stk.push(tot);
            } 
            else if (postArr[i].equals("")) {
            } 
            else if (postArr[i].equals(null)) {
            } 
            else {
                val = Double.parseDouble(postArr[i]);
                stk.push(val);
            }
        }
        return (Double) stk.pop();
    }

    //converts an infix expression to a postfix expression
    //expressions must be fully parenthesized
    public String infixToPostfix(String infix) {
        String[] exArr = toArray(infix);
        StackLL stk = new StackLL();
        String postfix = "";

        for (int i = 0; i < exArr.length; i++) {
            if(exArr[i] == null){
                break;
            }
            else if (exArr[i].equals("-")) {
                stk.push(exArr[i]);
            } 
            else if (exArr[i].equals("+")) {
                stk.push(exArr[i]);
            } 
            else if (exArr[i].equals("/")) {
                stk.push(exArr[i]);
            } 
            else if (exArr[i].equals("*")) {
                stk.push(exArr[i]);
            } 
            else if (exArr[i].equals("(")) {
            } 
            else if (exArr[i].equals("")) {
            }
            else if (exArr[i].equals(")")) {
                postfix = postfix.concat(stk.pop().toString());
                postfix = postfix.concat(" ");
               
            } 
            else {
                postfix = postfix.concat(exArr[i]);
                postfix = postfix.concat(" ");
            }
        }
        return postfix;
    }

    //converts a string expression into an array of operators and operands
    public String[] toArray(String expression) {
        String[] exp = new String[expression.length()];
        //breaks String expression apart at the characters in the 
        //the middle argument
        StringTokenizer tokenizer
                = new StringTokenizer(expression, "()+-*/ \t", true);
        String token = null;
        int count = 0;

        while (tokenizer.hasMoreTokens()) {
            token = tokenizer.nextToken();
            if(token.equals(" ") || token.equals("\t")){
                continue;
            }
            exp[count] = token;
            count++;
        }
        return exp;
    }
}
