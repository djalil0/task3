package Chain_of_Responsibility;

public class EngineHandler extends CheckHandler {
    public void handle(String issue) {
        if (issue.contains("Engine")) System.out.println("[CHAIN] Произведен ремонт двигателя.");
        else if (next != null) next.handle(issue);
    }
}
