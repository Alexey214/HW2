package com.company;

public class Main {

    public static void main(String[] args) {
    //Задание №1:
	    byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;

        float f = 3.14f;
        double d = 3.14;

        char c = 32;
        boolean boo = true;

    //Задание №2:
        float boxerOne = 78.2f;
        float boxerTwo = 82.7f;
        System.out.println("Общий вес двух бойцов: " + (boxerOne + boxerTwo) + " кг.");
        System.out.println("Разница в весе бойцов: " + (boxerTwo % boxerOne) + " кг.");

    //Задание №3:
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;

        float sportCoctail = banana * 5 + milk * 2 + iceCream * 2 + egg * 4f;
        System.out.println("Вес коктеля к килограммах: "+ (sportCoctail/1000));

    //Задание №4:
        short loseWeight = 7*1000;
        short slimOne = 250;
        short slimTwo = 500;
        int dietOne = loseWeight/slimOne;
        int dietTwo = loseWeight/slimTwo;
        int inAverage = (dietOne+dietTwo)/2;
        System.out.println("Если терять 250 грамм в день, то похудеет через: "+dietOne);
        System.out.println("Если терять 500 грамм в день, то похудеет через: "+dietTwo);
        System.out.println("В среднем на похудение уйдёт: "+inAverage+" день");

    //Задание №5:
        int MashaBe = 67_760;
        int DenisBe = 83_690;
        int KrisBe = 76_230;
        int MashaBefore = MashaBe*12;
        int DenisBefore = DenisBe*12;
        int KrisBefore = KrisBe*12;
        int MashaAf = (int) (MashaBe*1.1);
        int DenisAf = (int) (DenisBe*1.1);
        int KrisAf = (int) (KrisBe*1.1);
        int MashaAfter = (int) (MashaBe*1.1*12);
        int DeniAfter = (int) (DenisBe*1.1*12);
        int KrisAfter = (int) (KrisBe*1.1*12);
        System.out.println("Маша теперь получает "+MashaAf+" рублей. Годовой доход вырос на "+(MashaAfter-MashaBefore)+" рублей");
        System.out.println("Денис теперь получает "+DenisAf+" рублей. Годовой доход вырос на "+(DeniAfter-DenisBefore)+" рублей");
        System.out.println("Кристина теперь получает "+KrisAf+" рублей. Годовой доход вырос на "+(KrisAfter-KrisBefore)+" рублей");

    }
}
