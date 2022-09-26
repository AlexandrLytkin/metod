import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task3() {
        System.out.println("Задание 3");
        int deliDistance = 95;
        deliDistance2(deliDistance);
        System.out.println("дистанция " + deliDistance + " км, потребуется дней: "+ deliDistance2(deliDistance) + " + срок доставки");
    }
    private static int deliDistance2(int days) {
        int a = days;
        if (a >= 0 && a <= 20) {
            return 1;
        }
        if (a > 20 && a <= 60) {
            return 2;
        }
        if (a > 60 && a <= 100) {
            return 3;
        }
        else {
            return days;
        }
    }

    private static void checkYearProduction(int a, int b) {
        int yearCheck = a;
        int checkOS = b;
            if (checkOS == 0) {
                if (yearCheck >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
            } else {
                if (checkOS == 1) {
                    if (yearCheck >= 2015) {
                    System.out.println("Установите версию приложения для android по ссылке");
                    }
                } else {
                    System.out.println("Установите облегченную версию приложения для android по ссылке");
                }
            }
        }
    private static void task2() {
        System.out.println("Задание 2");
        int clientDeviceYear = LocalDate.now().getYear();  // можно использовать для вывода текущено года!
        int clientOS = 0;
        checkYearProduction(clientDeviceYear, clientOS);

    }

    private static void checkYear(int a) {
        int yearCheck = a;
            if (yearCheck % 4 == 0 && yearCheck % 100 != 0 || yearCheck % 400 == 0) {
                System.out.println(yearCheck + " год является високосным");
            } else {
                System.out.println(yearCheck + " год не является високосным");
        }
    }
    private static void task1() {
        System.out.println("Задание 1");
        int year = 2022;
        checkYear(year);
    }
}
