package patterns.factory;

public class client {
    public static void main(String[] args) {
        System.out.println("client code running --->");
        //let's say we want to create instances of a phone
        //but their are different type of phones based on different requirements
        //and we dont want all that complexity of choosing the phone on the client side
        //We want the client to simply provide inputs and the phone factory should take care of the rest
        //lets first have an interface and its concrete classes and have a factory to build instances
        phone p = phoneFactory.buildPhone(64, 4, "retina");
        p.build();
    }
}
