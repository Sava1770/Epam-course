package task1.radix;

public class RadixModel {

    private int number;
    private String result = "";
    private int[] array = new int[32];
    private int radixSystem;
    private int i = 0;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setRadixSystem(int radixSystem) {
        this.radixSystem = radixSystem;
    }

    public int getRadixSystem() {
        return radixSystem;
    }

    public String radixChange(){

        while(number > 0){

            array[i] = number % radixSystem;
            number = number / radixSystem;
            i++;
        }

        resultString();

        return result;

    }

    private void resultString() {
        for (int k = i - 1; k >= 0; k--) {
            if (array[k] < 10)
                result += array[k];
            else
                switch (array[k]) {
                    case 10:
                        result += 'A';
                        break;
                    case 11:
                        result += 'B';
                        break;
                    case 12:
                        result += 'C';
                        break;
                    case 13:
                        result += 'D';
                        break;
                    case 14:
                        result += 'E';
                        break;
                    case 15:
                        result += 'F';
                        break;
                }
        }
    }
}