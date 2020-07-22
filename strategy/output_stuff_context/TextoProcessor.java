package strategy.output_stuff_context;

import java.util.List;

public class TextoProcessor {

    private StringBuilder sb = new StringBuilder();
    private ListStrategy listStrategy;

    public TextoProcessor(OutPutFormat format){

        setOutputFormat(format);
    }

    public void setOutputFormat(OutPutFormat format){

        switch(format){
            case MARKDOWN:
                listStrategy = new MarkDownList();
                break;
            case HTML:
                listStrategy = new HtmlList();
                break;
        }
    }

    public void appendlist(List<String> items){
        listStrategy.start(sb);
        for (String item: items){
            listStrategy.addListItem(sb, item);
        }
        listStrategy.end(sb);
    }

    public void clear(){
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    
}