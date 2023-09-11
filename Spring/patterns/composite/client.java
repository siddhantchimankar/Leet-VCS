package patterns.composite;

public class client {
    public static void main(String[] args) {
        System.out.println("client code running ---> ");
        //composite pattern is all about hierarchy
        //its about classes having other classes in them
        //compostion is almost always better than inheritance
        //lets have a simple hierarchy of a manager and 2 devs that report to him/her
        manager anurag = new manager("anurag");
        developer ravi = new developer("ravi");
        developer tom = new developer("tom");
        anurag.addDev(ravi);
        anurag.addDev(tom);
        anurag.whatAmI();
    }
}
