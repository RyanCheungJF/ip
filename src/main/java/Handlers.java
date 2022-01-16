public enum Handlers {
    BYE("bye"),
    DEADLINE("deadline"),
    DELETE("delete"),
    EVENT("event"),
    MARK("mark"),
    LIST("list"),
    TODO("todo"),
    UNMARK("unmark");

    public final String label;

    private Handlers(String label) {
        this.label = label;
    }
}
