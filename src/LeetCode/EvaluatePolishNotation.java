package LeetCode;

import java.util.Stack;

/**
 * Created by ggorantla on 8/3/2014.
 */
public class EvaluatePolishNotation {
    public int evaluatePolishNotation(String[] tokens ){
        Stack<Integer> myStack = new Stack<Integer>();
        int result = 0;
        for(int i = 0 ; i < tokens.length ; i++){

            if(!isOperator(tokens[i])){
                myStack.push(Integer.parseInt(tokens[i]));
            }else{
                int second = myStack.pop();
                if(tokens[i].equals("+"))  result = myStack.pop() + second;
                else if(tokens[i].equals("-"))  result = myStack.pop() - second;
                else if(tokens[i].equals("*"))  result = myStack.pop() * second;
                else if(tokens[i].equals("/"))  result = myStack.pop() / second;
                myStack.push(result);
            }
        }
        return myStack.pop();
    }
    protected boolean isOperator(String str){
        return (str.equals("+") || str.equals("-")|| str.equals("*") || str.equals("/"));
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*" };
        String[] t = {"0", "2", "*"};
        EvaluatePolishNotation dummy = new EvaluatePolishNotation();
        System.out.println(dummy.evaluatePolishNotation(tokens));
        System.out.println(dummy.evaluatePolishNotation(t));
    }
}
