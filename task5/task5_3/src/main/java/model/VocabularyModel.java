package model;

public class VocabularyModel {

    private VocabularyRepository repository;

    public VocabularyModel(VocabularyRepository repository){
        this.repository = repository;
    }

    public String getPair(String key){
        return repository.getPair(key);
    }

    public void addPair(String key, String value){
        repository.addPair(key, value);
    }

    public void init(){
        repository.init();
    }
}
