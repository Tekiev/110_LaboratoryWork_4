package DEV110_4_Tekiev;


public class ArrayOfBoolean implements InterfaceOFBooleanValues {

    boolean [] array = new boolean[size];

    public boolean checkElement(int i) {            // метод возвращает значение элемента

        if (i >= 0 && i < array.length)
        {

            return array[i];

        }

        else {

            String error = "Введите индекс элемента массива в пределах от 0 до " + (array.length-1);

            throw new IllegalArgumentException (error);
        }
    }
    public void setTrue(int i) {    // метод устанавливает true в заданный элемент

        if (i >= 0 && i < array.length)
        {

            array[i] = true;

        }
        else {

            String error = "Введите индекс элемента массива в пределах от 0 до " + (array.length-1);

            throw new IllegalArgumentException (error);
        }
    }
    public void setValue(int i, boolean b) {  // метод устанавливает заданное значение в заданный элемент массива

        if (i >= 0 && i < array.length)
        {

            array[i] = b;

        }
        else {

            String error = "Введите индекс элемента массива в пределах от 0 до " + (array.length-1);

            throw new IllegalArgumentException (error);
        }
    }
    public void setFalse(int i) {  // метод устанавливает false в заданный элемент

        if (i >= 0 && i < array.length)
        {

            array[i] = false;

        }
        else {

            String error = "Введите индекс элемента массива в пределах от 0 до " + (array.length-1);

            throw new IllegalArgumentException (error);

        }
    }
    public void invertValue(int i) {    // метод инвертирует значение заданного элемента

        if (i >= 0 && i < array.length)
        {

            array[i] = !array[i];

        }

        else {

            String error = "Введите индекс элемента массива в пределах от 0 до " + (array.length-1);

            throw new IllegalArgumentException (error);
        }
    }
    public int trueValues() {    // метод возвращает количество элементов, установленных в true

        int j = 0;

        for (boolean b : array) {

            if (b) {

                j++;
            }
        }
        return j;
    }
    @Override
    public String toString() {

        String s = "";

        for (boolean b : array) {

            if (b) {
                s += "1 ";
            } else {

                s += "0 ";
            }
        }
        return s;
    }
}

