package Modern_Switch_Expression;

public class Basic {
    public static void main(String[] args) {
        String day = "SUNDAY";

        switch (day) {

            case "MONDAY", "TUESDAY", "WEDNESDAY",
                 "THURSDAY", "FRIDAY" ->
                    System.out.println("Working Day");

            case "SATURDAY", "SUNDAY" ->
                    System.out.println("Weekend");

            default ->
                    System.out.println("Invalid Day");
        }

    }
}
