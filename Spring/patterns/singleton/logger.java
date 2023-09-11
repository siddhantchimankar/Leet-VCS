public class logger {
    private static logger l1 = null;
    public static logger getInstance() {
        if(l1 == null)
            synchronized (logger.class) {
                if(l1 == null) l1 = new logger();
            }
        return l1;
    }

    public static void info(String msg) {
        System.out.println("pushing into logstash --> " + msg);
    }
}
