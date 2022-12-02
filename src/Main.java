public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");
        int intNumber = 3600;
        byte byteNumber = 127;
        short shortNumber = 32767;
        long longNumber = 1000000999;
        float floatNumber = 3.14f;
        double doubleNumber = 55.888888889;
        System.out.println("Значение переменной intNumber c типом int равно " + intNumber);
        System.out.println("Значение переменной byteNumber с типом short равно " + byteNumber);
        System.out.println("Значение переменной shortNumber с типом byte равно " + shortNumber);
        System.out.println("Значение переменной longNumber с типом long равно " + longNumber);
        System.out.println("Значение переменной floatNumber с типом float равно " + floatNumber);
        System.out.println("Значение переменной doubleNumber с типом double равно " + doubleNumber);
        //Задание 2
        System.out.println("Задание 2");
        float number1 = 27.12F;
        long number2 = 987678965549L;
        double number3 = 2.786;
        boolean number4 = false;
        char number5 = 569;
        short number6 = -159;
        int number7 = 27897;
        byte number8 = 97;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println("Значение символьной переменной рано 569 - это символ: "+ number5);
        System.out.println(number6);
        System.out.println(number7);
        System.out.println(number8);
         //Задание 3
        System.out.println("Задание 3");
        int lydmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        short totalPaper = 480;
        int allStudents = lydmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        System.out.println("На каждого ученика рассчитано " + (totalPaper/allStudents) + " листов бумаги.");
        //Задание 4
        System.out.println("Задание 4");
        int makeBoatles=16;
        int timeToMakeBoatles=2;
        int boatleInOneMinute = makeBoatles/timeToMakeBoatles;
        int boatleIn20Minute = boatleInOneMinute * 20;
        System.out.println("За 20 минут машина произвела бутылок - " + boatleIn20Minute + " штук.");
        int boatleInOneDay = boatleInOneMinute * 60*24;
        System.out.println("За сутки машина произвела бутылок - " + boatleInOneDay + " штук.");
        int boatleInThreeDays = boatleInOneDay * 3;
        System.out.println("За три дня машина произвела бутылок - " + boatleInThreeDays + " штук.");
        int boatleInOneMonth = boatleInOneDay * 30;
        System.out.println("За месяц машина произвела бутылок - " + boatleInOneMonth + " штук.");
        //Задание 5
        System.out.println("Задание 5");
        int bottleOfPaint = 120;
        int whitePaintForRoom = 2;
        int brownPaintForRoom = 4;
        int totalPaintForRoom = whitePaintForRoom + brownPaintForRoom;
        int numberRooms = bottleOfPaint / totalPaintForRoom;
        System.out.println("В школе, где " + numberRooms + " классов, нужно " + (numberRooms * whitePaintForRoom) + " банок белой краски и " + (numberRooms * brownPaintForRoom) + " банок коричневой краски.");
        // Задание 6
        System.out.println("Задание 6");
        int weightBanana = 80;
        int weightMilk = 105;
        int weightIceCream = 100;
        int weightEggs = 70;
        int totalWeightGram = (weightBanana*5) + (weightMilk*2) + (weightIceCream*2) + (weightEggs*4);
        float totalWeightKg = totalWeightGram / 1000F;
        System.out.println("Общий вес завтрака спортсмена равен " + totalWeightGram + " грамм, или " + totalWeightKg + " килограмм." );
        // Задание 7
        System.out.println("Задание 7");
        int lostWeight = 7000;
        int lostWeightInDay1 = 250;
        int lostWeightInDay2 = 500;
        float timeForTarget1=(float)lostWeight/lostWeightInDay1;
        float timeForTarget2=(float)lostWeight/lostWeightInDay2;
        float averageTime=(timeForTarget1+timeForTarget2)/2;
        System.out.println("Если спортсмен теряет " + lostWeightInDay1 + " грамм в день, то он похудеет на " + lostWeight + " грамм за " + timeForTarget1 + " дней.");
        System.out.println("Если спортсмен теряет " + lostWeightInDay2 + " грамм в день, то он похудеет на " + lostWeight + " грамм за " + timeForTarget2 + " дней.");
        System.out.println("Если спортсмен теряет от "+ lostWeightInDay1+" до "+lostWeightInDay2+" грамм в день, то он потеряет "+lostWeight+" грамм в среднем за "+averageTime+" дней");
        //Задание 8
        System.out.println("Задание 8");
        float mashaSalaryMonth = 67760F;
        float mashaSalaryYear = mashaSalaryMonth*12F;
        float denisSalaryMonth = 83690F;
        float denisSalaryYear=denisSalaryMonth*12F;
        float kristinaSalaryMonth = 76230F;
        float kristinaSalaryYear=kristinaSalaryMonth*12F;
        System.out.println("До повышения зарплата за месяц у Маши "+mashaSalaryMonth+" рублей, годовой доход "+mashaSalaryYear+ " рублей.");
        System.out.println("До повышения зарплата за месяц у Дениса "+denisSalaryMonth+" рублей, годовой доход "+denisSalaryYear+ " рублей.");
        System.out.println("До повышения зарплата за месяц у Кристины "+kristinaSalaryMonth+" рублей, годовой доход "+kristinaSalaryYear+ " рублей.");
        System.out.println("После повышения зарплата за месяц у Маши " + mashaSalaryMonth*1.1F + " рублей. Годовой доход вырос на " + mashaSalaryYear*0.1F + " рублей");
        System.out.println("После повышения зарплата за месяц у Дениса " + denisSalaryMonth*1.1F + " рублей. Годовой доход вырос на " + denisSalaryYear*0.1F + " рублей");
        System.out.println("После повышения зарплата за месяц у Кристины " + kristinaSalaryMonth*1.1F + " рублей. Годовой доход вырос на " + kristinaSalaryYear*0.1F + " рублей");

    }
}