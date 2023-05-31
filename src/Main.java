public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 345678;
        byte b = 56;
        short c = 15437;
        long d = -2354235;
        float e = 3.56f;
        double f = 5.4363463;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549l;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short paper = 480;
        int sheetsForEachStudent = paper / (lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + sheetsForEachStudent + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottle = 8;
        byte time = 1;

        byte time1 = 20;
        short time2 = 1440;
        short time3 = 4320;
        int time4 = 43200;

        int bottle1 = bottle * time1;
        int bottle2 = bottle * time2;
        int bottle3 = bottle * time3;
        int bottle4 = bottle * time4;

        System.out.println("За 20 минут машина произвела " + bottle1 + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottle2 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottle3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottle4 + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte pot = 120;
        byte white = 2;
        byte brown = 4;
        int classAtSchool = pot / (white + brown);
        int white1 = classAtSchool * white;
        int brown1 = classAtSchool * brown;
        System.out.println("В школе, где " + classAtSchool + " классов, нужно " + white1 + " банок белой краски и " + brown1 + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int banana = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int rawEgg = 4 * 70;
        double breakfastWeight1 = banana + milk + iceCream + rawEgg; // в граммах
        double breakfastWeight2 = breakfastWeight1 / 1000; // в кг
        System.out.println("Вес в граммах: " + breakfastWeight1 + " г");
        System.out.println("Вес в килограммах: " + breakfastWeight2 + " кг");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int weight = 7000;
        int weight1 = 250;
        int weight2 = 500;
        double weight3 = (weight1 + weight2) / 2;
        System.out.println("Если спортсмен будет терять в день 250 г, то у него уйдет на похудение " + weight / weight1 + " дней");
        System.out.println("Если спортсмен будет терять в день 500 г, то у него уйдет на похудение " + weight / weight2 + " дней");
        System.out.println("Если спортсмен будет терять в день " + weight3 + " г, то у него уйдет на похудение " + weight / weight3 + " дней");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int mashaSsalary1 = 67760;
        int denisSsalary1 = 83690;
        int kristinaSsalary1 = 76230;
        double mashaSsalary2 = 67760 * 1.1;
        double denisSsalary2 = 83690 * 1.1;
        double kristinaSsalary2 = 76230 * 1.1;
        double annualIncomeMasha = mashaSsalary2 * 12 - mashaSsalary1 * 12;
        double annualIncomeDenis = denisSsalary2 * 12 - denisSsalary1 * 12;
        double annualIncomeKristina = kristinaSsalary2 * 12 - kristinaSsalary1 * 12;
        System.out.println("Маша теперь получает " + mashaSsalary2 + " рублей. Годовой доход вырос на " + annualIncomeMasha + " рублей");
        System.out.println("Денис теперь получает " + denisSsalary2 + " рублей. Годовой доход вырос на " + annualIncomeDenis + " рублей");
        System.out.println("Кристина теперь получает " + kristinaSsalary2 + " рублей. Годовой доход вырос на " + annualIncomeKristina + " рублей");
    }
}
