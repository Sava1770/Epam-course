package view;

/**
 * final class with all constants from the project
 */

public final class Constants {
    public static final String WRONG_INPUT_NUMBER = "Wrong input!Please repeat.";
    public static final String FIRST_OUTPUT = "           €(euro)    $(dollar)  ₴(hryvnia)" +
                                            "\nPrivat       12%         13%         14%" +
                                            "\nMonobank     11%         12%         12%" +
                                            "\nOschad       15%         15%         15%" +
                                            "\nRaiffaisen   13%         14%         14%";
    public static final String OUTPUT_SELECT_CURRENCY = "Choose a currency:\n" +
            "1 - €(euro)\n"+
            "2 - $(dollar)\n"+
            "3 - ₴(hryvnia)";
    public static final String SUM_INPUT = "\nPlease input a sum what you want to put in the bank:";
    public static final String TIME_INPUT = "\nPlease input the time(year):";
    public static final String SORT_INPUT = "Please choose by what parameter, do you want to sort:" +
                                            "\n1 - sort by sum" +
                                            "\n2 - sort by banks names" +
                                            "\nelse - dont want to sort";
}
