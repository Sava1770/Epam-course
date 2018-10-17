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
        view.outputArray(model);
    }
}
