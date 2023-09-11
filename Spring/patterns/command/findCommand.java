package patterns.command;

public final class findCommand implements command {
    private database db;

    public findCommand(database db) {
        this.db = db;
    }

    @Override
    public void execute() {
        db.find();
    }
}
