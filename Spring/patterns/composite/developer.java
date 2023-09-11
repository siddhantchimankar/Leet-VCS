package patterns.composite;

public class developer implements employee{

    private String name;

    public developer(String name) {
        this.name = name;
    }

    @Override
    public void whatAmI() {
        System.out.println("I am a dev called - " + this.name);
    }
}
