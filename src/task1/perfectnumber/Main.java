package task1.perfectnumber;

public class Main {


    public static void main(String[] args) {
        PerfectView view = new PerfectView();
        PerfectModel model = new PerfectModel();
        PerfectController controller = new PerfectController(model, view);

        controller.find();
    }
}
