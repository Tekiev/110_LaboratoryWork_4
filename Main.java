package DEV110_4_Tekiev;


public class Main {

    public static void main(String[] args) {

        System.out.println();

        System.out.println("Лабораторная работа №4. Часть 2. Реализация булевского массива.");

        System.out.println();

        ArrayOfBoolean arrayOfBoolean = new ArrayOfBoolean();

        try {
            System.out.println(arrayOfBoolean.checkElement(1));

            arrayOfBoolean.setTrue(3);

            arrayOfBoolean.setValue(4,true);

            arrayOfBoolean.setFalse(2);

            arrayOfBoolean.invertValue(5);

            System.out.println(arrayOfBoolean.trueValues());

            System.out.println(arrayOfBoolean);

            for (int i = 0; i < 64; i++) {

                arrayOfBoolean.invertValue(i);

            }
            System.out.println(arrayOfBoolean);

            for (int i = 0; i < 64; i++) {

                arrayOfBoolean.setTrue(i);

            }
            System.out.println(arrayOfBoolean);
        }
        catch (IllegalArgumentException e) {

            System.out.println(e);

        }

        System.out.println();

        System.out.println("Лабораторная работа №4. Часть 3. Реализация целочисленного массива массива.");

        System.out.println();

        ArrayOfInt arrayOfInt = new ArrayOfInt();


        try {

            System.out.println(arrayOfInt.checkElement(1));

            arrayOfInt.setTrue(3);

            arrayOfInt.setValue(4,true);

            arrayOfInt.setFalse(2);

            arrayOfInt.invertValue(5);

            System.out.println(arrayOfInt.trueValues());

            System.out.println(arrayOfInt);

            for (int i = 0; i < 64; i++) {

                arrayOfInt.invertValue(i);

            }
            System.out.println(arrayOfInt);

            for (int i = 0; i < 64; i++) {

               arrayOfInt.setTrue(i);
            }
            System.out.println(arrayOfInt);
        }
        catch (IllegalArgumentException e) {

            System.out.println(e);
        }
    }
}
