package Chain_of_Responsibility;

public abstract class CheckHandler {
    protected CheckHandler next;
    public void setNext(CheckHandler n) { this.next = n; }
    public abstract void handle(String issue);
}

