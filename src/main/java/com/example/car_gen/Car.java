package com.example.car_gen;

public class Car {

    private String color;
    private int year;
    private int speed;
    private int maxSpeed;
    private boolean isElectric;

    public Car(String color, int year, int maxSpeed) {
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.speed = 50;
    }

    public String getColor() {return this.color;}
    public void setColor(String color) {this.color = color;}

    public int getYear() {return this.year;}
    public void setYear(int year) {this.year = year;}

    public int getSpeed() {return this.speed;}
    public void setSpeed(int speed) {this.speed = speed;}

    public int getMaxSpeed() {return this.maxSpeed;}
    public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}

    public boolean getIsElectric() {return this.isElectric;}
    public void setIsElectric(boolean isElectric) {this.isElectric = isElectric;}

    public int accelerateSpeed() {
        if (speed + 5 < maxSpeed) {
            speed += 5;
        }
        return speed;
    }

    public int decelerateSpeed() {
        if (speed - 5 > 0) {
            speed -= 5;
        }
        return speed;
    }

    public boolean convertToElectric() {
        if (isElectric) {
            System.out.println("The car is already electric...boogey whoogey whoogey!");
        } else {
            isElectric = true;
        }
        return isElectric;
    }


}
