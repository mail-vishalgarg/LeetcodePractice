package String;

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesis {
	public static boolean isValid(String s){
		HashMap<Character, Character> brkts = new HashMap<Character, Character>();
		brkts.put('{', '}');
		brkts.put('(',')');
		brkts.put('[',']');
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i=0; i <s.length();i++){
			if (!stack.isEmpty() && s.charAt(i) == brkts.get(stack.peek())){
				stack.pop();
			}else if (!brkts.keySet().contains(s.charAt(i))){
				return false;
			} else{
				stack.push(s.charAt(i));
			}
		}
		return stack.empty();
	}
	
	public static void main(String[] args){
		String s = "{([])}";
		System.out.println(isValid(s));
		System.out.println(isValid("(){}[]"));
		System.out.println(isValid("({[{[]}]})"));
		System.out.println(isValid("({[[]}])"));
	}
	
}
