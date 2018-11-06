package entity;

public class Bank {

    private String name;
    private double percentPerYear;
    private boolean opportunityToGet;
    private boolean opportunityToSet;
    private double percentYearIncrease;
    private boolean application;
   // private int percentPerDay;

    public Bank(String name, int percentPerYear, boolean opportunityToGetSet, int percentYearIncrease, boolean application ){
        this.name = name;
        this.percentPerYear = percentPerYear;
        this.opportunityToGet = opportunityToGetSet;
        this.opportunityToSet = opportunityToGetSet;
        this.percentYearIncrease = percentYearIncrease;
        this.application = application;
    }

    public boolean isApplication() { return application; }
    public void setApplication(boolean application) { this.application = application; }
    public double getPercentPerYear() {
        return percentPerYear;
    }
    public void setPercentPerYear(int percentPerYear) {
        this.percentPerYear = percentPerYear;
    }
    public boolean isOpportunityToGet() {
        return opportunityToGet;
    }
    public void setOpportunityToGet(boolean opportunityToGet) {
        this.opportunityToGet = opportunityToGet;
    }
    public boolean isOpportunityToSet() {
        return opportunityToSet;
    }
    public void setOpportunityToSet(boolean opportunityToSet) {
        this.opportunityToSet = opportunityToSet;
    }
    public double getPercentYearIncrease() {
        return percentYearIncrease;
    }
    public void setPercentYearIncrease(int percentYearIncrease) {
        this.percentYearIncrease = percentYearIncrease;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
