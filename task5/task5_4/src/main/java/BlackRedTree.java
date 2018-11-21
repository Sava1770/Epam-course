

public class BlackRedTree {

    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private Node root;
    private Node temp;

    class Node {
        private boolean color;
        private Node left, right, parent;
        private int number;

        public Node(boolean color, int number, Node parent) {
            this.color = color;
            this.number = number;
            this.parent = parent;
        }
    }


    public void put(int number) {
        root = put(root, number, null);


        if (temp != null) {
            if (temp.parent != null) {
                if (temp.parent.parent != null) {
                    root = grandparentBalance(root,number);
                }
            }
        }

        root.color = BLACK;

    }

    private Node put(Node h, int number, Node parent) {

        if (h == null) {
            temp = new Node(RED, number, parent);
            return temp;
        }

        if (h.number < number) {
            h.right = put(h.right, number, h);
        } else if (h.number > number) {
            h.left = put(h.left, number, h);
        }

        return h;
    }

    public boolean isBalanced() {
        Node x = root;
        int black = 0;
        while (x != null) {
            if (x.color == BLACK) {
                black++;
            }
            x = x.left;
        }

        return isBalanced(root, black);
    }

    private boolean isBalanced(Node x, int black) {
        if (x == null) {
            return black == 0;
        }
        if (x.color == BLACK) {
            black--;
        }

        return isBalanced(x.left, black) && isBalanced(x.right, black);
    }

    private Node leftRotate(Node h) {

        Node x = h.right;
        h.right = x.left;
        x.left = h;

        boolean tempColour = x.color;

        x.color = x.left.color;
        x.left.color = tempColour;

        x.parent = x.left.parent;
        x.left.parent = x;
        x.right.parent = x;


        return x;
    }

    private Node rightRotate(Node h) {
        Node x = h.left;
        h.left = x.right;
        x.right = h;

        boolean tempColour = x.color;
        x.color = x.right.color;
        x.right.color = tempColour;


        x.parent = x.right.parent;
        x.right.parent = x;
        x.left.parent = x;


        return x;
    }

    private Node firstBalance(Node h) {
        if (h.parent == null) {
            return h;
        }
        if (h.parent.parent == null || h.parent.parent.left == null || h.parent.parent.right == null) {
            return h;
        }

        if (h.parent.color != BLACK && isLeftChild(h.parent) && h.parent.parent.right.color == RED) {
            h.parent.color = BLACK;
            h.parent.parent.right.color = BLACK;
            h.parent.parent.color = RED;
        }
        if (isRightChild(h.parent) && h.parent.parent.left.color == RED && h.parent.color != BLACK) {
            h.parent.color = BLACK;
            h.parent.parent.left.color = BLACK;
            h.parent.parent.color = RED;
        }

        return h;
    }

    private Node makeBalance(Node h) {

        if (h.parent == null) {
            return h;
        }
        if (h.parent.parent == null) {
            return h.parent;
        }

       h =  firstBalance(h);

        if(isLeftChild(h) && isLeftChild(h.parent) && checkBlack(h) && h.parent.color != BLACK ){
            h = rightRotate(h.parent.parent);
        }

        if(isRightChild(h) && isLeftChild(h.parent) && checkBlack(h) && h.parent.color != BLACK ){
            h = leftRotate(h.parent);
            h = rightRotate(h.parent);
        }

        if (isRightChild(h) && isRightChild(h.parent) && h.parent.color != BLACK && checkBlack(h) ) {
            h = leftRotate(h.parent.parent);
            return h;
        }
        if(isLeftChild(h) && isRightChild(h.parent) && checkBlack(h) && h.parent.color != BLACK ){
            h = rightRotate(h.parent);
            h = leftRotate(h.parent);
            return h;
        }

        return h.parent.parent;
    }

    private boolean isLeftChild(Node h) {
        if (h.parent == null) return false;
        return h.number < h.parent.number;
    }

    private boolean isRightChild(Node h) {

        if (h.parent == null) return false;
        if (h.parent.right.equals(h)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean search(Node h, int number) {   //root at start
        if (h == null) {
            return false;
        }

        if (h.number > number) {
            System.out.println((h.color ? "red" : "black") + ", " + "left  " + h.number);
            return search(h.left, number);
        }
        if (h.number < number) {
            System.out.println((h.color ? "red" : "black") + ", " + "right  " + h.number);
            return search(h.right, number);
        }
        if (h.number == number) {
            System.out.println((h.color ? "red" : "black") + " " + h.number);
            return true;
        } else {
            return false;
        }

    }

    public boolean search(int number) {
        return search(root, number);
    }

    private boolean checkBlack(Node h) {
        if(isRightChild(h.parent)) {
            if ( h.parent.parent == null) {
                return false;
            }
            if (h.parent.parent.left == null) {
                return true;
            }
            return h.parent.parent.left.color == BLACK;
        }else if(isLeftChild(h.parent)){
            if ( h.parent.parent == null) {
                return false;
            }
            if (h.parent.parent.right == null) {
                return true;
            }
            return h.parent.parent.right.color == BLACK;
        }
        return false;
    }

    private Node grandparentBalance(Node h, int number) {
        if (temp.parent.parent == h) {
            h = makeBalance(temp);
            return h;
        }

        if (h.number > number) {
             h.left = grandparentBalance(h.left, number);
        }
        if (h.number < number) {
            h.right = grandparentBalance(h.right, number);
        }

        return h;
    }
}