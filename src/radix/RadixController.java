package radix;

import static radix.RadixView.*;

public class RadixController {
    private RadixModel model;
    private RadixView view;
    private String result;

    public RadixController() {
    }

    public RadixController(RadixModel model, RadixView view) {
        this.model = model;
        this.view = view;
    }

    public void change() {
        model.setNumber(RadixInput.inputValue(view, INPUT_NUMBER));
        model.setRadixSystem(RadixInput.inputValue(view, INPUT_RADIX));
        result = model.radixChange();
        view.printMessageAndResult(RIGHT_RESULT, result, model.getRadixSystem());
    }
}
