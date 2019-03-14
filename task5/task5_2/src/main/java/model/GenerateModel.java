package model;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;

public class GenerateModel {

     private GenerateRepository repository;

     public GenerateModel (GenerateRepository repository){
        this.repository = repository;
     }

     public List<String> getList(){
         return repository.getList();
     }

    public Set<String> getSet(){
         return repository.getSet();
    }

    public List<String> generateList(int size){

        char temp = 97;
        List<String> list = repository.getList();

        for(int i = 0; i < size; i++){
            list.add("List :" + temp++);
        }

        return list;
    }

    public Set<String> generateSet(int size){

        char temp = 97;
        Set<String> set = repository.getSet();


        for(int i = 0; i < size; i++){
            set.add("Set :" + temp++ );
        }

        return set;
    }

}
