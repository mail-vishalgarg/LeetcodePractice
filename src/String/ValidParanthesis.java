package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
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
	
	public static boolean isValid_2(String s){
		HashMap<Character, Character> brkts = new HashMap<Character, Character>();
		brkts.put('{', '}');
		brkts.put('[', ']');
		brkts.put('(', ')');
		
		System.out.println("MAX VALUE:" + Integer.MAX_VALUE);
		//System.out.println(brkts.keySet());
		//Travers the HashMap using below method
		/*for(char c :brkts.keySet()){
			System.out.println("Key:" + c + " Value:" + brkts.get(c));
		}
		System.out.println("-------------------------------------------------");
		Set<Map.Entry<Character, Character>> entrySet = brkts.entrySet();
		for(Entry<Character, Character> entry :entrySet){
			System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
		}*/
		
		Stack<Character> stack = new Stack<Character>();
		for (int i =0; i<s.length();i++){
			if (!stack.empty() && (s.charAt(i) == brkts.get(stack.peek()))){
				stack.pop();
			}else if (!brkts.keySet().contains(s.charAt(i))){
				return false;
			}else{
				stack.push(s.charAt(i));
			}
		}
		return stack.empty();
	}
	
	public static void main(String[] args){
		String s = "{([])}";
		System.out.println(isValid_2(s));
		System.out.println("-----------------");
		System.out.println(isValid(s));
		System.out.println(isValid("(){}[]"));
		System.out.println(isValid("({[{[]}]})"));
		System.out.println(isValid("({[[]}])"));
	}
	
}
