package xw.util;

import java.util.ArrayList;

public class Value {
    public Object val;

    public Value(Object val){
        this.val = val;
    }

    @Override
    public String toString() {
        return val.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Value) {
            if (toString().equals(obj.toString()))
                return true;
            else
                return false;
        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}
