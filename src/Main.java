public class Main {
    public static void main(String[] args) {
        System.out.println("Task number one");
        for (int i = 1; i < 11; i++) {
            System.out.println("Число " + i);
        }

        System.out.println();
        System.out.println("Task number two");
        for (int a = 10; a > 0; a--) {
            System.out.println(a);
        }

        System.out.println();
        System.out.println("Task number three");
        for (int n = 0; n <= 17; n = n + 2) {
            System.out.print(n + " ");
        }

        System.out.println();
        System.out.println("Task number four");
        for (int num = 10; num > -11; num--) {
            System.out.print(" " + num);
        }

        System.out.println();
        System.out.println("Task number five");
        for (var year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }

        System.out.println();
        System.out.println("Task number Six");
        for (int num = 7; num <= 98; num = num + 7) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("Task number seven");
        for (int numO = 1; numO <= 512; numO = numO * 2) {
            System.out.print(numO + " ");
        }


        System.out.println();
        System.out.println("Task number eight");
        int summa = 29_000;
        int bank = 0;
        for (int month = 0; month <= 12; month++){
            bank = summa * month;
            System.out.println("Месяц " + month + " сумма накоплений равна " + bank + " рублей");
        }


        System.out.println();
        System.out.println("Task number nine");
        double totalSumma = 29_000;
        double bankOne = 0;
        double annualInterestRate = 0.12;
        for (int montH = 0; montH <= 12; montH++){
            bankOne += totalSumma;
            bankOne *= (1 + annualInterestRate / 12);
            System.out.println("Месяц " + montH + " сумма накоплений равна " + bankOne + " рублей");

        }


            System.out.println();
        System.out.println("Task number ten");
        int num1 = 2;
        int result = 0;
        for (int h = 1; h <= 10; h++) {
            result = num1 * h;
            System.out.println("2" + "*" + h + "=" + result);
        }
    }
}