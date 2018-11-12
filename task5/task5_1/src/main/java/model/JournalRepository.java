package model;

import entity.NoteInCuratorJournal;

import java.util.ArrayList;
import java.util.List;

public class JournalRepository {

    private List<NoteInCuratorJournal> notes = new ArrayList<>();

    public void addInJournal(String studentName, String secondName, String birthDate, String phone, String address){
        notes.add(new NoteInCuratorJournal(studentName, secondName, birthDate, phone, address));
    }

    public NoteInCuratorJournal removeFromJournal(int index){
        NoteInCuratorJournal temp = notes.get(index);
        notes.remove(notes.get(index));
        return temp;
    }

    public List<NoteInCuratorJournal> getNotes() {
        return notes;
    }
}
