public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte clientOS = 1;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        byte clientOS = 1;
        short clientDeviceYear = 2015;
        if (clientOS == 0){
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 10;
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
                System.out.println("Потребуется дней: " + deliveryTime);
            } else if (deliveryDistance <= 100){
            deliveryTime = deliveryTime + (deliveryDistance / 40);
            //Формула отвечает условиям, доставка увеличивается на час за каждые 40 км после 20-ти
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte monthNumber = 12;
        if (monthNumber > 12){
            System.out.println("Номер месяца некорректен, должен быть от 1 до 12");
        } else {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
            }
        }
    }
}