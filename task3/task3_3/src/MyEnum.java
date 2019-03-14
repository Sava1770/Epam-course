import java.io.Serializable;

public abstract class MyEnum implements Comparable<MyEnum> , Serializable {
    private final String name;
    private final int ordinal;

    public MyEnum(String name,  int ordinal){
        this.name = name;
        this.ordinal = ordinal;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return name;
    }

    public int getOrdinal(){
        return ordinal;
    }

    @Override
    public boolean equals (Object obj){
        return this == obj;
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }

    public static <T extends MyEnum> T valueOf(T[] my, String name){
        if(name != null){
            for(T current : my){
                if(current.getName().equals(name)){
                    return current;
                }
            }
        }
        return null;
    }

    @Override
    public final Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

    @Override
    public final int compareTo(MyEnum obj){
        if(obj.getOrdinal() > this.getOrdinal()) return -1;
        if(obj.getOrdinal() < this.getOrdinal()) return 1;
        return 0;
    }

    protected final void finalize(){}

}