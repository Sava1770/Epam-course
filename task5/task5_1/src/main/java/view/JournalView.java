package view;

import entity.NoteInCuratorJournal;

import java.util.List;

public class JournalView {

    public void printMessage(String message){
        System.out.print(message);
    }

    public void printJournal(List<NoteInCuratorJournal> notes){
        for(int i = 0; i < notes.size(); i++) {
            System.out.println(notes.get(i).getStudentName() + " " + notes.get(i).getStudentSecondName() +
                                " " + notes.get(i).getPhone() + " " + notes.get(i).getAdress() + " " + notes.get(i).getBirthdayDate());
        }
    }
}
