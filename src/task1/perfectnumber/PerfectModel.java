package task1.perfectnumber;

public class PerfectModel {

    private int maxNumber;

    public void setNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getNumber() {
        return maxNumber;
    }

    public int findDividerSum(int currentNumber, int[] perfectNumbers, int element) {
        int sum = 0;
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
        return element;
    }

    public int[] findPerfectNumbers(){
        int element = 0;
        int currentNumber ;
        int[] perfectNumbers = new int[10];

        for( currentNumber = 1; currentNumber <= maxNumber; currentNumber++) {

            element = findDividerSum(currentNumber, perfectNumbers, element);
        }

        return perfectNumbers;
    }

}