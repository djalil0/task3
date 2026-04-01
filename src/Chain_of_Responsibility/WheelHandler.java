package Chain_of_Responsibility;

public class WheelHandler extends CheckHandler {
    public void handle(String issue) {
        if (issue.contains("Wheel")) System.out.println("[CHAIN] Произведена замена колеса.");
        else if (next != null) next.handle(issue);
    }
}
