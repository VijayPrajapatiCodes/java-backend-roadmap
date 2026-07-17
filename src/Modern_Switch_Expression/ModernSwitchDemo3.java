package Modern_Switch_Expression;

public class ModernSwitchDemo3 {
    public static void main(String[] args) {

        char grade = 'A';

        String message = switch (grade) {

            case 'A' -> "Excellent";

            case 'B' -> "Very Good";

            case 'C' -> "Good";

            case 'D' -> "Average";

            case 'F' -> "Fail";

            default -> "Invalid Grade";
        };

        System.out.println(message);
    }
    }

