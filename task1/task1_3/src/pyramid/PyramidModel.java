package pyramid;

public class PyramidModel {

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void pyramidBuild(){
        int numberOfSpaces = height-1;
        for (int k = 1 ,j = 1; k <= height; k++){
            for (int switcher = 0; j > 0 && j <= k;) {
                if ((j < k || (k==1 && j==1)) && switcher == 0) {
                    for (int currentNumOfSpaces = numberOfSpaces; j == 1 && currentNumOfSpaces > 0; currentNumOfSpaces--) {
                        System.out.print(" ");
                    }
                    System.out.print(j);
                    j++;

                } else {
                    switcher = 1;
                    System.out.print(j);
                    j--;
                }

            }
            j=1;
            System.out.print("\n");
            numberOfSpaces--;
        }
    }



}
