package patterns.builder;

public class client {
    public static void main(String[] args) {
        System.out.println("client code running ---> ");
        //first we need a class whose instance we want to create
        //now this class has a lot of parameters - some required and some optional
        //we dont want client to know all these parameters at once and the order in which to provide them
        //so we create a builder class which will help us build the instance in a flexible manner
        phone.builder b = new phone.builder().setCpus(4);
        //some logic
        b.setRam(45);
        //some logic
        b.setDisplay("amoled");
        //some logic
        phone p = b.build();
        System.out.println(p.toString());
    }
}
