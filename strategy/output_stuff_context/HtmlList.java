package strategy.output_stuff_context;


public class HtmlList implements ListStrategy{

    @Override
    public void addListItem(StringBuilder sb, String item) {
        sb.append("  <li>")
            .append(item)
            .append("</li>")
            .append(System.lineSeparator());
            

    }

    @Override
    public void start(StringBuilder start) {
        start.append("<ul>").append(System.lineSeparator());
    }

    @Override
    public void end(StringBuilder end) {
        end.append("</ul>").append(System.lineSeparator());
    }
    
}