package Modern_Switch_Expression;

public class ModernSwitchCalcul {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        char operator = '*';

        int result = switch (operator) {

            case '+' -> a + b;

            case '-' -> a - b;

            case '*' -> a * b;

            case '/' -> a / b;

            default -> 0;
        };

        System.out.println(result);
    }

}

