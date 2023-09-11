package patterns.command;

public class client {
    public static void main(String[] args) {
        System.out.println("client code running ---> ");
        database d1 = new mongo();
        command c1 = new findCommand(d1);
        command c2 = new replaceCommand(d1);
        invoker find = new invoker(c1);
        invoker replace = new invoker(c2);
        find.execute();
        replace.execute();
        command c3 = new findAndReplaceCommand(d1);
        invoker findAndReplace = new invoker(c3);
        findAndReplace.execute();
    }
}
