package Easy;

import java.util.Stack;

public class Baseball_Game {
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String x : operations) {
            switch (x) {
                case "+" -> {
                    int temp1 = stack.pop();
                    int temp2 = stack.peek();
                    stack.push(temp1);
                    stack.push(temp1 + temp2);
                }
                case "D" -> stack.push(stack.peek() * 2);
                case "C" -> stack.pop();
                default -> stack.push(Integer.parseInt(x));
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }

    public static void main(String[] args) {
        String[] operations = {"5","2","C","D","+"};

        System.out.println(calPoints(operations));
    }
}
