package strategy.output_stuff_context;

import java.util.List;

public class Run {

    public static void main(String[] args) {
        TextoProcessor tp = new TextoProcessor(OutPutFormat.MARKDOWN);
        tp.appendlist(List.of("Brasil","Argentina","Osasco"));
        System.out.println(tp);
        tp.clear();

        tp = new TextoProcessor(OutPutFormat.HTML);
        tp.appendlist(List.of("Brasil","Argentina","Osasco"));
        System.out.println(tp);
    }
    
}