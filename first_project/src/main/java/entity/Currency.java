package entity;

public class Currency {

    private String name;
    private int valueForPrivat;
    private int valueForMonobank;
    private int valueForRaiffaisen;
    private int valueForOschad;

    public Currency(String name, int valueForPrivat, int valueForRaiffaisen, int valueForOschad, int valueForMonobank){
        this.valueForRaiffaisen = valueForRaiffaisen;
        this.valueForPrivat = valueForPrivat;
        this.valueForOschad = valueForOschad;
        this.valueForMonobank = valueForMonobank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValueForMonobank() {
        return valueForMonobank;
    }

    public void setValueForMonobank(int valueForMonobank) {
        this.valueForMonobank = valueForMonobank;
    }

    public int getValueForOschad() {
        return valueForOschad;
    }

    public void setValueForOschad(int valueForOschad) {
        this.valueForOschad = valueForOschad;
    }

    public int getValueForPrivat() {
        return valueForPrivat;
    }

    public void setValueForPrivat(int valueForPrivat) {
        this.valueForPrivat = valueForPrivat;
    }

    public int getValueForRaiffaisen() {
        return valueForRaiffaisen;
    }

    public void setValueForRaiffaisen(int valueForRaiffaisen) {
        this.valueForRaiffaisen = valueForRaiffaisen;
    }

    public void setAll(int valueForPrivat, int valueForRaiffaisen, int valueForOschad, int valueForMonobank){
        this.valueForRaiffaisen = valueForRaiffaisen;
        this.valueForPrivat = valueForPrivat;
        this.valueForOschad = valueForOschad;
        this.valueForMonobank = valueForMonobank;
    }
}
