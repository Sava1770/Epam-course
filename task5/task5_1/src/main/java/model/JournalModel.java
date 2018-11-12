package model;

import entity.NoteInCuratorJournal;

import java.util.List;

public class JournalModel {

    private JournalRepository repository;

    public JournalModel(JournalRepository repository){
        this.repository = repository;
    }

    public List<NoteInCuratorJournal> getNotes(){
        return repository.getNotes();
    }

    public void addNote(String studentName, String secondName, String birthDate, String phone, String address){
        repository.addInJournal(studentName, secondName, birthDate, phone, address);
    }

    public NoteInCuratorJournal removeNote(int index){
       return repository.removeFromJournal(index);
    }
}
