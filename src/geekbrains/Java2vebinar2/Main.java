package geekbrains.Java2vebinar2;

import sun.misc.CharacterEncoder;

import javax.print.attribute.standard.MediaSize;

public class Main {

    public static void main(String[] args) {


        String [][] array  = {
                {"3", "3", "3", "3"},
                {"3","3", "3", "3"},
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"},
        };

            arrayCalculation(array);

    }

    public static void arrayCalculation (String [][] array) throws MyArraySizeException, MyArrayDataException {

        if (array.length != 4)
            throw new MyArraySizeException("Only array size 4*4 can be accepted.");
        if (array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4)
            throw new MyArraySizeException("Only array size 4*4 can be accepted.");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (char x = 'a'; x <= 'z'; x++) {
                    if (array[i][j].contains(String.valueOf(x)))
                        throw new MyArrayDataException("Only numbers available");
                }
            }
        }

            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += Double.parseDouble(array[i][j]);
                }
            }
        System.out.println(sum);
    }
}
