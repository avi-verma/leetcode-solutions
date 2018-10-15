import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

class Parentheses {

    public static void main(String[] args) throws IOException {
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    String string=reader.readLine();
    HashMap<Character , Character> map=new HashMap<>();
    map.put(')', '(');
    map.put('}', '{');
    map.put(']', '[');
    Stack stack=new Stack();
    for(int i=0;i<string.length();i++){
      
    if(!stack.isEmpty() && stack.peek().equals(map.get(string.charAt(i))) ){
        stack.pop();
        
    }
    else 
        stack.add(string.charAt(i));
    
    }
  
        System.out.println(stack.isEmpty()?true:false);
      

    }


}
