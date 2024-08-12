public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("__________________________");


        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("__________________________");

        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("__________________________");

        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        System.out.println("__________________________");

        int year = 1904;
        for (; year <= 2096; year++) {
            if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                System.out.println(year + " год является високосным");
            }
        }
        System.out.println("__________________________");

        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("__________________________");

        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("__________________________");

        int money = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + total / 100;
            total = total + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("__________________________");

        int two = 2;
        for (int i = 1; i < 11; i++) {
            int result = two * i;
            System.out.println(two + "*" + i + "=" + result);
        }


    }
}
