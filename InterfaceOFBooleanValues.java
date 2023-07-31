package DEV110_4_Tekiev;

// Лабораторная работа №4: определение и реализация интерфейсов

// Часть 1. Определение интерфейса для массива логических значений


public interface InterfaceOFBooleanValues {

    int size = 64;

    boolean checkElement(int i);      // метод возвращает значение элемента

    void setTrue(int i);    // метод устанавливает true в заданный элемент

    void setValue(int i, boolean b);  // метод устанавливает заданное значение в заданный элемент массива

    void setFalse(int i);  // метод устанавливает false в заданный элемент

    void invertValue(int i);    // метод инвертирует значение заданного элемента

    int trueValues();    // метод возвращает количество элементов, установленных в true

    String toString();  // метод возвращает последовательность нулей и единиц

}
