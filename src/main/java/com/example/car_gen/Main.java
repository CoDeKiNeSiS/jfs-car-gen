package com.example.car_gen;

public class Main {

    public static void main(String[] args) {

        Honda civic = new Honda("White", 2002, 130,  false);
        Lexus rx350 = new Lexus("Silver", 2017, 140, true);
        Toyota supra = new Toyota("Brazen Orange", 2002, 160, false);

//        System.out.println(civic.getColor());
//        System.out.println(rx350.getColor());
//        System.out.println(supra.getColor());
//        civic.setSpeed(24);
//        System.out.println(civic.accelerateSpeed());
//        System.out.println(civic.accelerateSpeed());
//        System.out.println(civic.accelerateSpeed());
//        System.out.println(civic.accelerateSpeed());
//        System.out.println(civic.decelerateSpeed());
//        civic.setIsElectric(true);
//        System.out.println(civic.convertToElectric());
//        System.out.println(civic.getSpeed());
//        civic.setSpeed(10);
//        System.out.println(civic.getColor());
//        System.out.println(civic.getYear());
//        System.out.println(civic.getMaxSpeed());
//        System.out.println(civic.getIsTurboCharged());
//        System.out.println(civic.getIsElectric());
//        civic.setColor("Purple");
//        civic.setMaxSpeed(160);
//        civic.setYear(2020);
//        System.out.println(civic.getColor());
//        System.out.println(civic.getYear());
//        System.out.println(civic.getMaxSpeed());
        System.out.println(supra.accelerateSpeed());
        System.out.println(supra.decelerateSpeed());


    }
}
