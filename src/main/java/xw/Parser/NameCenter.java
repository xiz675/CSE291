package xw.Parser;

import java.util.HashMap;

public class NameCenter {
    private static NameCenter single_instance = null;
    public HashMap<String, MatchElement> name_element_map = new HashMap<String, MatchElement>();

    public static NameCenter getInstance()
    {
        if (single_instance == null)
            single_instance = new NameCenter();

        return single_instance;
    }
    private Integer idx = 0;
    public String getAvailableAlias(boolean isVertex, MatchElement me){
        idx++;
        if(isVertex){
            this.name_element_map.put( "MyVertex"+ idx.toString(), me);
            return "MyVertex"+ idx.toString();
        }else{
            this.name_element_map.put( "MyEdge"+ idx.toString(), me);
            return "MyEdge"+ idx.toString();
        }
    }
}
