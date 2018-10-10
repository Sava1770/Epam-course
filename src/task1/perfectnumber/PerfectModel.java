package task1.perfectnumber;

public class PerfectModel {

    private int maxNumber;
    private int currentNumber = 1;
    private int[] perfectNumbers = new int[10];
    private int sum = 0;
    private int element = 0;

    public void setNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getNumber() {
        return maxNumber;
    }

    public void findDividerSum() {

        int halfNumber = currentNumber / 2;

        for (int i = 1; i <= halfNumber; i++) {
            if (currentNumber % i == 0) {
                sum += i;
            }
        }

        if (sum == currentNumber) {
            perfectNumbers[element] = currentNumber;
            element++;
        }
    }

    public int[] findPerfectNumbers(){

        for( currentNumber = 1; currentNumber <= maxNumber; currentNumber++) {
            sum = 0;
            findDividerSum();
        }

        return perfectNumbers;
    }

}