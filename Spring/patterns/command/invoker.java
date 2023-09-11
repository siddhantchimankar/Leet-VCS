package patterns.command;

public class invoker {
    private command c;

    public invoker(command c) {
        this.c = c;
    }

    public void execute() {
        c.execute();
    }
}
