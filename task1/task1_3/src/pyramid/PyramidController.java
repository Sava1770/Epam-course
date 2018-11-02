package pyramid;


public class PyramidController {

    private PyramidModel model;
    private PyramidView view;

    public PyramidController(){}
    public PyramidController(PyramidModel model, PyramidView view){
        this.model = model;
        this.view = view;
    }

   public void makePyramid(){

       model.setHeight(PyramidInput.inputValue(view));
       model.pyramidBuild();
   }

}
