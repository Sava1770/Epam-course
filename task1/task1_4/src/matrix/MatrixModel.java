package matrix;

public class MatrixModel {

    private int size = 7;
    private int[][] array = new int[size][size];

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public int[][] getArray() {
        return array;
    }

    public void matrixTurn(){

        for (int x = 0; x < size/ 2; x++)
        {

            for (int y = x; y < size-x-1; y++)
            {
               int temp = array[x][y];
               array[x][y] = array[y][size-1-x];
               array[y][size-1-x] = array[size-1-x][size-1-y];
               array[size-1-x][size-1-y] = array[size-1-y][x];
               array[size-1-y][x] = temp;
            }
        }
    }

    public void matrixCreate(){

        for(int x = 0; x < size; x++){
            for (int y = 0; y < size; y++){
            array[x][y] = (int) (Math.random() * 100);                                            //рандомим число

            if(Math.random() > 0.5){                                                              //рандомим знак
                array[x][y] = array[x][y] * (-1);
            }
            }
        }
    }



}

