package lab3_part2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Двухсвязный список.");

        DoubleLinkedList doubleList = new DoubleLinkedList();

        int [] array1 = {7, 1, 3};

        int [] array2 = {10, 4, 9};

        System.out.println("Добавление коллекции данных в начало списка.");

        doubleList.addArrayFirst(array1);

        System.out.println("Печать коллекции с начала.");

        System.out.println(doubleList.printFromStart());

        System.out.println("Печать коллекции с конца.");

        System.out.println(doubleList.printFromEnd());

        System.out.println("Добавление коллекции в конец списка.");
        doubleList.addArrayLast(array2);

        System.out.println(doubleList.printFromStart());

        System.out.println(doubleList.printFromEnd());

        System.out.println("Добавление массива данных в коллекцию 1.");

        DoubleLinkedList doubleListToAdd1 = new DoubleLinkedList();
        int [] array3 = {3, 5, 7};

        System.out.println("Добавление дополнительной коллекции 1 в начало основного списка.");

        doubleListToAdd1.addArrayFirst(array3);

        System.out.println(doubleListToAdd1.printFromStart());

        doubleList.addListFirst(doubleListToAdd1);

        System.out.println(doubleList.printFromStart());

        System.out.println(doubleList.printFromEnd());

        System.out.println("Добавление массива данных в дополнительную коллекцию 2.");

        int [] array4 = {7, 7, 7};

        DoubleLinkedList doubleListToAdd2 = new DoubleLinkedList();

        doubleListToAdd2.addArrayFirst(array4);

        System.out.println(doubleListToAdd2.printFromStart());

        System.out.println("Добавление дополнительного списока #2 в конец основного");

        doubleList.addListLast(doubleListToAdd2);

        System.out.println(doubleList.printFromStart());

        System.out.println(doubleList.printFromEnd());

    }
}
