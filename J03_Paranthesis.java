import java.util.Scanner;
import java.util.Stack;

public class J03_Paranthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String exp=sc.next();
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char ch=exp.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') 
				stack.push(ch);
			else {
				if(stack.isEmpty()) {
					System.out.println("Unbalanced");
					stack.push('}');
					break;
				}
				if(ch==')') {
					char top=stack.peek();
					if(top!='(') {
						System.out.println("Unbalanced");
						break;
					}stack.pop();
				}
				if(ch=='}') {
					char top=stack.peek();
					if(top!='{') {
						System.out.println("Unbalanced");
						break;
					}
					stack.pop();
				}
				
				if(ch==']') {
					char top=stack.peek();
					if(top!='[') {
						System.out.println("Unbalanced");
						break;
					}
					stack.pop();
				}
			}
		}
		if(stack.isEmpty()) 
			System.out.println("Balanced");

	}

}