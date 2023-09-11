package patterns.factory;

public class AndroidPhone implements phone {
    @Override
    public void build() {
        System.out.println("building your android phone -->");
    }
}
