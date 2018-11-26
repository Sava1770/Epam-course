public class Main {

    public static void main (String[] args){
        ReflectionUse use = new ReflectionUse();
        try{
            use.run();
        }catch(NoSuchFieldException e){
            System.out.println(e);
        }catch (IllegalAccessException e){
            System.out.println(e);
        }
    }
}
