package radix;

public class Main {

    public static void main(String[] args) {
        RadixView view = new RadixView();
        RadixModel model = new RadixModel();
        RadixController controller = new RadixController(model, view);

        controller.change();
    }

}
