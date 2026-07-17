package Modern_Switch_Expression;

public class Switch_ExpressionReturn {
    public static void main(String[] args) {
        String day = "MONDAY";

        String result = switch (day) {

            case "SATURDAY", "SUNDAY" -> "Weekend";

            case "MONDAY", "TUESDAY", "WEDNESDAY",
                 "THURSDAY", "FRIDAY" -> "Working Day";

            default -> "Invalid";
        };

        System.out.println(result);
    }
    }

