package main;

import controller.VocabularyController;
import model.VocabularyModel;
import model.VocabularyRepository;
import view.VocabularyView;

public class Main {

    public static void main(String[] args){
        VocabularyView view = new VocabularyView();
        VocabularyRepository repository = new VocabularyRepository();
        VocabularyModel model = new VocabularyModel(repository);
        VocabularyController controller = new VocabularyController(model, view);

        controller.run();
    }
}
