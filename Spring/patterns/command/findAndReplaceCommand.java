package patterns.command;

public class findAndReplaceCommand implements command {

    private database db;

    public findAndReplaceCommand(database db) {
        this.db = db;
    }

    @Override
    public void execute() {
        command find = new findCommand(db);
        command replace = new replaceCommand(db);
        find.execute();
        replace.execute();
    }
}
