public class Main {
    public static void main(String[] args) {
        //Задание № 1

        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке...");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке...");
        }

        //Задание № 2

        short clientDeviceYear = 2015;
        if (clientOS == 0 || clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке...");
        }
        if (clientOS == 0 || clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке...");
        }

        if (clientOS == 1 || clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке...");
        }
        if (clientOS == 1 || clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке...");
        }


        //Задание № 3

        short year = 2024;

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Год является високосным.");
        } else {
            System.out.println("Год не является високосным.");
        }


        //Задание № 4

        byte deliveryDistance = 95;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней : " + 1 + ".");
        }
        else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + 2 + ".");
        }
        else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + 3 + ".");
        }



        //Задание № 5

        byte monthNumber = 2;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима.");
                break;
            case 2:
                System.out.println("Зима.");
                break;
            case 3:
                System.out.println("Весна.");
                break;
            case 4:
                System.out.println("Весна.");
                break;
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
                System.out.println("Лето.");
                break;
            case 7:
                System.out.println("Лето.");
                break;
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
                System.out.println("Осень.");
                break;
            case 10:
                System.out.println("Осень.");
                break;
            case 11:
                System.out.println("Осень.");
                break;
            case 12:
                System.out.println("Зима.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }


    }
}

