@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Task 1");
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task2
        System.out.println("Task 2");
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task3
        System.out.println("Task 3");
        for (i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task4
        System.out.println("Task 4");
        for (i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task5
        System.out.println("Task 5");
        for (i = 1904; i <= 2096; i += 4) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task6
        System.out.println("Task 6");
        for (i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task7
        System.out.println("Task 7");
        for (i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task8
        System.out.println("Task 8");
        int sum = 0;
        for (i = 1; i <= 12; i++) {
            sum += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }

        //task9
        System.out.println("Task 9");
        sum = 0;
        for (i = 1; i <= 12; i++) {
            sum += 29000;
            sum *= 1.01;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }

        //task10
        System.out.println("Task 10");
        for (i = 1; i <= 10; i++) {
            System.out.println("2 x " + i + " = " + 2 * i);
        }
        System.out.println();


        //HomeWork7Cycles1-2
        System.out.println("HomeWork7Cycles1-2");
        //task1
        System.out.println("Task 1");
        i = 1;
        sum = 0;
        while (sum <= 2459000) {
            sum += 15000;
            System.out.println("Месяц " + i++ + ", сумма накоплений равна " + sum + " рублей");
        }

        //task2
        System.out.println("Task 2");
        i = 1;
        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task3
        System.out.println("Task 3");
        int population = 12000000; //начальная численность
        int birth = 17; // рождаемость на 1000чел
        int death = 8; // смертность на 1000чел
        int years = 10; // кол-во лет
        int fyear = 1; // текущий год
        while (fyear <= years) {
            population += population/1000 * (birth - death);
            System.out.println("Год " + fyear++ + ", численность населения составляет " + population);
        }

        //task4
        System.out.println("Task 4");
        int month = 1; // счетчик месяцев
        long currentAmount = 15000;  // текущая сумма вклада
        long finAmount = 12000000; // нужная сумма
        while (currentAmount < finAmount) {
            currentAmount *= 1.07;
            System.out.println("Месяц " + month++ + ", сумма накоплений равна " + currentAmount + " рублей");
        }

        //task5
        System.out.println("Task 5");
        currentAmount = 15000L;
        month = 0;
        while (currentAmount <= finAmount) {
            currentAmount = (int) (currentAmount * 1.07);
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накопления равна " + currentAmount);
                }
            }

        //task6
        System.out.println("Task 6");
        currentAmount = 15000L;
        month = 0;
        int term = 108;
        while (month <= term) {
            currentAmount *= 1.07;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накопления равна " + currentAmount);
            }
        }

        //task7
        System.out.println("Task 7");
        int friday = 5;
        int quantity = 31;
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
            }
        while (friday < quantity);

        //task8
        System.out.println("Task 8");
        int Year = 2024;
        int start = Year - 200;
        int stop = Year + 100;
        for (i = start; i <= stop; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
        }
        }
    }
}
