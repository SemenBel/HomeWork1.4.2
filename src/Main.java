public class Main {
    public static void main(String[] args) {
        task4();
    }

    public static void task1() {
        int salary = 29_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int n = 10; n > 0; n--) {
            System.out.print(n + " ");
        }
    }

    public static void task3() {
        int populationCountryY2022 = 12_000_000;
        int year = 2022;
        int numberBirths = 17;
        int numberDeaths = 8;
        int differance = numberBirths - numberDeaths;
        while (year < 2032) {
            year++;
            populationCountryY2022 += populationCountryY2022 * differance / 1000;
            System.out.println("Год " + year + " численность населения составляет " + populationCountryY2022);
        }
    }

    public static void task4() {
        int sumDeposit = 15000;
        int total = 0;
        for (int i = 0; total <= 12_000_000; i++) {
            total = total + total * 7 / 100;
            total = total + sumDeposit;
            System.out.println("Месяц " + i + " сумма вклада " + total);
        }
    }

    public static void task5() {
        int sumDeposit = 15000;
        int total = 0;
        for (int i = 0; total <= 12_000_000; i++) {
            total = total + total * 7 / 100;
            total = total + sumDeposit;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма вклада " + total);
            }
        }
    }

    public static void task6() {
        int sumDeposit = 15000;
        int total = 0;
        for (int i = 0; i <= 108; i++) {
            total = total + total * 7 / 100;
            total = total + sumDeposit;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма вклада " + total);
            }
        }
    }

    public static void task7() {
        int firstFriday = 5;
        int daysMonth = 31;
        for (int i = firstFriday; i <= daysMonth; i += 7) {
            System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task8() {
        int nowYear = 2022;
        int lastPeriod = nowYear - 200;
        int futurePeriod = nowYear + 100;
        for (int i = lastPeriod; i <= futurePeriod; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task9() {
        int y;
        for (int i = 1; i <= 10; i++) {
            y = 2 * i;
            System.out.println("2*" + i + "=" + y);
        }
    }
}