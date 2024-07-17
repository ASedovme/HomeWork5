public class Main {
    public static void main(String[] args) {
//Задача 1
        System.out.println("Задача 1");
        int clientOs = 1;
        switch (clientOs) {
            case 0:
                System.out.println("Установите версию приложения для IOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Вам не повезло, для вашей операционной системы нет приложения. Смените телефон");
        }
//Задача 2
        System.out.println("Задача 2");
        int phoneYear = 2013;
        clientOs = 0;
        if (phoneYear >= 2015) {
            switch (clientOs) {
                case 0:
                    System.out.println("Установите версию приложения для IOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Вам не повезло, для вашей операционной системы нет приложения. Смените телефон");
            }
        } else {
            switch (clientOs) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для IOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Вам не повезло, для вашей операционной системы нет приложения. Смените телефон");
            }
        }
        ;
//Задача 3
        System.out.println("Задача 3");
        int year = 2012;
        if (((year % 4 == 0) && (year % 100 != 0) && (year >= 1584)) || (year % 400 == 0)) {
            System.out.println(year + " Год является высокосным");
        } else {
            System.out.println(year + " Год является невысокосным");
        }
//Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 50;
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + deliveryDay);
        } else {
            deliveryDay = deliveryDay + 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + deliveryDay);
        } else {
            deliveryDay = deliveryDay + 1;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + deliveryDay);
        } else {
            System.out.println("Дооставки нет");
        }

//Задача 5
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}

