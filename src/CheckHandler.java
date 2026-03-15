abstract class CheckHandler {
    protected CheckHandler next;
    public void setNext(CheckHandler n) { this.next = n; }
    public abstract void handle(String issue);
}
class EngineHandler extends CheckHandler {
    public void handle(String issue) {
        if (issue.contains("Engine")) System.out.println("[CHAIN] Произведен ремонт двигателя.");
        else if (next != null) next.handle(issue);
    }
}
class WheelHandler extends CheckHandler {
    public void handle(String issue) {
        if (issue.contains("Wheel")) System.out.println("[CHAIN] Произведена замена колеса.");
        else if (next != null) next.handle(issue);
    }
}