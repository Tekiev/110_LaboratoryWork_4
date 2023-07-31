package DEV110_4_Tekiev;

import java.util.Arrays;

public class ArrayOfInt implements InterfaceOFBooleanValues {

    int [] array;

    {

        int tempsize = size%32 == 0 ? size/32 : (size/32) +1;

        array = new int[tempsize];

    }

    public boolean checkElement(int i) {            // метод возвращает значение элемента

        if (i >= 0 && i < size)

        {
            int indexArray = i/32;

            int bitIndex = i%32;

            int element = array[indexArray];

            int mask = 1 << bitIndex;

            return (element&mask) == mask;

        }
        else {

            String error = "Введите индекс элемента массива в пределах от 0 до " + (array.length-1);

            throw new IllegalArgumentException (error);
        }
    }
    public void setTrue(int i) {    // метод устанавливает true в заданный элемент

        if (i >= 0 && i < size)
        {
            int indexArray = i/32;

            int bitIndex = i%32;

            int element = array[indexArray];

            int mask = 1 << bitIndex;

            array[indexArray] = element | mask;

        }
        else {

            String error = "Введите индекс элемента массива в пределах от 0 до " + (array.length-1);

            throw new IllegalArgumentException (error);
        }
    }
    public void setValue(int i, boolean b) {  // метод устанавливает заданное значение в заданный элемент массива

        if (i >= 0 && i < size)

        {

            int indexArray = i/32;

            int bitIndex = i%32;

            int element = array[indexArray];

            int mask = 1 << bitIndex;

            if (b) {

                array[indexArray] = element | mask;

            }
            else {

                array[indexArray] = element & ( ~ mask);

            }

        }
        else {

            String error = "Введите индекс элемента массива в пределах от 0 до " + (array.length-1);

            throw new IllegalArgumentException (error);
        }
    }
    public void setFalse(int i) {  // метод устанавливает false в заданный элемент

        if (i >= 0 && i < size)
        {
            int indexArray = i/32;

            int bitIndex = i%32;

            int element = array[indexArray];

            int mask = 1 << bitIndex;

            array[indexArray] = element & ( ~ mask);
        }
        else {

            String error = "Введите индекс элемента массива в пределах от 0 до " + (array.length-1);

            throw new IllegalArgumentException (error);
        }
    }
    public void invertValue(int i) {    // метод инвертирует значение заданного элемента

        if (i >= 0 && i < size)
        {

            int indexArray = i/32;

            int bitIndex = i%32;

            int element = array[indexArray];

            int mask = 1 << bitIndex;

            array[indexArray] = element^mask;


        }
        else {

            String error = "Введите индекс элемента массива в пределах от 0 до " + (array.length-1);

            throw new IllegalArgumentException (error);

        }
    }

    public int trueValues() {    // метод возвращает количество элементов, установленных в true

        int j = 0;

        for (int i = 0; i < size; i++) {

            int indexArray = i / 32;

            int bitIndex = i % 32;

            int element = array[indexArray];

            int mask = 1 << bitIndex;

            if ((element & mask) == mask) {

                j++;
            }
        }
        return j;
    }

    @Override
    public String toString() {

        String s = "";

        for (int i = 0; i < size; i++) {

            s += checkElement(i) ? "1 " : "0 ";

        }
        return s;
    }
}

