// 선형 자료구조 - 스택

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("stack = " + stack);
        
//        stack.pop();
        System.out.println(stack.pop());
        System.out.println("stack = " + stack);
        
//        stack.pop();
        System.out.println(stack.pop());
        System.out.println("stack = " + stack);

        System.out.println(stack.peek());
        System.out.println("stack = " + stack);

        System.out.println(stack.contains(1));
        System.out.println(stack.size());
        System.out.println(stack.empty());

        stack.clear();
        System.out.println("stack = " + stack);
//        stack.pop(); // 비어있는 상태에서는 에러 발생
        
    }

}
