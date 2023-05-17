package one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 올바른 괄호
public class One {
    public String solution(String str){
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x=='(')
                stack.push(x);
            else
                if(stack.isEmpty())
                    return "NO";
                else
                    stack.pop();
        }
        if(!stack.isEmpty())
            return "NO";
        return "YES" ;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        One one = new One();
        System.out.println(one.solution(str));
    }
}
