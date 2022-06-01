package HW2;

/**
 * @author Александр Ключка
 * @date 5/23/2022
 */


public class MyArrayDataException extends Exception {
    public int i;
    public int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }

}

