package controller;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import model.JournalModel;
import view.Constants;
import view.InputUtility;
import view.JournalView;

public class JournalController {

    private JournalModel model;
    private JournalView view;

    public JournalController(JournalModel model, JournalView view){
        this.model = model;
        this.view = view;
    }

    private String regExStudentName = "^[A-Z][a-z]+";
    private String regExSecondName = "[A-Z][a-z]+";
    private String regExBirthDate = "(\\d{2}\\.){2}\\d{4}";
    private String regExPhone = "\\+\\d{3}\\(\\d{2}\\)(\\-\\d{2}){2}\\-\\d{3}";
    private String regExAddress = "\\w+,\\d+";

    public void run(){
        String studentName, secondName, birthDate, phone, address;
        studentName = inputData(regExStudentName, Constants.INPUT_NAME);
        secondName = inputData(regExSecondName, Constants.INPUT_SECOND_NAME);
        birthDate = inputData(regExBirthDate, Constants.INPUT_BIRTH_DATE);
        phone = inputData(regExPhone, Constants.INPUT_PHONE);
        address = inputData(regExAddress, Constants.INPUT_ADDRESS);

        model.addNote(studentName, secondName, birthDate, phone, address);

        view.printJournal(model.getNotes());

    }

    private String inputData(String regEx, String message){
        return InputUtility.inputStringValue(view, message, regEx);
    }
}
