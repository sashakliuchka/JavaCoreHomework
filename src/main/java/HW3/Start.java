package HW3;

import java.util.Arrays;

/**
 * @author Александр Ключка
 * @date 5/30/2022
 */


    //Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    //Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    //Для хранения фруктов внутри коробки можно использовать ArrayList;
    //Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    //Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
    //Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
// Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    //Не забываем про метод добавления фрукта в коробку.

    public class main {

        public static void main(String[] args) {
            doLesson_Fruits();

            String[] array = {"Sasha", "Masha", "Boris", "Vova", "Artem"};
            //doLesson_Array(array, 1,2);

            Integer[] integers = {5,4,3,2,1};
            // doLesson_ArrayWithoutTemp(integers, 1,2);
        }

        private static void doLesson_Fruits() {
            BoxFruit<Apple> appleBox = new BoxFruit<Apple>(1);
            BoxFruit<Orange> orangeBox = new BoxFruit<Orange>(1.5);
            BoxFruit<Apple> appleBox2 = new BoxFruit<Apple>(1);

            for (int i = 0; i < 3; i++) {
                orangeBox.addFruit(new Orange());
                appleBox.addFruit(new Apple());
                appleBox2.addFruit(new Apple());
            }

            appleBox.addFruit(new Apple());
            appleBox.addFruit(new Apple());

            appleBox2.addFruit(new Apple());


            System.out.println("Weight appleBox: " + appleBox.getBoxWeight());
            System.out.println("Weight orangeBox: " + orangeBox.getBoxWeight());
            System.out.println("Weights equals - " + appleBox.compare(orangeBox));
            System.out.println("---------------------------------------------");

            appleBox.addFruits(appleBox2);

        }

        private static void doLesson_ArrayWithoutTemp(Integer[] integers, int i, int j) {

            Integer a = integers[i];
            Integer b = integers[j];

            a = a + b;
            b = b - a;
            b = -b;
            a = a - b;

            integers[i] = a;
            integers[j] = b;

            printArray(integers);
        }

        public static void doLesson_Array(Object[] array, int firstIndex, int secondIndex) {
            Object temp = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = temp;
            printArray(array);
        }

        private static void printArray(Object[] array) {
            System.out.println(Arrays.toString(array));
        }
    }


