import java.util.Stack;

public class prefixTopostfix {

    public static void main(String[] args) {
        
        String prefix = "-9/*+5346";

        Stack<String> val = new Stack<>();

        for(int i = prefix.length() - 1; i >= 0; i--){

            char ch = prefix.charAt(i);

            int ascii = (int)ch;

            if(ascii >= 48 && ascii <= 57){
                int n = ascii-48;
                val.push("" + n);
                
            }

            else if(ch=='+' || ch=='-' || ch== '*' || ch == '/'){

                String v1 = val.pop();
                String v2 = val.pop();

                String t = "" + v1 + v2 + ch;

                val.push(t);
            }
        }

        System.out.println(val.peek());
    }
    
}
