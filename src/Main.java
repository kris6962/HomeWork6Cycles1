public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Task 1");
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        //task2
        System.out.println("Task 2");
        for (i = 10; i >= 1; i--) {
            System.out.print(i+" ");
        }
        System.out.println();

        //task3
        System.out.println("Task 3");
        for (i = 0; i <= 17; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();

        //task4
        System.out.println("Task 4");
        for (i = 10; i >= -10; i--) {
            System.out.print(i+" ");
        }
        System.out.println();

        //task5
        System.out.println("Task 5");
        for (i = 1904; i <= 2096; i+=4) {
            System.out.print(i+" ");
        }
        System.out.println();

        //task6
        System.out.println("Task 6");
        for (i = 7; i <= 98; i+=7) {
            System.out.print(i+" ");
        }
        System.out.println();

        //task7
        System.out.println("Task 7");
        for (i = 1; i <= 512; i*=2) {
            System.out.print(i+" ");
        }
        System.out.println();

        //task8
        System.out.println("Task 8");
        int sum=0;
        for (i = 1; i <= 12; i++) {
            sum+=29000;
            System.out.println("Месяц "+i+", сумма накоплений равна "+sum+" рублей");
        }

        //task9
        System.out.println("Task 9");
        sum=0;
        for (i = 1; i <= 12; i++) {
            sum+=29000;
            sum*=1.01;
            System.out.println("Месяц "+i+", сумма накоплений равна "+sum+" рублей");
        }

        //task10
        System.out.println("Task 10");
        for (i = 1; i <= 10; i++) {
            System.out.println("2 x "+i+" = "+2*i);
        }
        System.out.println();

    }
}