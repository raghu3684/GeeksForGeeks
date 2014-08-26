package LinkedList;

/**
 * Created by ggorantla on 8/23/2014.
 */
public class AddBinary {
    public String addBinary(String a, String b){
         StringBuilder aa = new StringBuilder(a);
         StringBuilder bb = new StringBuilder(b);
        StringBuilder res = new StringBuilder();
        char carry = '0';
        int i = 0;
        while (i < aa.length() && i < bb.length()){
            if(aa.charAt(i) == bb.charAt(i)){
                res.append(carry);
                carry = aa.charAt(i);
            }else {
                res.append((carry == '0')?'1':'0');
            }
            i++;
        }

        while (i < aa.length()){
            if (aa.charAt(i) == '0'){
                res.append(carry);
                carry = aa.charAt(i);
            }else {
                res.append((carry)== '0' ? '1' :'0');
            }
        }

        while (i < bb.length()){
            if (bb.charAt(i) == '0'){
                res.append(carry);
                carry = bb.charAt(i);
            }else {
                res.append((carry)== '0' ? '1' :'0');
            }
        }
        return res.toString();
    }
}
