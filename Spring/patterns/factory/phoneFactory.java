package patterns.factory;

public class phoneFactory {
    public static phone buildPhone (Integer ram, Integer cpus, String display) {
        if(ram > 64 || cpus > 4 || display == "retina") return new applePhone();
        else return new AndroidPhone();
    }
}
