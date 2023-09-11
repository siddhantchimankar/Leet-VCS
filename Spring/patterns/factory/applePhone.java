package patterns.factory;

public class applePhone implements phone {
    @Override
    public void build() {
        System.out.println("building your iPhone -->");
    }
}
