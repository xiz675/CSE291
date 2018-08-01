package xw.util;

import java.util.ArrayList;

public class Tuple {
    public ArrayList<Value> data;

    public Tuple(int sizeOfTuple){
        this.data = new ArrayList<Value>(sizeOfTuple);
    }

}
