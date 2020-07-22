package strategy.output_stuff_context;

public class MarkDownList implements ListStrategy {

    @Override
    public void addListItem(StringBuilder sb, String item) {
        sb.append("*").append(item)
          .append(System.lineSeparator());
    }
    
}