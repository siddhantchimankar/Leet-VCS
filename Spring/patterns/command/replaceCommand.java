package patterns.command;

public final class replaceCommand implements command {
    private database db;

    public replaceCommand(database db) {
        this.db = db;
    }

    @Override
    public void execute() {
        db.replace();
    }
}
