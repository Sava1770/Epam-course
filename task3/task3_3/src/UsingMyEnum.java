public class UsingMyEnum extends MyEnum {

    public UsingMyEnum(String name, int ordinal){
        super(name, ordinal);
    }

    public static final UsingMyEnum FIRST = new UsingMyEnum("First",1);
    public static final UsingMyEnum SECOND = new UsingMyEnum("Second",2);
    public static final UsingMyEnum THIRD = new UsingMyEnum("Third",3);

    private static final UsingMyEnum[] val = new UsingMyEnum[]{
            FIRST,
            SECOND,
            THIRD
    };

    public UsingMyEnum[] values(){
        return  val;
    }
}
