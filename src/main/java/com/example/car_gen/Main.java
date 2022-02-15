package com.example.car_gen;

public class Main {

    public static void main(String[] args) {

        Honda civic = new Honda("White", 2002, 130, true);
        Lexus rx350 = new Lexus("Silver", 2017, 140, true);
        Toyota supra = new Toyota("Brazen Orange", 2002, 160, false);

//        System.out.println(civic.getColor());
//        System.out.println(rx350.getColor());
//        System.out.println(supra.getColor());
//        System.out.println(civic.accelerateSpeed());
//        System.out.println(civic.decelerateSpeed());
        civic.setIsElectric(false);
        System.out.println(civic.convertToElectric());
        civic.setSpeed(10);


    }
}
