package ru.skypro;

public class Main {

    public static void printIsLeapYear(int year) {
        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        if (isLeapYear) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void printVersionDevice(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int calculateDelivery(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            return deliveryTime;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 1;
            return deliveryTime;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 2;
            return deliveryTime;
        }
    }

    public static void printDouble(String[] symbols) {
        for (int i = 0; i < symbols.length; i++) {
            if (symbols.charAt(i) == symbols.charAt(i + 1)) {
                char s = symbols.charAt(i);
                System.out.println("В строке дбль символа " + s);
            } else
                System.out.println("В строке нет дублей");
        }
    }

    public static void reverseElements(int[] array) {
        int N = array.length;
        for (int i = 0; i < N / 2; i++) {
            array[i] = array[N - i - 1];
            array[N - i - 1] = array[i];
        }
    }

    public static void main(String[] args) {
        //задание 1
        int year = 2021;
        printIsLeapYear(year);

        //задание 2
        int currentYear = LocalDate.now().getYear();
        int clientOS = 1;
        printVersionDevice(clientOS, currentYear);

        //задание 3
        int deliveryDistance = 95;
        int deliveryTime = calculateDelivery( int deliveryDistance);
        System.out.println("Потребуется дней:" + deliveryTime);

        //задание 4
        String symbols = "aabccddefgghiijjkk";
        printDouble(symbols);

        //задание 5
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverseElements(arr);
    }
}
