package task1.perfectnumber;

public class PerfectController {

    private PerfectModel model;
    private PerfectView view;

    public PerfectController(){}
    public PerfectController(PerfectModel model, PerfectView view){
        this.model = model;
        this.view = view;
    }

    public void find(){


        model.setNumber(PerfectInput.inputValue(view));

        int[] perfectNumbers = model.findPerfectNumbers();

        for(int i = 0; i < perfectNumbers.length; i++) {
            if (perfectNumbers[i] > 0)
                view.printMessageAndResult(view.RIGHT_RESULT, perfectNumbers[i]);
        }
    }
}
