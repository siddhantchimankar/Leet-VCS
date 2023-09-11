package patterns.command;

public class mongo implements database {
    @Override
    public void find() {
        System.out.println("found 5 docs");
    }

    @Override
    public void replace() {
        System.out.println("replaced 5 docs");
    }
}