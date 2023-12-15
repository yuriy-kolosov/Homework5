import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 5");
        System.out.println("          Задача 1");
        System.out.println("          Пример 1-1");
        boolean clientOS1 = true;
        if (clientOS1)
            System.out.println("Установите версию приложения для Android по ссылке");
        else
            System.out.println("Установите версию приложения для iOS по ссылке");
        System.out.println("          Пример 1-2");
        boolean clientOS2 = false;
        if (clientOS2)
            System.out.println("Установите версию приложения для Android ссылке");
        else
            System.out.println("Установите версию приложения для iOS ссылке");
        System.out.println("          Задача 2");
        System.out.println("          Пример 2-1");
        boolean clientOsType1 = true;
        short clientDeviceYear1 = 2015;
        if (clientOsType1) {
            if (clientDeviceYear1 >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear1 >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        System.out.println("          Пример 2-2");
        boolean clientOsType2 = true;
        short clientDeviceYear2 = 2012;
        if (clientOsType2) {
            if (clientDeviceYear2 >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear2 >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        System.out.println("          Пример 2-3");
        boolean clientOsType3 = false;
        short clientDeviceYear3 = 2017;
        if (clientOsType3) {
            if (clientDeviceYear3 >= 2017) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear3 >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        System.out.println("          Пример 2-4");
        boolean clientOsType4 = false;
        short clientDeviceYear4 = 2014;
        if (clientOsType4) {
            if (clientDeviceYear4 >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear4 >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        System.out.println("          Задача 3");
        System.out.println("          Пример 3-1");
        short year1 = 1583;
        System.out.println("Год = " + year1);
        if (year1 >= 1584) {
            if (year1 % 400 == 0) {
                System.out.println("Год = " + year1 + " - високосный");
            } else if (year1 % 100 == 0) {
                System.out.println("Год = " + year1 + " - невисокосный");
            } else if (year1 % 4 == 0) {
                System.out.println("Год = " + year1 + " - високосный");
            } else System.out.println("Год = " + year1 + " - невисокосный");
        } else System.out.println("Год = " + year1 + " - не определён");
        System.out.println("          Пример 3-2");
        short year2 = 1600;
        System.out.println("Год = " + year2);
        if (year2 >= 1584) {
            if (year2 % 400 == 0) {
                System.out.println("Год = " + year2 + " - високосный");
            } else if (year2 % 100 == 0) {
                System.out.println("Год = " + year2 + " - невисокосный");
            } else if (year2 % 4 == 0) {
                System.out.println("Год = " + year2 + " - високосный");
            } else System.out.println("Год = " + year2 + " - невисокосный");
        } else System.out.println("Год = " + year2 + " - не определён");
        System.out.println("          Пример 3-3");
        short year3 = 1785;
        System.out.println("Год = " + year3);
        if (year3 >= 1584) {
            if (year3 % 400 == 0) {
                System.out.println("Год = " + year3 + " - високосный");
            } else if (year3 % 100 == 0) {
                System.out.println("Год = " + year3 + " - невисокосный");
            } else if (year3 % 4 == 0) {
                System.out.println("Год = " + year3 + " - високосный");
            } else System.out.println("Год = " + year3 + " - невисокосный");
        } else System.out.println("Год = " + year3 + " - не определён");
        System.out.println("          Пример 3-4");
        short year4 = 1900;
        System.out.println("Год = " + year4);
        if (year4 >= 1584) {
            if (year4 % 400 == 0) {
                System.out.println("Год = " + year4 + " - високосный");
            } else if (year4 % 100 == 0) {
                System.out.println("Год = " + year4 + " - невисокосный");
            } else if (year4 % 4 == 0) {
                System.out.println("Год = " + year4 + " - високосный");
            } else System.out.println("Год = " + year4 + " - невисокосный");
        } else System.out.println("Год = " + year4 + " - не определён");
        System.out.println("          Пример 3-5");
        short year5 = 2000;
        System.out.println("Год = " + year5);
        if (year5 >= 1584) {
            if (year5 % 400 == 0) {
                System.out.println("Год = " + year5 + " - високосный");
            } else if (year5 % 100 == 0) {
                System.out.println("Год = " + year5 + " - невисокосный");
            } else if (year5 % 4 == 0) {
                System.out.println("Год = " + year5 + " - високосный");
            } else System.out.println("Год = " + year5 + " - невисокосный");
        } else System.out.println("Год = " + year5 + " - не определён");
        System.out.println("          Пример 3-6");
        short year6 = 2005;
        System.out.println("Год = " + year6);
        if (year6 >= 1584) {
            if (year6 % 400 == 0) {
                System.out.println("Год = " + year6 + " - високосный");
            } else if (year6 % 100 == 0) {
                System.out.println("Год = " + year6 + " - невисокосный");
            } else if (year6 % 4 == 0) {
                System.out.println("Год = " + year6 + " - високосный");
            } else System.out.println("Год = " + year6 + " - невисокосный");
        } else System.out.println("Год = " + year6 + " - не определён");
        System.out.println("          Пример 3-7");
        short year7 = 2024;
        System.out.println("Год = " + year7);
        if (year7 >= 1584) {
            if (year7 % 400 == 0) {
                System.out.println("Год = " + year7 + " - високосный");
            } else if (year7 % 100 == 0) {
                System.out.println("Год = " + year7 + " - невисокосный");
            } else if (year7 % 4 == 0) {
                System.out.println("Год = " + year7 + " - високосный");
            } else System.out.println("Год = " + year7 + " - невисокосный");
        } else System.out.println("Год = " + year7 + " - не определён");
        System.out.println("          Задача 4");
        System.out.println("          Пример 4-1");
        short deliveryDistance1 = 5;
        System.out.println("Расстояние = " + deliveryDistance1);
        if (deliveryDistance1 <= 100) {
            if (deliveryDistance1 > 60) {
                System.out.println("Время доставки = 3 суток");
            } else if (deliveryDistance1 > 20) {
                System.out.println("Время доставки = 2 суток");
            } else System.out.println("Время доставки = 1 сутки");
        } else System.out.println("Доставки нет");
        System.out.println("          Пример 4-2");
        short deliveryDistance2 = 23;
        System.out.println("Расстояние = " + deliveryDistance2);
        if (deliveryDistance2 <= 100) {
            if (deliveryDistance2 > 60) {
                System.out.println("Время доставки = 3 суток");
            } else if (deliveryDistance2 > 20) {
                System.out.println("Время доставки = 2 суток");
            } else System.out.println("Время доставки = 1 сутки");
        } else System.out.println("Доставки нет");
        System.out.println("          Пример 4-3");
        short deliveryDistance3 = 87;
        System.out.println("Расстояние = " + deliveryDistance3);
        if (deliveryDistance3 <= 100) {
            if (deliveryDistance3 > 60) {
                System.out.println("Время доставки = 3 суток");
            } else if (deliveryDistance3 > 20) {
                System.out.println("Время доставки = 2 суток");
            } else System.out.println("Время доставки = 1 сутки");
        } else System.out.println("Доставки нет");
        System.out.println("          Пример 4-4");
        short deliveryDistance4 = 102;
        System.out.println("Расстояние = " + deliveryDistance4);
        if (deliveryDistance4 <= 100) {
            if (deliveryDistance4 > 60) {
                System.out.println("Время доставки = 3 суток");
            } else if (deliveryDistance4 > 20) {
                System.out.println("Время доставки = 2 суток");
            } else System.out.println("Время доставки = 1 сутки");
        } else System.out.println("Доставки нет");
        System.out.println("          Задача 5");
        System.out.println("          Пример 5-1");
        byte monthNumber1 = 1;
        switch (monthNumber1) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц с номером " + monthNumber1 + " - зимний");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц с номером " + monthNumber1 + " - весенний");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц с номером " + monthNumber1 + " - летний");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц с номером " + monthNumber1 + " - осенний");
                break;
            default:
                System.out.println("Месяц с номером " + monthNumber1 + " - не определён");
        }
        System.out.println("          Пример 5-2");
        byte monthNumber2 = 4;
        switch (monthNumber2) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц с номером " + monthNumber2 + " - зимний");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц с номером " + monthNumber2 + " - весенний");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц с номером " + monthNumber2 + " - летний");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц с номером " + monthNumber2 + " - осенний");
                break;
            default:
                System.out.println("Месяц с номером " + monthNumber2 + " - не определён");
        }
        System.out.println("          Пример 5-3");
        byte monthNumber3 = 7;
        switch (monthNumber3) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц с номером " + monthNumber3 + " - зимний");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц с номером " + monthNumber3 + " - весенний");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц с номером " + monthNumber3 + " - летний");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц с номером " + monthNumber3 + " - осенний");
                break;
            default:
                System.out.println("Месяц с номером " + monthNumber3 + " - не определён");
        }
        System.out.println("          Пример 5-4");
        byte monthNumber4 = 11;
        switch (monthNumber4) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц с номером " + monthNumber4 + " - зимний");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц с номером " + monthNumber4 + " - весенний");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц с номером " + monthNumber4 + " - летний");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц с номером " + monthNumber4 + " - осенний");
                break;
            default:
                System.out.println("Месяц с номером " + monthNumber4 + " - не определён");
        }
        System.out.println("          Пример 5-5");
        byte monthNumber5 = 14;
        switch (monthNumber5) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц с номером " + monthNumber5 + " - зимний");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц с номером " + monthNumber5 + " - весенний");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц с номером " + monthNumber5 + " - летний");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц с номером " + monthNumber5 + " - осенний");
                break;
            default:
                System.out.println("Месяц с номером " + monthNumber5 + " - не определён");
        }
    }
}