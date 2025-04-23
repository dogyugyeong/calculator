import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계산기를 시작합니다. 'exit'을 입력하면 종료됩니다.");

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            String input1 = sc.nextLine();
            if (input1.equalsIgnoreCase("exit")) break;

            System.out.print("두 번째 숫자를 입력하세요: ");
            String input2 = sc.nextLine();
            if (input2.equalsIgnoreCase("exit")) break;

            System.out.print("연산자를 입력하세요 (+, -, *, /): ");
            String operator = sc.nextLine();
            if (operator.equalsIgnoreCase("exit")) break;

            try {
                double num1 = Double.parseDouble(input1);
                double num2 = Double.parseDouble(input2);
                double result = 0;

                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/":
                        if (num2 == 0) {
                            System.out.println("0으로 나눌 수 없습니다.");
                            continue;
                        }
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("잘못된 연산자입니다.");
                        continue;
                }

                System.out.println("결과: " + result);
            } catch (NumberFormatException e) {
                System.out.println("숫자를 올바르게 입력하세요.");
            }

            System.out.println();
        }

        System.out.println("계산기를 종료합니다.");
        sc.close();
    }
}
