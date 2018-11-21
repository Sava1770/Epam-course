public class Main {

    public static void main(String[] args){
        BlackRedTree tree = new BlackRedTree();
        tree.put(4);
        tree.put(10);
        tree.put(12);
        tree.put(13);
        tree.put(15);
        tree.put(17);
        tree.put(19);
        tree.put(5);
        tree.put(7);
//        tree.put(11);
//        tree.put(177);
        System.out.println(tree.isBalanced());
        System.out.println(tree.search(7));
    }
}
