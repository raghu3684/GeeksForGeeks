package LeetCode;
import com.company.ReverseAnArray;

import java.util.Stack;
/**
 * Created by ggorantla on 8/2/2014.
 */
public class ReverseAString {
    public String reverseAString(String str){
        String[] splits = str.split(" ");
        StringBuilder res = new StringBuilder();
        Stack<String> myStack = new Stack<String>();
        for(String iter : splits)
            if(!iter.isEmpty()) myStack.push(iter);
        while (!myStack.isEmpty()){
            res.append(myStack.pop());
            if(!myStack.isEmpty())res.append(" ");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        ReverseAString dummy = new ReverseAString();
        String str = new String("Raghu is a good boy");
        String res = dummy.reverseAString(str);
        System.out.println(res);
    }
}
