import java.util.Stack;


public class Main {
	
	public static void main(String[] args){
		System.out.println(isBalanced("[([])}"));
	
	}
//Design a method to check if brackets are balanced
//Use stack to push the left brackets, keep scanning, 
//when meet the right, (if stack is empty, report wrong), if it is the match, pop, otherwise report wrong
//If finally the stack is empty, then it is balanced
	public static boolean isBalanced(String s){
		Stack<String> stack=new Stack<>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
				stack.push(Character.toString(s.charAt(i)));
			}
			if(s.charAt(i)==')'){
				if(stack.isEmpty()) return false;
				if(stack.peek().equals("(")){//stack.peek()=="(" is wrong
					stack.pop();
				}else{
					return false;
				}		
			}
			if(s.charAt(i)==']'){
				if(stack.isEmpty()) return false;
				if(stack.peek().equals("[")){
					stack.pop();
				}else{
					return false;
				}		
			}
			if(s.charAt(i)=='}'){
				if(stack.isEmpty()) return false;
				if(stack.peek().equals("{")){
					stack.pop();
				}else{
					return false;
				}		
			}
			                                                              
		}
		if(stack.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
}

