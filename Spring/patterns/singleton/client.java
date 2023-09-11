public class client {
    public static void main(String[] args) {
        System.out.println("client code is running --->");
        //instantiate 2 instances of a logger and print the objects
        //As logger class is Singleton, both objects should be same
        logger l1 = logger.getInstance();
        logger l2 = logger.getInstance();
        logger.info("hello world");
        System.out.println(l1 + " " + l2);
    }
}
