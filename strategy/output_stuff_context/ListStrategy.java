package strategy.output_stuff_context;

public interface ListStrategy{

    default void start(StringBuilder start){}
    void addListItem(StringBuilder sb, String item);
    default void end(StringBuilder end){}
}