package task3.task3;

import java.util.ArrayList;
import java.util.List;

public class EnumClass {

     private final String name;
     private final int ordinal;

    protected EnumClass(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    public String name(){
        return name;
    }

    public int ordinal(){
        return ordinal;
    }




}
