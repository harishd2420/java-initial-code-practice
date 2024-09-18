import java.util.Scanner;
import java.util.Stack;

public class stck {
    static int priority(char c){
        int n=0;
        switch (c){
            case '$':
            case '^':
                n=4;
                break;
            case '*':
            case '/':
                n=3;
                break;
            case '+':
            case '-':
                n=2;
                break;
            case '=':
                n=1;
                break;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> infixtopostfix=new Stack<>();
        String s= sc.nextLine();
        int sy=0;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)||Character.isDigit(c)) {
                System.out.print(c+" ");
            } else{
                if (c == '(') {
                    infixtopostfix.push(c);
                } else if (c == ')') {
                    char a = ')';
                    while (a != '(') {
                        a = infixtopostfix.pop();
                        if(a!='('&&a!=')')
                        System.out.print(a+" ");
                    }
                } else {
                        int f=priority(infixtopostfix.peek());
                        int se=priority(c);
                        if(f<se)
                            infixtopostfix.push(c);
                        else{
                            System.out.print(infixtopostfix.pop()+" ");
                            infixtopostfix.push(c);
                        }

                }
            }
        }
    }
}