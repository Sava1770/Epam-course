package task1.radix;

import static task1.radix.RadixView.*;

public class RadixController {
    private RadixModel model;
    private RadixView view;

    public RadixController() {
    }

    public RadixController(RadixModel model, RadixView view) {
        this.model = model;
        this.view = view;
    }

    public void change() {
        String result;

        model.setNumber(RadixInput.inputValue(view, INPUT_NUMBER));
        model.setRadixSystem(RadixInput.inputValue(view, INPUT_RADIX));
        result = model.radixChange();
        view.printMessageAndResult(RIGHT_RESULT, result, model.getRadixSystem());
    }
}
